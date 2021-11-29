package za.co.addcolour.creditscore

import io.mockk.*
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import za.co.addcolour.creditscore.data.repository.MainRepository
import za.co.addcolour.creditscore.di.module.appModule
import za.co.addcolour.creditscore.di.module.repoModule
import za.co.addcolour.creditscore.di.module.viewModelModule
import za.co.addcolour.creditscore.utils.NetworkHelper

internal class MainViewModelTest {

    private lateinit var mMainViewModel: MainViewModel
    private val mMainRepository= mockk<MainRepository>()

    private val mNetworkHelper = mockk<NetworkHelper>()

    @Before
    fun setUp() {

        mMainViewModel = MainViewModel(mMainRepository, mNetworkHelper)

        val modules = ArrayList(listOf(appModule, repoModule, viewModelModule))
        startKoin { modules(modules) }
    }

    @After
    fun tearDown() {
        clearAllMocks()
        stopKoin()
    }

    @Test
    fun `getAllCreditScore should call the correct api`() = runBlocking {
        mMainViewModel.fetchCreditScore()
    }
}