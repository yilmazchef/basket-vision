package be.intec.vision.basket.models.responses;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
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
