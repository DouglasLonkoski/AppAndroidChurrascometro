package com.lonkoski.chrurrascmetro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener{

            val qt_homem = editHomem.text.toString()
            val qt_mulher = editMulher.text.toString()
            val qt_crianca = editCrianca.text.toString()

            val intent = Intent(applicationContext, SegundaTela::class.java)

            //passandos dados

            intent.putExtra("homens", qt_homem)
            intent.putExtra("mulheres", qt_mulher)
            intent.putExtra("criancas", qt_crianca)


            startActivity(intent)
        }
    }
}
