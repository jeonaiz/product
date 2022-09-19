package kg.megacom.product.services;

import kg.megacom.product.models.dto.PriceDto;
import kg.megacom.product.models.dto.request.ProductRequest;
import kg.megacom.product.models.entities.Product;

public interface PriceService {
    PriceDto save(ProductRequest productRequest, Product product);
}
