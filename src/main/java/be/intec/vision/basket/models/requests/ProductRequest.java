package be.intec.vision.basket.models.requests;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRequest implements Serializable {


    public enum Type {
        SINGLE,
        COMBINED,
        FREE
    }

    Type type;

    String slug;

    String ean;

    String title;

    String description;

    Float quantity;

    String currency;

    @NonNull
    BigDecimal price;

    BigDecimal discount;

    BigDecimal deliveryCost;

    Set<MediaRequest> medias = new HashSet<>();

    public void addMedia( MediaRequest media ) {

        this.medias.add( media );
    }


    public void removeMedia( MediaRequest media ) {

        this.medias.remove( media );
    }



}
