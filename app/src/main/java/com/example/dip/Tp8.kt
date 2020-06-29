
package com.example.android

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.dip.R
import kotlinx.android.synthetic.main.tp8_fragment.*
import org.w3c.dom.Text
import kotlin.concurrent.thread

class Tp8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tp8_fragment)

        val demarrer: Button = findViewById(R.id.btn_rebours)
        val txt: TextView = findViewById(R.id.txt_rebours)
        demarrer.setOnClickListener() {
            var compteur = 10
            val thread = Thread {
                while (compteur > -1 ) {
                    this.runOnUiThread() {
                        txt.setText(compteur.toString())
                    }
                    Thread.sleep(1000)
                    compteur -= 1
                }
            }
            thread.start()
        }
    }
}