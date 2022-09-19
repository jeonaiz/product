package kg.megacom.product.models.dto.responses;

import kg.megacom.product.models.dto.CategoryDto;
import kg.megacom.product.models.dto.DiscountDto;
import kg.megacom.product.models.dto.PriceDto;
import kg.megacom.product.models.dto.ProductDto;
import kg.megacom.product.models.entities.Product;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponse {
   ProductDto product;
   CategoryDto category;
   PriceDto price;
   DiscountDto discount;

}
