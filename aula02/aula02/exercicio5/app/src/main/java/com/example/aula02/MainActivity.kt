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

    // Só avisa no Logcat (como o clique() original)
    fun avisar(view: View) {
        println("Botão Aviso foi clicado")
    }

    // Só atualiza a tela (como o sortear() original)
    fun sortear(view: View) {
        val numero = Random().nextInt(11)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        txtResultado.setText("Número sorteado: $numero")
    }

    // Faz as duas coisas ao mesmo tempo
    fun avisarESortear(view: View) {
        val numero = Random().nextInt(11)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        txtResultado.setText("Número sorteado: $numero")
        println("Botão Ambos clicado — número sorteado: $numero")
    }
}
