package com.jamirodev.mynewpet.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jamirodev.mynewpet.ui.CuriousFact
import com.jamirodev.mynewpet.ui.FactsViewModel
import com.jamirodev.mynewpet.ui.TextComponent
import com.jamirodev.mynewpet.ui.TextWithShadow
import com.jamirodev.mynewpet.ui.TopBar

@Composable
fun WelcomeScreen(username: String?, animalSelected: String?) {
    println("!!!!Inside+WelcomeScreen")
    println("!!!!$username, $animalSelected")
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar(value = "Hola $username! 🖖")
            TextComponent(textValue = "（づ￣3￣）づ╭❤️～", textSize = 24.sp)
            SpacerWithValue(value = 60)
            val dogOrCat = if (animalSelected == "Cat") "Dato curioso sobre gatos 😸" else "Dato curioso sobre perros 🐶"
            TextWithShadow(value = dogOrCat)

            val factsViewModel : FactsViewModel = viewModel()
            CuriousFact(
                value = factsViewModel.generateRandomFact(animalSelected!!)
            )
        }
    }
}

@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen("username", "animalSelected")
}