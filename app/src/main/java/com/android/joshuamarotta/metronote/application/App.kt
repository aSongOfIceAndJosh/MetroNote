package com.android.joshuamarotta.metronote.application

import android.app.Application
import com.android.joshuamarotta.metronote.repositories.EventRepository
import com.android.joshuamarotta.metronote.repositories.EventsFragmentRepository
import com.android.joshuamarotta.metronote.roomdatabase.EventRoomDatabase
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel
import com.android.joshuamarotta.metronote.viewmodels.EventsFragmentViewModel
import com.android.joshuamarotta.metronote.viewmodels.HomeFragmentViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import shortbread.Shortbread

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        Shortbread.create(this)

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(
                jobAndScopeModule,
                eventRoomRepositoryModule,
                eventsFragmentRepository,
                eventViewModelModule,
                homeFragmentViewModelModule,
                eventsFragmentViewModel
            )
        }
    }
}

val jobAndScopeModule = module {
    single { Job() }
    single { CoroutineScope(get() as Job + Dispatchers.Main)}
}

val eventRoomRepositoryModule = module {
    single { EventRoomDatabase.getDatabase(androidApplication(), scope = get()).eventDao() }
    single { EventRepository(eventDao = get())}
}

val eventsFragmentRepository = module {
    single { EventsFragmentRepository() }
}


val eventViewModelModule = module {
    viewModel { EventViewModel(androidApplication(), get(), get(), get()) }
}

val homeFragmentViewModelModule = module {
    viewModel { HomeFragmentViewModel(androidApplication(), parentJob = get(), eventRoomRepository = get()) }
}

val eventsFragmentViewModel = module {
    viewModel { EventsFragmentViewModel(androidApplication(), repository = get()) }
}