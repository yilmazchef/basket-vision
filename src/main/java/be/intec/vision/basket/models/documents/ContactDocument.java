package be.intec.vision.basket.models.documents;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ContactDocument  implements Serializable {

    public enum Type {
        BILLING,
        SHIPPING,
        ALL
    }

    @Id
    Long id;

    Type type = Type.ALL;
    @NonNull
    @Email
    String email;
    @NonNull
    @Min(9)
    @Max(15)
    String phone;
    String activation = UUID.randomUUID().toString();

    Boolean active = Boolean.TRUE;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactDocument)) return false;
        ContactDocument that = (ContactDocument) o;
        return Objects.equals(getId(), that.getId()) && getEmail().equals(that.getEmail()) && getPhone().equals(that.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmail(), getPhone());
    }

    @Override
    public String toString() {
        if (this.getEmail() != null) {
            return this.getEmail();
        } else if (this.getPhone() != null) {
            return this.getPhone();
        } else {
            return "No such contact! ";
        }

    }
}
