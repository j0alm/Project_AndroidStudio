package com.example.gameproject.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    var tabuleiro by mutableStateOf(List(9) { "" })
        private set

    var jogadorActual by mutableStateOf("X")
        private set

    var vencedor by mutableStateOf<String?>(null)
        private set

    fun jogadas(i: Int) {
        if (tabuleiro[i] == "" && vencedor == null) {
            val tab_atualizado = tabuleiro.toMutableList()
            tab_atualizado[i] = jogadorActual
            tabuleiro = tab_atualizado
            vencedor = verifica_vencedor()
            if (vencedor == null) {
                jogadorActual = if (jogadorActual == "X") "O" else "X"
            }
        }
    }

    private fun verifica_vencedor(): String? {
        val lines = listOf(
            listOf(0, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8),
            listOf(0, 3, 6), listOf(1, 4, 7), listOf(2, 5, 8),
            listOf(0, 4, 8), listOf(2, 4, 6)
        )

        for (line in lines) {
            val (a, b, c) = line
            if (tabuleiro[a] != "" && tabuleiro[a] == tabuleiro[b] && tabuleiro[b] == tabuleiro[c]) {
                return tabuleiro[a]
            }
        }

        return if (tabuleiro.none { it == "" }) "Empate" else null
    }

    fun resetGame() {
        tabuleiro = List(9) { "" }
        jogadorActual = "X"
        vencedor = null
    }
}
