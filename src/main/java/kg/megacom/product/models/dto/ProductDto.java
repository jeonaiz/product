package kg.megacom.product.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDto {

    Long id;

    String title;

    CategoryDto category;

}
