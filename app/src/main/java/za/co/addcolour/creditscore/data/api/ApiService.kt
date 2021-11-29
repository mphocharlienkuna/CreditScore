package za.co.addcolour.creditscore.data.api

import retrofit2.Response
import retrofit2.http.GET
import za.co.addcolour.creditscore.data.model.CreditScoreData

interface ApiService {

    @GET("/endpoint.json")
    suspend fun getCreditScore(): Response<CreditScoreData>
}