package com.remote.meals
import com.kak.domain.entity.meals.MealsModelResponse
import retrofit2.http.GET

interface MealsApi {
    @GET("api/json/v1/1/categories.php")
    suspend fun getMealsResponse():MealsModelResponse
}