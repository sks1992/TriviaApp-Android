package sk.sandeep.jettriviaapp.network

import retrofit2.http.GET
import sk.sandeep.jettriviaapp.model.Question
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestion() :Question
}