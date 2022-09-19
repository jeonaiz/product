package kg.megacom.product.services.impl;

import kg.megacom.product.dao.PriceRepo;
import kg.megacom.product.mappers.PriceMapper;
import kg.megacom.product.models.dto.PriceDto;
import kg.megacom.product.models.dto.request.ProductRequest;
import kg.megacom.product.models.entities.Price;
import kg.megacom.product.models.entities.Product;
import kg.megacom.product.services.PriceService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepo priceRepo;
    private final PriceMapper priceMapper;

    public PriceServiceImpl(PriceRepo priceRepo) {
        this.priceRepo = priceRepo;
        this.priceMapper = PriceMapper.INSTANCE;
    }

    @Override
    public PriceDto save(ProductRequest productRequest, Product product) {

        Price price = priceMapper.productRequestToPrice(productRequest);

        price.setStartDate(new Date());
        price.setEndDate(new Date(Long.MAX_VALUE));
        price.setProduct(product);

        price = priceRepo.save(price);

        return priceMapper.toPriceDto(price);
    }
}