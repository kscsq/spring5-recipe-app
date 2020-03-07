package ru.fedordmitriev.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import ru.fedordmitriev.recipe.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
