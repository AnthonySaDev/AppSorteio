package com.anthonysadev.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view:View){
        val textoResultado = findViewById<TextView>(R.id.textViewResultado)
        val numero = java.util.Random().nextInt(11)
        textoResultado.setText("Número gerado: $numero")
    }

}