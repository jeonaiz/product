package kg.megacom.product.services;

import kg.megacom.product.models.dto.CategoryDto;
import kg.megacom.product.models.entities.Category;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);

    boolean existsById(Long id);
    void checkExistsByIdAndActive(Long id);
    Category findById(Long id);
}
