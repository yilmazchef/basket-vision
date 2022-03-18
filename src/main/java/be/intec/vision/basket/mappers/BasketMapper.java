package be.intec.vision.basket.mappers;


import be.intec.vision.basket.models.documents.*;
import be.intec.vision.basket.models.requests.*;
import be.intec.vision.basket.models.responses.*;
import org.mapstruct.*;

@Mapper ( componentModel = "spring", collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS )
public interface BasketMapper {

	/*
	 * BASKET MAPPERS
	 */


	@Mapping ( target = "updatedAt", ignore = true )
	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "createdAt", ignore = true )
	@Mapping ( target = "active", ignore = true )
	BasketDocument toDocument( BasketRequest source );


	@Mapping ( target = "updatedAt", ignore = true )
	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "createdAt", ignore = true )
	@Mapping ( target = "active", ignore = true )
	BasketDocument toDocument( BasketRequest source, @MappingTarget BasketDocument target );


	BasketResponse toResponse( BasketDocument source );

	/*
	 * ADDRESS MAPPERS
	 */

	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "active", ignore = true )

	AddressDocument toDocument( AddressRequest source );

	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "active", ignore = true )

	AddressDocument toDocument( AddressRequest source, @MappingTarget AddressDocument target );


	AddressResponse toResponse( AddressDocument source );


	/*
	 * CONTACT MAPPERS
	 */

	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "active", ignore = true )

	ContactDocument toDocument( ContactRequest source );

	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "active", ignore = true )

	ContactDocument toDocument( ContactRequest source, @MappingTarget ContactDocument target );


	ContactResponse toResponse( ContactDocument source );

	/*
	 * CUSTOMER MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )

	CustomerDocument toDocument( CustomerRequest source );

	@Mapping ( target = "active", ignore = true )

	CustomerDocument toDocument( CustomerRequest source, @MappingTarget CustomerDocument target );


	CustomerResponse toResponse( CustomerDocument source );

	/*
	 * MEDIA MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )

	MediaDocument toDocument( MediaRequest source );

	@Mapping ( target = "active", ignore = true )

	MediaDocument toDocument( MediaRequest source, @MappingTarget MediaDocument target );


	MediaResponse toResponse( MediaDocument source );

	/*
	 * PAYMENT MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )

	PaymentDocument toDocument( PaymentRequest source );

	@Mapping ( target = "active", ignore = true )

	PaymentDocument toDocument( PaymentRequest source, @MappingTarget PaymentDocument target );


	PaymentResponse toResponse( PaymentDocument source );


	/*
	 * PRODUCT MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )

	ProductDocument toDocument( ProductRequest source );

	@Mapping ( target = "active", ignore = true )

	ProductDocument toDocument( ProductRequest source, @MappingTarget ProductDocument target );


	ProductResponse toResponse( ProductDocument source );

	/*
	 * STORE MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )

	StoreDocument toDocument( StoreRequest source );

	@Mapping ( target = "active", ignore = true )

	StoreDocument toDocument( StoreRequest source, @MappingTarget StoreDocument target );


	StoreResponse toResponse( StoreDocument source );

	/*
	 * TOKEN MAPPERS
	 */

	//@Mapping ( target = "active", ignore = true )

	//TokenDocument toDocument( TokenRequest source );

	//@Mapping ( target = "active", ignore = true )

	//TokenDocument toDocument( TokenRequest source, @MappingTarget TokenDocument target );


	//TokenResponse toResponse( TokenDocument source );

}
