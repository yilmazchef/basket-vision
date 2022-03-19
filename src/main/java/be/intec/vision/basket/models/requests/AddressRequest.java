package be.intec.vision.basket.models.requests;


import be.intec.vision.basket.models.responses.AddressResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressRequest {


    public enum Type implements Serializable {
        BILLING,
        SHIPPING,
        ALL
    }

    Type type;

    String doorNo;

    @NonNull
    String buildingNo;

    @NonNull
    String street;

    String municipality;

    @NonNull
    String postCode;

    @NonNull
    String city;

    String region;

    @NonNull
    String country;


}