package com.example.observer

interface Listener {
    interface LoadCallBack {
        fun onTextLoaded()

        fun onChangeText()
    }

    fun getText(str: String, callback: LoadCallBack)
}
