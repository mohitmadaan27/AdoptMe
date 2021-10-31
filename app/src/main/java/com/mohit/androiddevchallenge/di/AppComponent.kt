package com.mohit.androiddevchallenge.di

import com.mohit.androiddevchallenge.mobius.WorkRunnersConstants
import com.spotify.mobius.android.runners.MainThreadWorkRunner
import com.spotify.mobius.runners.WorkRunner
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class AppComponent {

    @Provides
    @Named(WorkRunnersConstants.MAIN_THREAD_WORK_RUNNER)
    fun providesWorkRunner(): WorkRunner {
        return MainThreadWorkRunner.create()
    }
}
