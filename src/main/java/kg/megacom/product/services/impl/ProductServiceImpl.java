package kg.megacom.product.services.impl;

import kg.megacom.product.dao.ProductRepo;
import kg.megacom.product.mappers.ProductMapper;
import kg.megacom.product.models.dto.PriceDto;
import kg.megacom.product.models.dto.request.ProductRequest;
import kg.megacom.product.models.dto.responses.ProductResponse;
import kg.megacom.product.models.entities.Product;
import kg.megacom.product.services.CategoryService;
import kg.megacom.product.services.PriceService;
import kg.megacom.product.services.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;
    private final CategoryService categoryService;
    private final ProductRepo productRepo;
    private final PriceService priceService;

    public ProductServiceImpl(CategoryService categoryService, ProductRepo productRepo, PriceService priceService) {
        this.categoryService = categoryService;
        this.productRepo = productRepo;
        this.priceService = priceService;
        this.productMapper = ProductMapper.INSTANCE;
    }

    @Override
    public ProductResponse save(ProductRequest productRequest) {

        Product product = productMapper.productRequestToProduct(productRequest);

        categoryService.checkExistsByIdAndActive(product.getCategory().getId());

        product = productRepo.save(product);

        PriceDto priceDto = priceService.save(productRequest, product);


        ProductResponse productResponse = new ProductResponse();
        productResponse.setProduct(productMapper.toDto(product));


        return null;
    }

}
