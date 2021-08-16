package com.tech.getbuttonstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_get_number.setOnClickListener {
            textView.text = "name:= ${editTextPhone.text}"
        }
        btn_get_name.setOnClickListener {
            textView2.text ="number:= ${ editTextTextPersonName.text}"
        }
    }
}