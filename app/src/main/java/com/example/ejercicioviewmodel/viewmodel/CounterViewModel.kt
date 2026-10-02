package com.example.ejercicioviewmodel.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

// ViewModel: guarda el estado (el número) y la lógica (incrementar).
class CounterViewModel : ViewModel() {

    // Estado: el contador inicia en 0. Solo el ViewModel puede cambiarlo.
    var contador by mutableIntStateOf(0)
        private set

    // Evento: suma 1 al contador.
    fun incrementar() {
        contador++
    }

    // Evento: suma 2 al contador.
    fun incrementar2() {
        contador += 2
    }
}
