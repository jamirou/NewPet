package com.jamirodev.mynewpet.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jamirodev.mynewpet.ui.UserInputViewModel

@Composable
fun MyNewPetNavigationGraph(userInputViewModel: UserInputViewModel = viewModel()) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN) {
        composable(Routes.USER_INPUT_SCREEN) {
            UserInputScreen(userInputViewModel) {
                println("Coming_inside_show_welcome_screen")
                println("it.first")
                println("it.second")
                navController.navigate(Routes.WELCOME_SCREEN+"/${it.first}/${it.second}")
            }
        }
        composable("${Routes.WELCOME_SCREEN}/{${Routes.USER_NAME}}/{${Routes.ANIMAL_SELECTED}}",
            arguments = listOf(
                navArgument(name = Routes.USER_NAME) { type = NavType.StringType},
                navArgument(name = Routes.ANIMAL_SELECTED) { type = NavType.StringType}
            )
        ) {
            WelcomeScreen()
        }
    }
}