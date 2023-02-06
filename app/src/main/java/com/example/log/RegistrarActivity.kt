package com.example.log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class RegistrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        val buttonRegistrarDatos : Button = findViewById(R.id.buttonRegistrarDatos)
        val buttonCancelarRegistro : Button = findViewById(R.id.buttonVolverRegistro)

        buttonRegistrarDatos.setOnClickListener(){
            registrar()
        }
        buttonCancelarRegistro.setOnClickListener(){
            finish()
        }


    }

    private fun registrar(){
        val nombre :EditText = findViewById(R.id.editTextNombre)
        var apellido :EditText = findViewById(R.id.editTextApellido)
        var telefono :EditText = findViewById(R.id.editTextTelefono)
        var correo :EditText = findViewById(R.id.editTextCorreo)
        var sexo :EditText = findViewById(R.id.editTextSexo)
        var fechaNacimiento :EditText = findViewById(R.id.editTextFechaNacimiento)
        var pais :EditText = findViewById(R.id.editTextPais)
        var provincia :EditText = findViewById(R.id.editTextProvincia)
        var direccion :EditText = findViewById(R.id.editTextDireccion)

        if (nombre.text.isNotEmpty()
            && apellido.text.isNotEmpty()
            && telefono.text.isNotEmpty()
            && correo.text.isNotEmpty()
            && sexo.text.isNotEmpty()
            && fechaNacimiento.text.isNotEmpty()
            && apellido.text.isNotEmpty()
            && pais.text.isNotEmpty()
            && provincia.text.isNotEmpty()
            && direccion.text.isNotEmpty()
        ){
            //pasa al perfil
            startActivity(Intent(this,PerfilActivity::class.java))
        }
        else{
            alerta("Ha ocurrido un error en la autenticacion" +
                    "\n Todos los campos deben ser llenados")
        }
    }

    private fun alerta(alert:String){
        val error = AlertDialog.Builder(this)
        error.setTitle("Error")
        error.setMessage(alert)
        error.setPositiveButton("Accept",null)
        val dialog : AlertDialog = error.create()
        dialog.show()
    }
}