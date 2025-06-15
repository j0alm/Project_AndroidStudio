package com.example.gameproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.gameproject.ui.theme.GameProjectTheme
import com.example.gameproject.ui.theme.interfaceJogo
import com.example.gameproject.viewmodel.GameViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameProjectTheme {
                val gameViewModel: GameViewModel = viewModel()
                interfaceJogo(viewModel = gameViewModel)
            }
        }
    }
}
