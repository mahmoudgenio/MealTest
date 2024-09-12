package com.repo.meals

import com.kak.domain.entity.meals.MealsModelResponse
import com.kak.domain.repo.meals.MealsRepo
import com.remote.meals.MealsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsRepoImpl(private val mealsApi: MealsApi):MealsRepo {
    override suspend fun getMealsCategoriesFromRemote(): MealsModelResponse {
        return withContext(Dispatchers.IO) {
            return@withContext mealsApi.getMealsResponse()
        }
    }


}