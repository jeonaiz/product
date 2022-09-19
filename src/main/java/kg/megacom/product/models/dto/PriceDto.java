package kg.megacom.product.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceDto {
    Long id;

    double price;

    @JsonFormat(pattern = "dd.MM.yyyy")
    Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date endDate;
    ProductDto product;
}
