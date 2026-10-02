package com.example.ejercicioviewmodel.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ejercicioviewmodel.viewmodel.CounterViewModel

// Pantalla: solo muestra el estado y avisa al ViewModel cuando se presiona el botón.
@Composable
fun CounterScreen(
    modifier: Modifier = Modifier, // Permite que quien llama a la pantalla le pase márgenes o tamaño
    viewModel: CounterViewModel = viewModel() // Obtiene la instancia del ViewModel
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Muestra el valor actual del contador
        Text(
            text = "${viewModel.contador}",
            style = MaterialTheme.typography.displayLarge
        )
        Button(onClick = { viewModel.incrementar() }) {
            Text(text = "Incrementar")
        }
        Button(onClick = { viewModel.incrementar2()


        }) {
            Text(text = "Incrementar de 2 en 2")
        }
    }
}
