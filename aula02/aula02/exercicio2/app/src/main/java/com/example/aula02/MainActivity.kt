package com.example.aula02

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Fora da função: o valor persiste entre cliques
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun contarClique(view: View) {
        contador++

        val txtContador = findViewById<TextView>(R.id.txtContador)
        txtContador.setText("Cliques: $contador")

        println("botão clicado $contador vezes")
    }
}
