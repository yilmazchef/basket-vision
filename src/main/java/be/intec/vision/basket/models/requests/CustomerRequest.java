package be.intec.vision.basket.models.requests;


import be.intec.vision.basket.models.documents.AddressDocument;
import be.intec.vision.basket.models.documents.ContactDocument;
import be.intec.vision.basket.models.documents.TokenDocument;
import be.intec.vision.basket.models.responses.CustomerResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerRequest implements Serializable {


    public enum Type {
        INDIVIDUAL, COMPANY
    }


    Type type;

    String company;

    String title;

    @NonNull
    String firstName;

    @NonNull
    String lastName;

    LocalDate dateOfBirth;

    Set<TokenRequest> tokens = new HashSet<>();

    public void addToken( TokenRequest token ) {

        this.tokens.add( token );
    }


    public void removeToken(  TokenRequest token ) {

        this.tokens.remove(token );
    }

    String activation;

    Set<AddressRequest> addresses = new HashSet<>();

    public void addAddress( AddressRequest address ) {

        this.addresses.add( address );
    }


    public void removeAddress( AddressRequest address  ) {

        this.addresses.remove( address );
    }

    Set<ContactRequest> contacts = new HashSet<>();

    public void addContact( ContactRequest contact ) {

        this.contacts.add( contact );
    }


    public void removeContact( ContactRequest contact ) {

        this.contacts.remove( contact );
    }


}
