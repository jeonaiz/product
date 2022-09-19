package kg.megacom.product.mappers;

import kg.megacom.product.models.dto.PriceDto;
import kg.megacom.product.models.dto.request.ProductRequest;
import kg.megacom.product.models.entities.Price;
import org.mapstruct.factory.Mappers;

public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    Price productRequestToPrice(ProductRequest productRequest);

    PriceDto toPriceDto(Price price);
}
