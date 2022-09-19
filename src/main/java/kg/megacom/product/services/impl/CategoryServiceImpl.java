package kg.megacom.product.services.impl;

import kg.megacom.product.dao.CategoryRepo;
import kg.megacom.product.mappers.CategoryMapper;
import kg.megacom.product.models.dto.CategoryDto;
import kg.megacom.product.models.entities.Category;
import kg.megacom.product.services.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    private CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
        this.categoryMapper = CategoryMapper.INSTANCE;
    }
    @Override
    public CategoryDto save(CategoryDto categoryDto) {

        Category category = categoryMapper.toCategory(categoryDto);
        category = categoryRepo.save(category);
        return categoryMapper.toCategoryDto(category);
    }


    public boolean existsById(Long id) {
        return categoryRepo.existsById(id);
    }


    public void checkExistsByIdAndActive(Long id) {
        Category category = findById(id);

        if (!category.isActive())
            throw new RuntimeException("Категория не активна!");
    }


    public Category findById(Long id) {
        return categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Категория не найдена!"));
    }
}
