package kg.megacom.product.dao;

import kg.megacom.product.models.entities.Product;

public interface ProductRepo {
    Product save(Product product);
}
