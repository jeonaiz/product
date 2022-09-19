package kg.megacom.product.mappers;


import kg.megacom.product.models.dto.CategoryDto;
import kg.megacom.product.models.entities.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    @Mapping(source = "name", target = "title")
    Category toCategory(CategoryDto categoryDto);
    @InheritInverseConfiguration
    CategoryDto toCategoryDto(Category category);
}
