package be.intec.vision.basket.models.responses;


import be.intec.vision.basket.models.documents.ContactDocument;
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
public class ContactResponse {



	public enum Type {
		BILLING,
		SHIPPING,
		ALL
	}

	@MongoId
	String id;

	Type type;

	String email;

	String phone;
	String activation;

	Boolean active;

}
