package com.kak.mealsapp.di


import com.kak.domain.repo.meals.MealsRepo
import com.kak.domain.usecase.meals.GetMealsCategoriesFromRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetMealsCategoriesFromRemoteUseCase(mealsRepo: MealsRepo): GetMealsCategoriesFromRemote {
        return GetMealsCategoriesFromRemote(mealsRepo)
    }


}