package be.intec.vision.basket.models.responses;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
public class StoreResponse {

	public enum Type {
		ONLINE,
		PHYSICAL,
		ON_DEMAND
	}

	String storeId;

	Type type;

	String name;

	String about;

	String activation;

	ContactResponse contact;

	AddressResponse address;

	Boolean active;

}
