package be.intec.vision.basket.models.responses;


import be.intec.vision.basket.models.documents.BasketDocument;
import be.intec.vision.basket.models.documents.CustomerDocument;
import be.intec.vision.basket.models.documents.StoreDocument;
import be.intec.vision.basket.models.requests.PaymentRequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BasketResponse implements Serializable {

    public enum Type {
        SHOPPING_CART,
        WISH_LIST
    }

    String id;

    Type type;

    String session;

    CustomerResponse customer;

    StoreResponse store;

    BigDecimal totalPrice;
    BigDecimal totalTax;
    BigDecimal totalDiscount;

    Set<ProductResponse> products = new LinkedHashSet<>();

    public void addProduct( ProductResponse product ) {

		this.products.add( product );
	}


	public void removeProduct( ProductResponse product ) {

		this.products.remove( product );
	}

    Set<PaymentResponse> payments = new LinkedHashSet<>();

    public void addPayment( PaymentResponse product ) {

		this.payments.add( product );
	}


	public void removePayment( PaymentResponse product ) {

		this.payments.remove( product );
	}

    LocalDateTime createdAt; //expiration time 30m

    LocalDateTime updatedAt;

    Boolean active;

}
