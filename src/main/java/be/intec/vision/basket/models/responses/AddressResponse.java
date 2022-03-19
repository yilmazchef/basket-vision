package be.intec.vision.basket.models.responses;


import be.intec.vision.basket.models.documents.AddressDocument;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResponse implements Serializable {

    public enum Type {
        BILLING,
        SHIPPING,
        ALL
    }

    String id;

    Type type;

    String doorNo;

    String buildingNo;

    String street;

    String municipality;

    String postCode;

    String city;

    String region;

    String country;

    String latitude;

    String longitude;
    String activation;

    Boolean active;
}