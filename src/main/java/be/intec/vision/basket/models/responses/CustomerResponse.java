package be.intec.vision.basket.models.responses;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
public class CustomerResponse {

	public enum Gender {
		MALE,
		FEMALE,
		OTHER
	}

	String customerId;

	String title;

	String firstName;

	String lastName;

	LocalDate dateOfBirth;

	Gender gender;

	Set< TokenResponse > tokens;

	String activation;

	Set< AddressResponse > addresses = new HashSet<>();

	Set< ContactResponse > contacts = new HashSet<>();

	Boolean active;

}
