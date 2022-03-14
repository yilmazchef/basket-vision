package be.intec.vision.basket.models.responses;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
public class AddressResponse {

	public enum Type {
		BILLING,
		SHIPPING
	}

	String addressId;

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