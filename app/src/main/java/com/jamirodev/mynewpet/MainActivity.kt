package com.jamirodev.mynewpet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jamirodev.mynewpet.ui.screens.MyNewPetNavigationGraph
import com.jamirodev.mynewpet.ui.screens.Routes
import com.jamirodev.mynewpet.ui.screens.UserInputScreen
import com.jamirodev.mynewpet.ui.screens.WelcomeScreen
import com.jamirodev.mynewpet.ui.theme.MyNewPetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewPetTheme {
                MyNewPetApp()
            }
        }
    }

    @Composable
    fun MyNewPetApp() {
        MyNewPetNavigationGraph()
    }
}
