package be.intec.vision.basket.repositories;


import be.intec.vision.basket.models.documents.BasketDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Repository
public interface BasketRepository extends JpaRepository< BasketDocument,Long> {

	Boolean existsBySession( final @NotNull String session );

	Boolean existsBySessionAndId( final @NotNull String session, final Long basketId );

	Boolean existsBySessionAndCustomer_IdAndStore_Id( final @NotNull String session, final Long customerId, final String store_storeId );

	Boolean existsBySessionAndStore_Id( final @NotNull String session, final @NotNull Long storeId );

	BasketDocument findByStore_Id( final @NotNull Long storeId );

	List< BasketDocument > findBySession( final @NotNull String session );

	List< BasketDocument > findAllByCustomer_Id( final Long customerId );

	Page< BasketDocument > findAllByCustomer_Id( final Long customerId, final Pageable pageable );

	List< BasketDocument > findAllByStore_Id( final Long storeId );

	Page< BasketDocument > findAllByStore_Id( final Long storeId, final Pageable pageable );

	List< BasketDocument > findAllByCustomer_IdAndStore_Id( final Long customerId, final Long storeId );

	Page< BasketDocument > findAllByCustomer_IdAndStore_Id( final Long customerId, final Long storeId, final Pageable pageable );

	BasketDocument getByCustomer_IdAndStore_Id( final Long customerId, final Long storeId );

	BasketDocument getBySessionAndStore_Id( final @NotNull String session, final Long storeId );

	BasketDocument getBySession( final @NotNull String session );

	Optional< BasketDocument > findBySessionAndStore_Id( final @NotNull String session, final Long storeId );

}
