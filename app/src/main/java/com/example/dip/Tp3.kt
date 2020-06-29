package com.example.dip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.tp3_fragment.*

class Tp3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tp3_fragment)
        Button1tp3.setOnClickListener{
            val edit1 = "admin"
            val edit2 = "password"
            val activity1 = Intent(
                this,
                Activity1::class.java
            )

            if (edittext1.text.toString().equals(edit1) && edittext2.text.toString().equals(edit2)) {
                startActivity(activity1)
            }else   {
                textView3.isVisible=true
            }
        }
    }
}

class Activity1 : AppCompatActivity(){

}
