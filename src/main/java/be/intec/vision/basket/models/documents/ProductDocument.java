package be.intec.vision.basket.models.documents;


import com.mongodb.lang.NonNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "products" )
public class ProductDocument {

	public enum Type {
		SINGLE,
		COMBINED,
		FREE
	}

	@Id
	@Field ( "_id" )
	String id;

	Type type = Type.SINGLE;

	String slug;

	String ean;

	String title;

	String description;

	Float quantity = 1.0f;

	String currency = "EUR";
	@NonNull
	BigDecimal price;

	BigDecimal discount = BigDecimal.ZERO;

	BigDecimal deliveryCost = BigDecimal.ZERO;


	BigDecimal tax = BigDecimal.ZERO;


	Set< MediaDocument > medias = new HashSet<>();


	public void addMedia( MediaDocument media ) {

		this.medias.add( media );
	}


	public void removeMedia( MediaDocument media ) {

		this.medias.remove( media );
	}


	Boolean active = Boolean.TRUE;


	@Override
	public boolean equals( Object o ) {

		if ( this == o ) {
			return true;
		}
		if ( ! ( o instanceof ProductDocument ) ) {
			return false;
		}
		ProductDocument that = ( ProductDocument ) o;
		return Objects.equals( getId(), that.getId() ) && getSlug().equals( that.getSlug() ) && Objects.equals( getEan(), that.getEan() );
	}


	@Override
	public int hashCode() {

		return Objects.hash( getId(), getSlug(), getEan() );
	}


	@Override
	public String toString() {

		if ( this.ean != null ) {
			return this.getEan();

		}
		return this.getSlug();

	}

}
