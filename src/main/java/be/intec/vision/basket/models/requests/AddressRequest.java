package be.intec.vision.basket.models.requests;


import be.intec.vision.basket.models.responses.AddressResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class AddressRequest {

	public enum Type {
		BILLING,
		SHIPPING,
		ALL
	}

	@MongoId
	String id;

	AddressResponse.Type type;

	String doorNo;

	String buildingNo;

	String street;

	String municipality;

	String postCode;

	String city;

	String region;

	String country;

	String countryCode;
	//end
	String latitude;

	String longitude;
	String activation;

	Boolean active;

}