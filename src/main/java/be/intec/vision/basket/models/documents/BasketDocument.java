package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "basket_document" )
public class BasketDocument {

	public enum Type {
		SHOPPING_CART,
		WISH_LIST
	}

	@Id
	String basketId;

	Type type;

	@NotNull
	String session;

	CustomerDocument customer;

	StoreDocument store;

	BigDecimal totalPrice;
	BigDecimal totalTax;
	BigDecimal totalDiscount;

	Set< ProductDocument > products = new LinkedHashSet<>();
	Set< PaymentDocument > payments = new LinkedHashSet<>();

	@CreatedDate
	LocalDateTime createdAt; //expiration time 30m

	@LastModifiedDate
	LocalDateTime updatedAt;

	Boolean active = Boolean.TRUE;

	{
		if ( ! products.isEmpty() ) {
			setTotalPrice();
		}
	}

	public void setTotalPrice() {

		totalPrice = products.stream()
				.map( product -> product.getPrice() )
				.reduce( BigDecimal.ZERO, BigDecimal :: add );
	}


}
