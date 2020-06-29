package com.example.dip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // evênement du bouton TP1
        button1.setOnClickListener{
            startActivity(Intent(this, Tp1::class.java))
        }
        // evênement du bouton TP2
        button2.setOnClickListener{
            startActivity(Intent(this, Tp2::class.java))
        }
        // evênement du bouton TP3
        button3.setOnClickListener{
            startActivity(Intent(this, Tp3::class.java))
        }
        // evênement du bouton TP4
        button4.setOnClickListener{
            startActivity(Intent(this, Tp4::class.java))
        }
        // evênement du bouton TP5
        button5.setOnClickListener{
            startActivity(Intent(this, Tp5::class.java))
        }
        // evênement du bouton TP6
        button6.setOnClickListener{
            startActivity(Intent(this, Tp6::class.java))
        }
        // evênement du bouton TP7
        button7.setOnClickListener{
            startActivity(Intent(this, Tp7::class.java))
        }
        // evênement du bouton TP8
        button8.setOnClickListener{
            startActivity(Intent(this, Tp8::class.java))
        }
        // evênement du bouton TP9
        button9.setOnClickListener{
            startActivity(Intent(this, Tp9::class.java))
        }
    }

}

