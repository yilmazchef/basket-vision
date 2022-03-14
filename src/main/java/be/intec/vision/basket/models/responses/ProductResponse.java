package be.intec.vision.basket.models.responses;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class ProductResponse {

	public enum Type {
		SINGLE,
		COMBINED,
		FREE
	}

	String productId;

	Type type;

	String slug;

	String ean;

	String title;

	String description;

	Float quantity;

	String currency;

	BigDecimal price;

	BigDecimal tax;

	BigDecimal discount;

	Set< MediaResponse > medias = new HashSet<>();

	Boolean active;

}
