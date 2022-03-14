package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "payments" )
public class PaymentDocument {

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

	@MongoId
	String id;

	Type type;

	BigDecimal amount;

	Boolean isPaid;

	Boolean active;

}
