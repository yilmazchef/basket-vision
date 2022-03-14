package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "addresses" )
public class AddressDocument {

	public enum Type {
		BILLING,
		SHIPPING
	}

	@Id
	String _id;

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

	String latitude;

	String longitude;

	Boolean active = Boolean.TRUE;


}