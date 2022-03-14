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

	Boolean existsBy_id( final @NotNull String basketId );

	Boolean existsBySessionAnd_id( final @NotNull String session, final String basketId );

	Boolean existsBySessionAndCustomer__idAndStore__id( final @NotNull String session, final String customer_customerId, final String store_storeId );

	Boolean existsBySessionAndStore__id( final @NotNull String session, final @NotNull String store_storeId );

	BasketDocument findByStore__id( final @NotNull String store_storeId );

	List< BasketDocument > findBySession( final @NotNull String session );

	List< BasketDocument > findAllByCustomer__id( final String customer_customerId );

	Page< BasketDocument > findAllByCustomer__id( final String customer_customerId, final Pageable pageable );

	List< BasketDocument > findAllByStore__id( final String store_storeId );

	Page< BasketDocument > findAllByStore__id( final String store_storeId, final Pageable pageable );

	List< BasketDocument > findAllByCustomer__idAndStore__id( final String customer_customerId, final String store_storeId );

	Page< BasketDocument > findAllByCustomer__idAndStore__id( final String customer_customerId, final String store_storeId, final Pageable pageable );

	BasketDocument getByCustomer__idAndStore__id( final String customer_customerId, final String store_storeId );

	BasketDocument getBySessionAndStore__id( final @NotNull String session, final String store_storeId );

	BasketDocument getBySession( final @NotNull String session );

	Optional< BasketDocument > findBySessionAndStore__id( final @NotNull String session, final String store_storeId );

}
