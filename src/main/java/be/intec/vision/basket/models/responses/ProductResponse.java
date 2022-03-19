package be.intec.vision.basket.models.responses;


import be.intec.vision.basket.models.documents.MediaDocument;
import be.intec.vision.basket.models.documents.ProductDocument;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mongodb.lang.NonNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResponse implements Serializable {

    public enum Type {
        SINGLE,
        COMBINED,
        FREE
    }

    String id;

    Type type;

    String slug;

    String ean;

    String title;

    String description;

    Float quantity;

    String currency;

    BigDecimal price;

    BigDecimal tax;

    BigDecimal discount;

    BigDecimal deliveryCost;

    Set<MediaResponse> medias = new HashSet<>();

    public void addMedia (MediaResponse media ) {

		this.medias.add (media);
	}

    public void removeMedia (MediaResponse media ) {

		this.medias.remove(media);
	}

    Boolean active;

}
