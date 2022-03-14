package be.intec.vision.basket.mappers;


import be.intec.vision.basket.models.documents.BasketDocument;
import be.intec.vision.basket.models.requests.BasketRequest;
import be.intec.vision.basket.models.responses.BasketResponse;
import org.mapstruct.*;

import java.util.List;

@Mapper (
		componentModel = "spring",
		collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
		nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface BasketMapper {

	@Mapping ( target = "updatedAt", ignore = true )
	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "createdAt", ignore = true )
	@Mapping ( target = "basketId", ignore = true )
	@Mapping ( target = "active", ignore = true )
	BasketDocument toDocument( BasketRequest source );

	@Mapping ( target = "updatedAt", ignore = true )
	@Mapping ( target = "type", ignore = true )
	@Mapping ( target = "createdAt", ignore = true )
	@Mapping ( target = "basketId", ignore = true )
	@Mapping ( target = "active", ignore = true )
	BasketDocument toDocument( BasketRequest source, @MappingTarget BasketDocument target );

	BasketResponse toResponse( BasketDocument source );

	List< BasketResponse > toResponses( List< BasketDocument > source );

}
