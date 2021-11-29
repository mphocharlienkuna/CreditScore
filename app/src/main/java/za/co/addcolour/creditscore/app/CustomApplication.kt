package za.co.addcolour.creditscore.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import za.co.addcolour.creditscore.di.module.appModule
import za.co.addcolour.creditscore.di.module.repoModule
import za.co.addcolour.creditscore.di.module.viewModelModule

class CustomApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CustomApplication)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}