package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "customers" )
public class CustomerDocument {

	public enum Gender {
		MALE,
		FEMALE,
		OTHER
	}

	@Id
	String _id;

	@NonNull
	String title;

	@NonNull
	String firstName;

	@NonNull
	String lastName;

	LocalDate dateOfBirth;

	Gender gender;

	Set<TokenDocument> tokens;

	String activation;

	Set< AddressDocument > addresses = new HashSet<>();

	Set< ContactDocument > contacts = new HashSet<>();


	Boolean active;

}
