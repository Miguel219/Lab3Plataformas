package com.example.lab3plataformas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button2.setOnClickListener {
            val intent: Intent = Intent(  this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        button3.setOnClickListener {
            if((currentName.text.toString().length!=0)and(currentPhone.text.toString().length==8)and(currentPhone.text.toString().length!=0)) {
                var currentContact: Contact =
                    Contact(currentName.text.toString(), currentPhone.text.toString(), currentEmail.text.toString())
                MyApplication.contactArray.add(currentContact)
                Toast.makeText(this, "Se ha creado el contacto", Toast.LENGTH_SHORT).show()
                val intent: Intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "Ingresa correctamente la información", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
