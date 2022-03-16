package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "baskets" )
public class BasketDocument {

	public enum Type {
		SHOPPING_CART,
		WISH_LIST
	}

	@MongoId
	String id;

	Type type;

	String session;

	CustomerDocument customer;

	StoreDocument store;

	@Transient
	BigDecimal totalPrice = ( this.products != null ) ?
			this.products.stream()
					.filter( Objects :: nonNull )
					.map( product -> product.getPrice() )
					.reduce( BigDecimal.ZERO, BigDecimal :: add ) :
			BigDecimal.ZERO;

	@Transient
	BigDecimal totalTax = ( this.products != null ) ?
			this.products.stream()
					.filter( Objects :: nonNull )
					.map( product -> product.getTax() )
					.reduce( BigDecimal.ZERO, BigDecimal :: add ) :
			BigDecimal.ZERO;

	@Transient
	BigDecimal totalDiscount = ( this.products != null ) ?
			this.products.stream()
					.filter( Objects :: nonNull )
					.map( product -> product.getDiscount() )
					.reduce( BigDecimal.ZERO, BigDecimal :: add ) :
			BigDecimal.ZERO;

	@Transient
			BigDecimal deliveryCost= ( this.products != null ) ?
			this.products.stream()
					.filter( Objects :: nonNull )
					.map( product -> product.getDeliveryCost() )
					.reduce( BigDecimal.ZERO, BigDecimal :: add ) :
			BigDecimal.ZERO;

	Set< ProductDocument > products = new LinkedHashSet<>();


	public void addProduct( ProductDocument product ) {

		this.products.add( product );
	}


	public void removeProduct( ProductDocument product ) {

		this.products.remove( product );
	}


	Set< PaymentDocument > payments = new LinkedHashSet<>();


	public void addPayment( PaymentDocument product ) {

		this.payments.add( product );
	}


	public void removePayment( PaymentDocument product ) {

		this.payments.remove( product );
	}


	@CreatedDate
	LocalDateTime createdAt; //expiration time 30m

	@LastModifiedDate
	LocalDateTime updatedAt;

	Boolean active = Boolean.TRUE;


}
