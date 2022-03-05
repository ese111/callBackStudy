package com.example.observer

interface Contractor {

    interface View {
        fun setTextOne(str: String)

    }

    interface Presenter {
        fun setData(str: String)

        fun onChangeViewText(str: String)
    }
}