package com.example.aula02

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {

    // Quantas vezes o dado já foi rolado
    private var rolagens = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rolarDado(view: View) {
        rolagens++
        val resultado = Random().nextInt(6) + 1 // 1 a 6

        val txtDado = findViewById<TextView>(R.id.txtDado)
        txtDado.setText("Rolagem $rolagens: resultado $resultado")

        println("rolagem $rolagens: resultado $resultado")
    }
}
