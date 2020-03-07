package ru.fedordmitriev.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import ru.fedordmitriev.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
