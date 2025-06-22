# Jogo do Galo — Aplicação Android

Este projeto consiste na implementação de uma aplicação do Jogo do Galo desenvolvida em **Kotlin** com **Jetpack Compose** como parte de um trabalho final da cadeira de Programação Avançada.

## Funcionalidades

- Tabuleiro interativo 3x3 com deteção automática de vencedor ou empate
- Alternância automática entre os jogadores "X" e "O"
- Reinício do jogo com um botão dedicado
- **Suporte a internacionalização** (Português e Inglês)
- Arquitetura **MVVM** com separação clara entre UI e lógica

## Tecnologias utilizadas

- [Kotlin](https://kotlinlang.org/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Android Studio](https://developer.android.com/studio)
- MVVM (ViewModel)
- Git e Github
- IntelliJ IDEA (para análise e formatação de código Kotlin)

## Estrutura

- `MainActivity.kt` — ficheiro principal que inicializa o `GameViewModel`
- `viewModel_JogoDoGalo.kt` — lógica do jogo (verificação de jogadas, vencedor, reinício)
- `GameScreen.kt` — interface do jogo (tabuleiro e botões)
- `res/values/strings.xml` — strings em Português
- `res/values-en/strings.xml` — strings traduzidas para Inglês

## Como Instalar e Executar

1. **Clona o repositório:**
   ```bash
   git clone https://github.com/j0alm/Project_AndroidStudio.git
   cd Project_AndroidStudio
   
2. **Abra o projeto no Android Studio**
   - File > Open > seleciona a pasta clonada

3. **Executa a aplicação:**
   - Seleciona um dispositivo virtual (ou um físico ligado via USB)
   - Clica em Run



