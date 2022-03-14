package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@EqualsAndHashCode ( of = { "productId" } )
@Document ( value = "product_document" )
public class ProductDocument {

	public enum Type {
		SINGLE,
		COMBINED,
		FREE
	}

	@Id
	String productId;

	Type type;

	String slug;

	String ean;

	String title;

	String description;

	Float quantity;

	String currency = "EUR";

	BigDecimal price;

	BigDecimal tax;

	BigDecimal discount;

	Set< MediaDocument > medias = new HashSet<>();

	Boolean active;

}
