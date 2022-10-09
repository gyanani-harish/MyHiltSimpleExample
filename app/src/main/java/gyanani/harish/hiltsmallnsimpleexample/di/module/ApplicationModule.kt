package gyanani.harish.hiltsmallnsimpleexample.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gyanani.harish.hiltsmallnsimpleexample.data.repository.MainRepo
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {
    @Provides
    @Singleton
    fun mainRepo(): MainRepo {
        return MainRepo()
    }
}
