package kg.megacom.product.services;

import kg.megacom.product.models.dto.request.ProductRequest;
import kg.megacom.product.models.dto.responses.ProductResponse;

public interface ProductService {
    ProductResponse save(ProductRequest productRequest);
}
