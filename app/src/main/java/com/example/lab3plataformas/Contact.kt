package com.example.lab3plataformas

class Contact(name: String, phone: String, email: String) {

    var name: String = name
    var phone: String = phone
    var email: String = email
    override fun toString(): String {
        return "$name - $phone"
    }
}