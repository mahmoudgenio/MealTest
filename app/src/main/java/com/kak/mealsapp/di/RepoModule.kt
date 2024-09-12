package com.kak.mealsapp.di



import com.kak.domain.repo.meals.MealsRepo
import com.remote.meals.MealsApi
import com.repo.meals.MealsRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun providedMealsRepo(
        mealsApi: MealsApi,
    ): MealsRepo {
        return MealsRepoImpl(mealsApi)
    }
}