package com.example.lab3plataformas

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        //Se inicializa la informacion del usuario
        var selectedContact: Contact = MyApplication.contactArray[MyApplication.selectedPosition]
        textViewName.text = selectedContact.name
        textViewPhone.text = selectedContact.phone
        textViewEmail.text = selectedContact.email
        //Regresa al menu principal
        button4.setOnClickListener {
            val intent: Intent = Intent(  this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        //Genera un intent para llamar al numero guardado del contacto
        textViewPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+textViewPhone.text)
            startActivity(intent)
            finish()
        }
        //Genera un intent para mandar un correo con la informacion del contacto
        textViewEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:"+textViewEmail.text)
            intent.putExtra(Intent.EXTRA_EMAIL, textViewEmail.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Correo generado automaticamente")
            intent.putExtra(Intent.EXTRA_TEXT, "Mi nombre es "+textViewName.text.toString()+" y mi telefono es "+textViewPhone.text.toString())
            startActivity(intent)
            finish()
        }
    }
}
