package com.example.observer

data class Data(private var str : String = "Hello") {
    fun setStr(_str: String) {
        str = _str
    }

    fun getStr() = str
}