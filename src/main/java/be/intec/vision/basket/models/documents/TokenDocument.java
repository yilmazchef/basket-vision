package be.intec.vision.basket.models.documents;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.validation.constraints.FutureOrPresent;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Entity
public class TokenDocument implements Serializable {

	@Id
	Long id;

	@NonNull
	String hashValue;

	@FutureOrPresent
	LocalDateTime createdAt;

	@FutureOrPresent
	LocalDateTime updatedAt;

	Boolean active = Boolean.TRUE;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TokenDocument)) return false;
		TokenDocument that = (TokenDocument) o;
		return Objects.equals(getId(), that.getId()) && getHashValue().equals(that.getHashValue());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getHashValue());
	}

	@Override
	public String toString() {
		return this.getHashValue();
	}
}
