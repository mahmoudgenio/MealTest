package com.kak.domain.repo.meals

import com.kak.domain.entity.meals.MealsModelResponse

interface MealsRepo {
    suspend fun getMealsCategoriesFromRemote():MealsModelResponse
}