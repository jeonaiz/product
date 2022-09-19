package kg.megacom.product.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)

public class CategoryDto {
    Long id;
    String title;
    boolean active;
}
