package net.itinajero.doglist.service

import net.itinajero.doglist.model.DogResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface IDogsService {
    @GET
    suspend fun getDogsByBreeds(@Url url:String ): Response<DogResponse>
}