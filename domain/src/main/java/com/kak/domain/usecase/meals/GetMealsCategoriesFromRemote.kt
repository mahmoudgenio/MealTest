package com.kak.domain.usecase.meals

import com.kak.domain.repo.meals.MealsRepo

class GetMealsCategoriesFromRemote(private val mealsRepo:MealsRepo) {
    operator suspend fun invoke ()= mealsRepo.getMealsCategoriesFromRemote()
}