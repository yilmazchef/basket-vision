package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@EqualsAndHashCode ( of = { "_id", "ean"} )
@Document ( value = "products" )
public class ProductDocument {

	public enum Type {
		SINGLE,
		COMBINED,
		FREE
	}

	@MongoId
	String id;

	Type type;

	String slug;

	String ean;

	String title;

	String description;

	Float quantity;

	String currency = "EUR";

	BigDecimal price;


	BigDecimal discount;
	BigDecimal deliveryCost;

	Set< MediaDocument > medias = new HashSet<>();

	Boolean active;

}
