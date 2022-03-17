package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Objects;
import java.util.UUID;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "addresses" )
public class AddressDocument {

	public enum Type {
		BILLING,
		SHIPPING,
		ALL
	}

	@MongoId
	String id;

	Type type= Type.ALL;
	//start
	String doorNo;

	String buildingNo;

	String street;

	String municipality;

	String postCode;

	String city;

	String region;

	String country;

	String countryCode;
	//end
	String latitude;

	String longitude;
	String activation= UUID.randomUUID().toString();

	Boolean active = Boolean.TRUE;
//toString -> alle fields hele adres


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof AddressDocument)) return false;
		AddressDocument that = (AddressDocument) o;
		return Objects.equals(getDoorNo(), that.getDoorNo()) && Objects.equals(getBuildingNo(), that.getBuildingNo()) && Objects.equals(getStreet(), that.getStreet()) && Objects.equals(getMunicipality(), that.getMunicipality()) && getPostCode().equals(that.getPostCode()) && getCity().equals(that.getCity()) && Objects.equals(getRegion(), that.getRegion()) && getCountry().equals(that.getCountry()) && getCountryCode().equals(that.getCountryCode());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDoorNo(), getBuildingNo(), getStreet(), getMunicipality(), getPostCode(), getCity(), getRegion(), getCountry(), getCountryCode());
	}

	@Override
	public String toString() {
		return Objects.requireNonNull(this.getStreet()) + " " +
				Objects.requireNonNull(this.getBuildingNo()) + " " +
				Objects.requireNonNull(this.getDoorNo()) + " " +
				Objects.requireNonNull(this.getPostCode()) + " " +
				Objects.requireNonNull(this.getMunicipality()) + " " +
				Objects.requireNonNull(this.getCity()) + " " +
				Objects.requireNonNull(this.getRegion()) + " " +
				Objects.requireNonNull(this.getCountry()) + ".";
	}
}