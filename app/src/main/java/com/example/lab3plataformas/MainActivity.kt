package com.example.lab3plataformas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se utiliza adapter para agregar el arreglo al listview
        var adapter = ArrayAdapter(this, R.layout.listview_item, MyApplication.contactArray)
        contactList.adapter = adapter
        //Al seleccionar un contacto se va a la activity de ver usuario
        contactList.setOnItemClickListener {
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            MyApplication.selectedPosition = position
            val intent: Intent = Intent(  this, Main3Activity::class.java)
            startActivity(intent)
            finish()
        }
        //Esta funcion va a la activity de crear un usuario
        button.setOnClickListener {

            val intent: Intent = Intent(  this, Main2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
