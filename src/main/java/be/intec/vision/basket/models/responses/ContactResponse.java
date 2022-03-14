package be.intec.vision.basket.models.responses;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
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
