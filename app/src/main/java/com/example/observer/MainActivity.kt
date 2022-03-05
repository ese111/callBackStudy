package com.example.observer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), Contractor.View {
    private val msg = "콜백!!"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter = Presenter(this)
        val button: Button = findViewById(R.id.click)
        button.setOnClickListener {
            presenter.getText("안녕하세요", object : Listener.LoadCallBack{
                override fun onTextLoaded() {
                    successMessage()
                }

                override fun onChangeText() {
                    setTextTwo()
                }
            })
        }

    }

    override fun setTextOne(str: String) {
        val textOne = findViewById<TextView>(R.id.text1)
        textOne.text = str
    }

    private fun setTextTwo() {
        val textTwo = findViewById<TextView>(R.id.text2)
        textTwo.text = msg
    }

    private fun successMessage() {
        Toast.makeText(this, "변경 완료", Toast.LENGTH_SHORT).show()
    }
}