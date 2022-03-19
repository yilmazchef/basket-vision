package be.intec.vision.basket.models.documents;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Entity
public class StoreDocument implements Serializable {


	@Id
	Long id;
	@NonNull
	String name;

	String about;

	@ManyToOne
	@JoinColumn(name = "contact_id")
	ContactDocument contact;

	@ManyToOne
	@JoinColumn(name = "address_id")
	AddressDocument address;

	Boolean active=Boolean.TRUE;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof StoreDocument)) return false;
		StoreDocument that = (StoreDocument) o;
		return Objects.equals(getId(), that.getId()) && getName().equals(that.getName()) && getAddress().equals(that.getAddress());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getAddress());
	}

	@Override
	public String toString() {
		return this.getName();
	}
}
