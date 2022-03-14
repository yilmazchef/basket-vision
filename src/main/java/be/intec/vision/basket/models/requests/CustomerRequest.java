package be.intec.vision.basket.models.requests;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class CustomerRequest {

	String customerId;

	public enum Gender {
		MALE,
		FEMALE,
		OTHER
	}

	@NonNull
	String title;

	@NonNull
	String firstName;

	@NonNull
	String lastName;

	Gender gender;

	LocalDate dateOfBirth;

	Set< TokenRequest > tokens;

	String activation;

	Set< AddressRequest > addresses = new HashSet<>();

	Set< ContactRequest > contacts = new HashSet<>();


	Boolean active;

}
