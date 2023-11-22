package com.jamirodev.mynewpet.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.jamirodev.mynewpet.data.UserDataUiEvents
import com.jamirodev.mynewpet.data.UserInputScreenState

class UserInputViewModel : ViewModel() {

    companion object {
        const val TAG = "UserInputViewModel"
    }
    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event: UserDataUiEvents) {
        when(event) {
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
            }
            is UserDataUiEvents.AnimalSelected -> {
                uiState.value = uiState.value.copy(
                    animalSelected = event.animalValue
                )
            }
        }
    }
}

