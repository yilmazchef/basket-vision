package be.intec.vision.basket.models.requests;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class BasketRequest {

	String basketId;

	public enum Type {
		SHOPPING_CART,
		WISH_LIST
	}

	String session;

	CustomerRequest customer;

	StoreRequest store;

	BigDecimal totalPrice;
	BigDecimal totalTax;
	BigDecimal totalDiscount;

	Set< ProductRequest > products = new LinkedHashSet<>();
	Set< PaymentRequest > payments = new LinkedHashSet<>();

}
