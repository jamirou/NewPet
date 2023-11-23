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
        }
    }
}

@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen("username", "animalSelected")
}