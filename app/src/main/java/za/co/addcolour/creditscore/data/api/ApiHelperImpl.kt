package za.co.addcolour.creditscore.data.api

import retrofit2.Response
import za.co.addcolour.creditscore.data.model.CreditScoreData

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getCreditScore(): Response<CreditScoreData> = apiService.getCreditScore()
}