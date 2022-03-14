package be.intec.vision.basket.models.requests;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class PaymentRequest {

	String paymentId;

	public enum Type {
		CASH,
		CREDIT_CARD,
		DEBIT_CARD,
		PREPAID_CARD,
		PAYPAL,
		APPLE_WALLET,
		GOOGLE_PAY,
		PAYPAL_GUEST_CHECKOUT,
		KLARNA
	}

	Type type;

	BigDecimal amount;

	Boolean isPaid;

}
