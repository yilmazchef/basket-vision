package be.intec.vision.basket.models.responses;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
public class ContactResponse {

	public enum Type{
		BILLING,
		SHIPPING
	}

	String contactId;

	Type type;

	String email;

	String phone;

	Boolean active = Boolean.TRUE;

}
