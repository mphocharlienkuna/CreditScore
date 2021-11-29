package za.co.addcolour.creditscore.data.repository

import io.mockk.clearAllMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import za.co.addcolour.creditscore.data.api.ApiHelper

internal class MainRepositoryTest {

    private lateinit var mMainRepository: MainRepository
    private var mApiHelperMock = mockk<ApiHelper>()

    @Before
    fun setUp() {
        mMainRepository = MainRepository(mApiHelperMock)
    }

    @After
    fun tearDown() {
        clearAllMocks()
    }

    @Test
    fun `getCreditScore should call the api correctly`() = runBlocking {
        //GIVEN
        coEvery { mApiHelperMock.getCreditScore() } returns mockk()

        //WHEN
        mMainRepository.getCreditScore()

        //THEN
        coVerify { mApiHelperMock.getCreditScore() }
    }
}