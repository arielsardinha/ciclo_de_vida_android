package com.example.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_ir)
        btn.setOnClickListener{
            val activity = Intent(this, MainActivity2::class.java)
            startActivity(activity)
        }
        println("ESTADO_ACTIVITY Tela 1:: onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("ESTADO_ACTIVITI, Tela 1:: onStart")
    }

    override fun onResume() {
        super.onResume()
        println("ESTADO_ACTIVITI, Tela 1:: onResume")
    }

    override fun onPause() {
        super.onPause()
        println("ESTADO_ACTIVITI, Tela 1:: onPause")
    }

    override fun onStop() {
        super.onStop()
        println("ESTADO_ACTIVITI, Tela 1:: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ESTADO_ACTIVITI, Tela 1:: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        println("ESTADO_ACTIVITI, Tela 1:: onRestart")
    }
}