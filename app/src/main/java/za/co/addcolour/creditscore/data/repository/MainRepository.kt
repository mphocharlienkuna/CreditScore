package za.co.addcolour.creditscore.data.repository

import za.co.addcolour.creditscore.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getCreditScore() = apiHelper.getCreditScore()
}