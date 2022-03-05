package com.example.observer

class Presenter(private val view: Contractor.View) : Contractor.Presenter, Listener {
    private var data = Data()

    override fun getText(str: String, callback: Listener.LoadCallBack) {
        setData(str)
        onChangeViewText(str)
        callback.onTextLoaded()
        callback.onChangeText()
    }

    override fun setData(str: String) {
        data.setStr(str)
    }

    override fun onChangeViewText(str: String) {
        view.setTextOne(data.getStr())
    }

}