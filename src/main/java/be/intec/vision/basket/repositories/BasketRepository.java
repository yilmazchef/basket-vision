package be.intec.vision.basket.repositories;


import be.intec.vision.basket.models.documents.BasketDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Repository
public interface BasketRepository extends MongoRepository< BasketDocument, String > {

	Boolean existsBySession( final @NotNull String session );

	Boolean existsByBasketId( final @NotNull String basketId );

	Boolean existsBySessionAndBasketId( final @NotNull String session, final String basketId );

	Boolean existsBySessionAndCustomer_customerIdAndStore_StoreId( final @NotNull String session, final String customer_customerId, final String store_storeId );

	Boolean existsBySessionAndStore_StoreId( final @NotNull String session, final @NotNull String store_storeId );

	BasketDocument findByStore_StoreId( final @NotNull String store_storeId );

	List< BasketDocument > findBySession( final @NotNull String session );

	List< BasketDocument > findAllByCustomer_CustomerId( final String customer_customerId );

	Page< BasketDocument > findAllByCustomer_CustomerId( final String customer_customerId, final Pageable pageable );

	List< BasketDocument > findAllByStore_StoreId( final String store_storeId );

	Page< BasketDocument > findAllByStore_StoreId( final String store_storeId, final Pageable pageable );

	List< BasketDocument > findAllByCustomer_CustomerIdAndStore_StoreId( final String customer_customerId, final String store_storeId );

	Page< BasketDocument > findAllByCustomer_CustomerIdAndStore_StoreId( final String customer_customerId, final String store_storeId, final Pageable pageable );

	BasketDocument getByCustomer_CustomerIdAndStore_StoreId( final String customer_customerId, final String store_storeId );

	BasketDocument getBySessionAndStore_StoreId( final @NotNull String session, final String store_storeId );

	BasketDocument getBySession( final @NotNull String session );

	Optional< BasketDocument > findBySessionAndStore_StoreId( final @NotNull String session, final String store_storeId );

}
