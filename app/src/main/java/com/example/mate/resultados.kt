package com.example.mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultados.*
import kotlin.random.Random

class resultados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)


        var bundle = intent.extras
        var email = bundle?.getString("email")
        var provider = bundle?.getString("provider")
        var buttonSelect = bundle?.getInt("buttonSelect")



        btnFinalizarLeccion.setOnClickListener {

            var final= Intent(this, MenuAppPrincipal::class.java)



            var numEjercicio = Random.nextInt(1, 5)





            val b :Bundle = Bundle()
            b.putString("email", email)
            b.putString("provider", provider)
            if (buttonSelect != null) {
                b.putInt("buttonSelect",buttonSelect)
            }





            finish()
            final.putExtras(b)
            startActivity(final)

        }
























    }

}