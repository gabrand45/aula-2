package com.example.aula02

import android.graphics.Color
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
            txtResultado.setTextColor(Color.parseColor("#1F7A6C")) // verde-azulado = par
            println("número par sorteado: $numero — cor aplicada: #1F7A6C (verde-azulado)")
        } else {
            txtResultado.setTextColor(Color.parseColor("#C0392B")) // vermelho = ímpar
            println("número ímpar sorteado: $numero — cor aplicada: #C0392B (vermelho)")
        }
    }
}
