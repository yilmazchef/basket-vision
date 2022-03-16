package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "customers" )
public class CustomerDocument {



	@MongoId
	String id;

	@NonNull
	String title;

	@NonNull
	String firstName;

	@NonNull
	String lastName;

	LocalDate dateOfBirth;


	Set<TokenDocument> tokens;

	String activation;

	Set< AddressDocument > addresses = new HashSet<>();

	Set< ContactDocument > contacts = new HashSet<>();


	Boolean active;

}
