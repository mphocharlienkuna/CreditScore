package za.co.addcolour.creditscore.data.api

import retrofit2.Response
import za.co.addcolour.creditscore.data.model.CreditScoreData

interface ApiHelper {

    suspend fun getCreditScore(): Response<CreditScoreData>
}