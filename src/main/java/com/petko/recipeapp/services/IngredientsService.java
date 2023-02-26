package com.petko.recipeapp.services;

import com.petko.recipeapp.model.Ingredients;

import java.util.Optional;

/**
 * Сервис по работе с ингредиентами
 */

public interface IngredientsService {

    Ingredients addIngredient(Ingredients ingredients);

    Optional<Ingredients> getIngredientByID(Long id);
}
