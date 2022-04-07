package be.intec.vision.basket.models.responses;


import be.intec.vision.basket.models.documents.AddressDocument;
import be.intec.vision.basket.models.documents.ContactDocument;
import be.intec.vision.basket.models.documents.CustomerDocument;
import be.intec.vision.basket.models.documents.TokenDocument;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerResponse {

    public enum Type {
        INDIVIDUAL, COMPANY
    }




    Type type;

    String company;

    String title;


    String firstName;


    String lastName;

    LocalDate dateOfBirth;

    Set<TokenResponse> tokens;

    String activation;

    Set<AddressResponse> addresses = new HashSet<>();

    public void addAddress (AddressResponse address ) {

		this.addresses.add( address );
	}

    public void removeAddress (AddressResponse address ) {

		this.addresses.remove( address );
	}

    Set<ContactResponse> contacts = new HashSet<>();

    public void addContact (ContactResponse contact ) {

		this.contacts.add (contact);
	}

    public void removeContact (ContactResponse contact ) {

		this.contacts.remove(contact);
	}

    Boolean active;

}
