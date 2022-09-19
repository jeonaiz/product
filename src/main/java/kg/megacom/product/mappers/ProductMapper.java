package kg.megacom.product.mappers;

import kg.megacom.product.models.dto.request.ProductRequest;
import kg.megacom.product.models.entities.Product;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "name", target = "title")
    Product productRequestToProduct(ProductRequest productRequest);
}
