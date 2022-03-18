package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(value = "customers")
public class CustomerDocument {


    public enum Type {
        INDIVIDUAL, COMPANY
    }

    @Id
    String id;

    Type type=Type.INDIVIDUAL;

    String company;

    String title;

    @NonNull
    String firstName;

    @NonNull
    String lastName;

    LocalDate dateOfBirth;

    Set<TokenDocument> tokens = new HashSet<>();

    String activation= UUID.randomUUID().toString();

    Set<AddressDocument> addresses = new HashSet<>();

    public void addAddress( AddressDocument adress ) {

        this.addresses.add( adress );
    }


    public void removeAddress( AddressDocument adress ) {

        this.addresses.remove( adress );
    }

    Set<ContactDocument> contacts = new HashSet<>();

    public void addAContact( ContactDocument contact ) {

        this.contacts.add( contact );
    }


    public void removeContact( ContactDocument contact ) {

        this.contacts.remove( contact );
    }


    Boolean active = Boolean.TRUE;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerDocument)) return false;
        CustomerDocument that = (CustomerDocument) o;
        return Objects.equals(getId(), that.getId()) && getFirstName().equals(that.getFirstName()) && getLastName().equals(that.getLastName()) && getDateOfBirth().equals(that.getDateOfBirth()) && getContacts().equals(that.getContacts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getDateOfBirth(), getContacts());
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
