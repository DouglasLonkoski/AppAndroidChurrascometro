package com.lonkoski.chrurrascmetro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda_tela.*

class SegundaTela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        val dados: Bundle? = intent.extras

        val qtdeHomens = dados?.getString("homens")
        val qtdeMulheres = dados?.getString("mulheres")
        val qtdeCriancas = dados?.getString("criancas")

        calcular(qtdeHomens.toString(), qtdeMulheres.toString(), qtdeCriancas.toString())


    }

    private fun calcular(qtdeHomens: String, qtdeMulheres: String, qtdeCriancas: String) {

        val homens = qtdeHomens.toDouble()
        val mulheres = qtdeMulheres.toDouble()
        val criancas = qtdeCriancas.toDouble()

        val carneHomens = homens * (0.3)
        val carneMulheres = mulheres * (0.25)
        val carneCriancas = criancas * (0.18)

        val linguicaHomens = homens * (0.1)
        val linguicaMulheres = mulheres * (0.05)
        val liguicaCriancas = criancas * (0.02)

        val refriHomens = homens * (0.80)
        val refriMulheres = mulheres * (0.50)
        val refriCriancas = criancas * (0.25)

        val totalCarne = carneHomens + carneMulheres + carneCriancas
        val totalLiguinca = liguicaCriancas + linguicaHomens + linguicaMulheres
        val totalrefri = refriHomens + refriMulheres + refriCriancas

        resultCarne.setText(totalCarne.toString() + "Kg")

        resultLinguica.setText(totalLiguinca.toString() + "Kg")

        resultRefri.setText(totalrefri.toString()+ "Lt")

    }
}