package com.example.gameproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.gameproject.R
import com.example.gameproject.viewmodel.GameViewModel


@Composable
fun InterfaceJogo(viewModel: GameViewModel){
    val tabuleiro = viewModel.tabuleiro
    val vencedor = viewModel.vencedor
    val jogador = viewModel.jogadorActual

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = stringResource(R.string.jogador_atual, jogador) , style = MaterialTheme.typography.titleLarge)

        for (linha in 0..2){
            Row {
                for (coluna in 0..2) {
                    val indice = linha * 3 + coluna
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .padding(4.dp)
                            .clickable { viewModel.jogadas(indice) },
                        contentAlignment = Alignment.Center
                    ){
                        Surface (
                            shape = RoundedCornerShape(8.dp),
                            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                            tonalElevation = 2.dp,
                            modifier = Modifier.fillMaxSize()
                        ){
                            Box(contentAlignment = Alignment.Center){
                                Text(
                                    text = tabuleiro[indice],
                                    style = MaterialTheme.typography.headlineMedium
                                )
                            }
                        }
                    }
                }
            }
        }

        if (vencedor != null){
            Text(
                text = if (vencedor == "Empate") stringResource(R.string.empate) else stringResource(
                    R.string.vencedor, vencedor
                ),
                style = MaterialTheme.typography.titleLarge
            )
            Button(onClick = { viewModel.resetGame() }) {
                Text(stringResource(R.string.reiniciar_jogo))
            }
        }


    }


}