package ru.fedordmitriev.recipe.service;

import ru.fedordmitriev.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
