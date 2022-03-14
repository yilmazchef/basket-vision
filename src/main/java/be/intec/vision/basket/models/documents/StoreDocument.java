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
@Document ( value = "store_document" )
public class StoreDocument {

	public enum Type {
		ONLINE,
		PHYSICAL,
		ON_DEMAND
	}

	@Id
	String storeId;

	Type type;

	String name;

	String about;

	String activation;

	ContactDocument contact;

	AddressDocument address;

	Boolean active;

}
