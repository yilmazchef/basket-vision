package be.intec.vision.basket.models.requests;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class ProductRequest {

	String productId;

	public enum Type {
		SINGLE,
		COMBINED,
		FREE
	}

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

	Set< MediaRequest > medias = new HashSet<>();

}
