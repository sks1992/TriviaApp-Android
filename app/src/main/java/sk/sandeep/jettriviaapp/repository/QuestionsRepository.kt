package sk.sandeep.jettriviaapp.repository

import android.util.Log
import sk.sandeep.jettriviaapp.data.DataOrException
import sk.sandeep.jettriviaapp.model.QuestionItem
import sk.sandeep.jettriviaapp.network.QuestionApi
import javax.inject.Inject

class QuestionsRepository @Inject constructor(
    private val api: QuestionApi
) {
    private val dataOrException = DataOrException<ArrayList<QuestionItem>,
            Boolean,
            Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestion()

            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false
        } catch (e: Exception) {
            dataOrException.e = e
            Log.d("Exc", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")
        }
        return dataOrException
    }
}