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

	@Mapping ( target = "_id", source = "basketId" )
	@Mapping ( target = "updatedAt", ignore = true )
	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "createdAt", ignore = true )
	@Mapping ( target = "active", ignore = true )
	BasketDocument toDocument( BasketRequest source );

	@Mapping ( target = "_id", source = "basketId" )
	@Mapping ( target = "updatedAt", ignore = true )
	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "createdAt", ignore = true )
	@Mapping ( target = "active", ignore = true )
	BasketDocument toDocument( BasketRequest source, @MappingTarget BasketDocument target );

	@Mapping ( target = "basketId", source = "_id" )
	BasketResponse toResponse( BasketDocument source );

	/*
	 * ADDRESS MAPPERS
	 */

	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "addressId" )
	AddressDocument toDocument( AddressRequest source );

	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "addressId" )
	AddressDocument toDocument( AddressRequest source, @MappingTarget AddressDocument target );

	@Mapping ( target = "addressId", source = "_id" )
	AddressResponse toResponse( AddressDocument source );


	/*
	 * CONTACT MAPPERS
	 */

	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "contactId" )
	ContactDocument toDocument( ContactRequest source );

	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "contactId" )
	ContactDocument toDocument( ContactRequest source, @MappingTarget ContactDocument target );

	@Mapping ( target = "contactId", source = "_id" )
	ContactResponse toResponse( ContactDocument source );

	/*
	 * CUSTOMER MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "customerId" )
	CustomerDocument toDocument( CustomerRequest source );

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "customerId" )
	CustomerDocument toDocument( CustomerRequest source, @MappingTarget CustomerDocument target );

	@Mapping ( target = "customerId", source = "_id" )
	CustomerResponse toResponse( CustomerDocument source );

	/*
	 * MEDIA MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "mediaId" )
	MediaDocument toDocument( MediaRequest source );

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "mediaId" )
	MediaDocument toDocument( MediaRequest source, @MappingTarget MediaDocument target );

	@Mapping ( target = "mediaId", source = "_id" )
	MediaResponse toResponse( MediaDocument source );

	/*
	 * PAYMENT MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "paymentId" )
	PaymentDocument toDocument( PaymentRequest source );

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "paymentId" )
	PaymentDocument toDocument( PaymentRequest source, @MappingTarget PaymentDocument target );

	@Mapping ( target = "paymentId", source = "_id" )
	PaymentResponse toResponse( PaymentDocument source );


	/*
	 * PRODUCT MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "productId" )
	ProductDocument toDocument( ProductRequest source );

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "productId" )
	ProductDocument toDocument( ProductRequest source, @MappingTarget ProductDocument target );

	@Mapping ( target = "productId", source = "_id" )
	ProductResponse toResponse( ProductDocument source );

	/*
	 * STORE MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "storeId" )
	StoreDocument toDocument( StoreRequest source );

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "storeId" )
	StoreDocument toDocument( StoreRequest source, @MappingTarget StoreDocument target );

	@Mapping ( target = "storeId", source = "_id" )
	StoreResponse toResponse( StoreDocument source );

	/*
	 * TOKEN MAPPERS
	 */

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "tokenId" )
	TokenDocument toDocument( TokenRequest source );

	@Mapping ( target = "active", ignore = true )
	@Mapping ( target = "_id", source = "tokenId" )
	TokenDocument toDocument( TokenRequest source, @MappingTarget TokenDocument target );

	@Mapping ( target = "tokenId", source = "_id" )
	TokenResponse toResponse( TokenDocument source );

}
