package com.example.lab3plataformas

import android.app.Application

class MyApplication: Application() {
    //Se utiliza companion para que sea un objeto global
    companion object {
        var contactArray: ArrayList<Contact> = ArrayList()
        var selectedPosition: Int = 0
    }
}