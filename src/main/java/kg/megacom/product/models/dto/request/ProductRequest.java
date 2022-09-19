package kg.megacom.product.models.dto.request;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductRequest {
    Long productId;
    String name;
    double price;
    int percent;
    Long categoryId;

}
