package com.example.log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RestablecerContrasenaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restablecer_contrasena)

        val buttonVolver :Button = findViewById(R.id.buttonVolver)

        buttonVolver.setOnClickListener(){
            finish()
        }
    }
}