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
@Document ( value = "contact_document" )
public class ContactDocument {

	public enum Type{
		BILLING,
		SHIPPING
	}

	@Id
	String contactId;

	Type type;

	String email;

	String phone;

	Boolean active = Boolean.TRUE;

}
