package com.example.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnVoltar = findViewById<Button>(R.id.btn_Voltar)

        btnVoltar.setOnClickListener(View.OnClickListener {
            val activity2 = Intent(this, MainActivity::class.java)
            startActivity(activity2)
        })
        println("ESTADO_ACTIVITI, Tela 2:: onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("ESTADO_ACTIVITI, Tela 2:: onStart")
    }

    override fun onResume() {
        super.onResume()
        println("ESTADO_ACTIVITI, Tela 2:: onResume")
    }

    override fun onPause() {
        super.onPause()
        println("ESTADO_ACTIVITI, Tela 2:: onPause")
    }

    override fun onStop() {
        super.onStop()
        println("ESTADO_ACTIVITI, Tela 2:: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ESTADO_ACTIVITI, Tela 2:: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        println("ESTADO_ACTIVITI, Tela 2:: onRestart")
    }
}