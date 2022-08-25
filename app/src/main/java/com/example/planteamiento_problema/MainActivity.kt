package com.example.planteamiento_problema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var calcular: Button
    lateinit var introducir: EditText
    lateinit var resultado: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        introducir = findViewById(R.id.introducir)
        calcular = findViewById(R.id.calcular)
        resultado = findViewById(R.id.resultado)

    }


    

}
