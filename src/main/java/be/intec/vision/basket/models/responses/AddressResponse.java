package be.intec.vision.basket.models.responses;


import be.intec.vision.basket.models.documents.AddressDocument;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class AddressResponse {

	public enum Type {
		BILLING,
		SHIPPING,
		ALL
	}


	@MongoId
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

	String countryCode;
	//end
	String latitude;

	String longitude;
	String activation;

	Boolean active;
}