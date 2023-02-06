package com.example.log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin :Button = findViewById(R.id.buttonLogin)
        val buttonRestablecer :Button = findViewById(R.id.buttonRestablecer)
        val buttonRegistrar:Button = findViewById(R.id.buttonRegistrar)

        buttonRestablecer.setOnClickListener(){
            startActivity(Intent(this,RestablecerContrasenaActivity::class.java))
        }

        buttonRegistrar.setOnClickListener(){
            startActivity(Intent(this,RegistrarActivity::class.java))
        }

        buttonLogin.setOnClickListener(){
            login()
        }
    }

    private fun login(){
        val login :EditText = findViewById(R.id.editTextLogin)
        val password : EditText = findViewById( R.id.editTextPassword)

        //Validacion que confirmara que los campos no esten vacio
        //Tambien confirmara que la contrase;a sera mayor de 8 caracteres
        if (login.text.isNotEmpty()
            && password.text.isNotEmpty()
            && password.text.length >=8)
        {
            //Si se cumple la validacion entonces ira a la otra actividad
            //Si no se cumple entonces ira al else
            startActivity(Intent(this,PerfilActivity::class.java))
        }else{
            //como no se confirme la validacion entonces dira otro error
            alerta("Ha ocurrido un error en la autenticacion")
        }
    }

    //Funcion para crear el mensaje de error
    private fun alerta(alert:String){
        val error = AlertDialog.Builder(this)
        error.setTitle("Error")
        error.setMessage(alert)
        error.setPositiveButton("Accept",null)
        val dialog :AlertDialog = error.create()
        dialog.show()
    }
}