package sk.sandeep.jettriviaapp.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import sk.sandeep.jettriviaapp.component.QuestionsScreen

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()) {
    QuestionsScreen(viewModel)
}
