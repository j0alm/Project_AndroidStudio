package com.example.gameproject.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gameproject.viewmodel.GameViewModel

@Composable
fun interfaceJogo(viewModel: GameViewModel = viewModel()){
    val tabuleiro = viewModel.tabuleiro
    val vencedor = viewModel.vencedor
    val jogador = viewModel.jogadorActual

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){  }
}