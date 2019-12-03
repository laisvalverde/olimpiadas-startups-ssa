package com.josemessiasjunior.olimpiadas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoContinuar.setOnClickListener {
            val time1 = nomeDoTime1.text.toString().trim()
            val time2 = nomeDoTime2.text.toString().trim()
            

            if (time1 == "") {
                Toast.makeText(this, "Preencha o time 1", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (time2 == "") {
                Toast.makeText(this, "Preencha o time 2", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, EsportesActivity::class.java)
            intent.putExtra("TIME1", time1)
            intent.putExtra("TIME2", time2)
            startActivity(intent)
        }
    }
}
