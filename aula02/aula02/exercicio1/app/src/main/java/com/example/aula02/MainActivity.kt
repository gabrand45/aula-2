package com.example.aula02

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Faz as duas coisas: avisa no Logcat (como clique()) e atualiza a tela (como sortear())
    fun saudarUsuario(view: View) {
        println("Botão Saudar foi clicado")

        val txtSaudacao = findViewById<TextView>(R.id.txtSaudacao)
        txtSaudacao.setText("Olá, seja bem-vindo(a)!")
    }
}
