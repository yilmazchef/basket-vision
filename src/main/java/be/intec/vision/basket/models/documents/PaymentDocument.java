package be.intec.vision.basket.models.documents;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Entity
public class PaymentDocument implements Serializable {

	public enum Type {
		CASH,
		CREDIT_CARD,
		DEBIT_CARD,
		PREPAID_CARD,
		PAYPAL,
		PAYPAL_GUEST_CHECKOUT,
		AMAZON_PAY,
		BANK_TRANSFER,
		APPLE_WALLET,
		GOOGLE_PAY,
		KLARNA,
		GIFTCARD,
		BITCOIN,
		ETHEREUM,
		COD,
	    AMERICAN_EXPRESS,
		UNION_PAY,
		QIWI,
		SKRILL

	}

	@Id
	Long id;

	Type type=Type.PAYPAL;

	BigDecimal amount=BigDecimal.ZERO;

	Boolean isPaid=Boolean.FALSE;

	Boolean active=Boolean.TRUE;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof PaymentDocument)) return false;
		PaymentDocument that = (PaymentDocument) o;
		return Objects.equals(getId(), that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {

		return this.getType() + " " + this.getAmount();
	}
}
