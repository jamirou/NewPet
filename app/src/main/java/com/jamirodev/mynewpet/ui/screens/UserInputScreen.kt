package com.jamirodev.mynewpet.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jamirodev.mynewpet.data.UserDataUiEvents
import com.jamirodev.mynewpet.ui.TextComponent
import com.jamirodev.mynewpet.ui.TextFieldComponent
import com.jamirodev.mynewpet.ui.TopBar
import com.jamirodev.mynewpet.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar("Hello Android \uD83D\uDE0A")
            TextComponent(
                textValue = "Aprendamos algo de ti!",
                textSize = 24.sp
            )
            SpacerWithValue(value = 20)
            TextComponent(
                textValue = "¡Esta aplicación preparará una página basada en lo que escojas!",
                textSize = 18.sp
            )
            SpacerWithValue(value = 60)
            TextFieldComponent(onTextChanged = {
                userInputViewModel.onEvent(
                    UserDataUiEvents.UserNameEntered(it)
                )
            })
        }
    }
}
@Composable
fun SpacerWithValue(value: Int) {
    Spacer(modifier = Modifier.size(value.dp))
}

@Preview
@Composable
fun UserInputScreenPreview() {
    UserInputScreen(UserInputViewModel())
}