package be.intec.vision.basket.models.requests;


import be.intec.vision.basket.models.documents.CustomerDocument;
import be.intec.vision.basket.models.documents.PaymentDocument;
import be.intec.vision.basket.models.documents.ProductDocument;
import be.intec.vision.basket.models.documents.StoreDocument;
import be.intec.vision.basket.models.responses.BasketResponse;
import be.intec.vision.basket.models.responses.PaymentResponse;
import be.intec.vision.basket.models.responses.ProductResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class BasketRequest implements Serializable {


	public enum Type {
		SHOPPING_CART,
		WISH_LIST
	}

	Type type;

	String session;

	CustomerRequest customer;

	StoreRequest store;

	BigDecimal totalPrice;
	BigDecimal totalTax;
	BigDecimal totalDiscount;

	Set<ProductRequest> products = new LinkedHashSet<>();

	public void addProduct( ProductRequest product ) {

		this.products.add( product );
	}


	public void removeProduct( ProductRequest product ) {

		this.products.remove( product );
	}

	Set<PaymentRequest> payments = new LinkedHashSet<>();

	public void addPayment( PaymentRequest payment ) {

		this.payments.add( payment );
	}


	public void removePayment( PaymentRequest payment ) {

		this.payments.remove( payment );
	}

	LocalDateTime createdAt; //expiration time 30m

	LocalDateTime updatedAt;

	Boolean active ;

}
