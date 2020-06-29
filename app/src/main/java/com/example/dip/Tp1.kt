package com.example.dip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.tp1_fragment.*
import kotlinx.android.synthetic.main.tp1_fragment.view.*

class Tp1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tp1_fragment)
        // vérification des saisies dans les editText lors de l'appui sur le bouton de connexion
        ll4tp1.Button1tp1.setOnClickListener{
            val edit1 = "admin"
            val edit2 = "password"
            if (edittext1.text.toString().equals(edit1) && edittext2.text.toString().equals(edit2)) {
                Toast.makeText(this,"ID Confirmed",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"ID Not Confirmed",Toast.LENGTH_LONG).show()
            }
        }
    }
}
