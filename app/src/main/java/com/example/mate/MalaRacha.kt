package com.example.mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mala_racha.*
import kotlin.random.Random

class MalaRacha : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mala_racha)



        var bundle = intent.extras
        var aciertos = bundle?.getInt("aciertosEnLeccion")
        var errores = bundle?.getInt("errores")
        var tipoOperacion = bundle?.getInt("tipoOperacion")
        var email = bundle?.getString("email")
        var provider = bundle?.getString("provider")

        var nivelejercicio = bundle?.getInt("nivelejercicio")
        var buttonSelect = bundle?.getInt("buttonSelect")

        btnMalaRacha.setOnClickListener {


            var ComenzarEjercicio = Intent(this, EjercicioTipo1::class.java)

            var numEjercicio = Random.nextInt(1, 5)

            when (numEjercicio) {
                1 -> {
                    ComenzarEjercicio = Intent(this, EjercicioTipo1::class.java)
                }
                2-> {
                    ComenzarEjercicio = Intent(this, EjercicioTipo2::class.java)
                }
                3 -> {
                    ComenzarEjercicio = Intent(this, EjercicioTipo3::class.java)
                }
                4 -> {
                    ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)
                }
                else -> { // Opción default
                }
            }

            val b :Bundle = Bundle()
            if (aciertos != null) {
                b.putInt("aciertosEnLeccion",aciertos)
            }
            if (errores != null) {
                b.putInt("errores",errores)
            }
            if (tipoOperacion != null) {
                b.putInt("tipoOperacion",tipoOperacion)
            }

            b.putString("email", email)
            b.putString("provider", provider)

            if (nivelejercicio != null) {
                b.putInt("nivelejercicio",nivelejercicio)
            }
            if (buttonSelect != null) {
                b.putInt("buttonSelect",buttonSelect)
            }

            finish()
            ComenzarEjercicio.putExtras(b)
            startActivity(ComenzarEjercicio)



        }















    }
}









