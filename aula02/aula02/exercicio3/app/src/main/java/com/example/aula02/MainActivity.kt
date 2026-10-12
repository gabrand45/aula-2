package com.example.aula02

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view: View) {
        val numero = Random().nextInt(11) // 0 a 10

        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        txtResultado.setText("Número sorteado: $numero")

        if (numero % 2 == 0) {
            println("número par sorteado: $numero")
        } else {
            println("número ímpar sorteado: $numero")
        }
    }
}
