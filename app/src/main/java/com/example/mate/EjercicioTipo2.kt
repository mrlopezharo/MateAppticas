package com.example.mate

import android.content.Intent
import android.graphics.Color.rgb
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ejercicio_tipo2.*
import kotlin.random.Random

class EjercicioTipo2 : AppCompatActivity() {





    //VARIABLES DE LA BASE DE DATOS
    //Numero de Leccion
    var leccionSuma = 1
    var leccionResta = 1
    var leccionMultiplicacion = 1
    var leccionDivision = 1


    //Datos por nivel y por tipo de operacion

    //suma



    //nivel 1
    var numero1 =  0
    var numero2 =  0
    var respuestaCorrecta = 0
    var PreguntaEjercicio2 = " "









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_tipo2)


        var bundle = intent.extras
        var aciertos = bundle?.getInt("aciertosEnLeccion")
        var nivelejercicio = bundle?.getInt("nivelejercicio")
        var errores = bundle?.getInt("errores")
        var tipoOperacion = bundle?.getInt("tipoOperacion")
        var email = bundle?.getString("email")
        var provider = bundle?.getString("provider")
        var buttonSelect = bundle?.getInt("buttonSelect")





        if (nivelejercicio != null) {
            leccionSuma = nivelejercicio
        }
        if (nivelejercicio != null) {
            leccionResta = nivelejercicio
        }
        if (nivelejercicio != null) {
            leccionMultiplicacion = nivelejercicio
        }
        if (nivelejercicio != null) {
            leccionDivision = nivelejercicio
        }








        when (tipoOperacion) {
            1 -> {//suma

                when (leccionSuma) {
                    0,1,2 -> {
                        numero1 =  Random.nextInt(1, 6)
                        numero2 =  Random.nextInt(1, 6)
                    }
                    3,4-> {
                        numero1 =  Random.nextInt(1, 10)
                        numero2 =  Random.nextInt(1, 10)
                    }
                    5,6 -> {
                        numero1 =  Random.nextInt(10, 20)
                        numero2 =  Random.nextInt(10, 20)
                    }
                    7,8 -> {
                        numero1 =  Random.nextInt(20, 50)
                        numero2 =  Random.nextInt(20, 50)
                    }
                    9,10 -> {
                        numero1 =  Random.nextInt(50, 100)
                        numero2 =  Random.nextInt(50, 100)
                    }
                    else -> { // Opción default
                    }
                }
                respuestaCorrecta = numero1 + numero2
                PreguntaEjercicio2 = "¿Cuanto es "+numero1+" + " +numero2+" ?"

            }
            2 -> {//Resta

                while (numero2>=numero1) {
                    when (leccionResta) {
                        0,1,2 -> {
                            numero1 =  Random.nextInt(1, 6)
                            numero2 =  Random.nextInt(1, 3)
                        }
                        3,4-> {
                            numero1 =  Random.nextInt(1, 10)
                            numero2 =  Random.nextInt(1, 5)
                        }
                        5,6 -> {
                            numero1 =  Random.nextInt(11, 20)
                            numero2 =  Random.nextInt(5, 10)
                        }
                        7,8 -> {
                            numero1 =  Random.nextInt(20, 50)
                            numero2 =  Random.nextInt(10, 25)
                        }
                        9,10 -> {
                            numero1 =  Random.nextInt(50, 100)
                            numero2 =  Random.nextInt(25, 50)
                        }
                        else -> { // Opción default
                        }
                    }
                }

                respuestaCorrecta = numero1 - numero2
                PreguntaEjercicio2 = "¿Cuanto es "+numero1+" - " +numero2+" ?"

            }
            3 -> {//Multiplicacion

                when (leccionMultiplicacion) {
                    0,1,2 -> {
                        numero1 =  Random.nextInt(1, 9)
                        numero2 =  Random.nextInt(1, 9)
                    }
                    3,4-> {
                        numero1 =  Random.nextInt(4, 9)
                        numero2 =  Random.nextInt(4, 9)
                    }
                    5,6 -> {
                        numero1 =  Random.nextInt(10, 15)
                        numero2 =  Random.nextInt(10, 15)
                    }
                    7,8 -> {
                        numero1 =  Random.nextInt(20, 25)
                        numero2 =  Random.nextInt(20, 25)
                    }
                    9,10 -> {
                        numero1 =  Random.nextInt(25, 30)
                        numero2 =  Random.nextInt(25, 30)
                    }
                    else -> { // Opción default
                    }
                }
                respuestaCorrecta = numero1 * numero2
                PreguntaEjercicio2 = "¿Cuanto es "+numero1+" x " +numero2+" ?"

            }
            4 -> {//Division

                when (leccionDivision) {
                    0,1,2,3,4,5,6,7,8,9,10 -> {
                        var par = false
                        var numero1Random= Random.nextInt(2, 50)
                        print("ANTES DEL WHILE $numero1Random !!!!" )
                        while(par==false) {
                            print("ENTRO AL WHILE!!!!!!" )
                            numero1Random = Random.nextInt(2, 50)
                            var mod = numero1Random /2
                            print("ENTRO AL WHILE Y EL NUMERO ES: $numero1Random y su mod es: $mod !!!!!!!!!!!!" )
                            par = numero1Random % 2 == 0
                        }
                        numero1 = numero1Random
                        numero2 =  2
                    }
                    else -> { // Opción default
                    }
                }
                respuestaCorrecta = numero1 / numero2
                PreguntaEjercicio2 = "¿Cuanto es "+numero1+" ÷ " +numero2+" ?"







            }
        }




        preguntaEjercicioo.setText(""+PreguntaEjercicio2+"")





        //cardviews respuesta
        cardViewEsperandoRespuesta1.visibility = View.VISIBLE
        cardViewRespuestaCorrecta1.visibility = View.GONE
        cardViewRespuestaInCorrecta1.visibility = View.GONE

        //Cardview Incorrecto -respuesta correcta
        RespuestaInCorrectaTxt11.setText("La respuesta es:  "+respuestaCorrecta+"")
        seleccionaRespuesta1.setText("Selecciona la respuesta correcta")






        Confirmar1.setOnClickListener {


            if(textRespuestaUsuario.text.toString().isNotEmpty()){//si el edittext no esta vacio se realiza la accion

                if (textRespuestaUsuario.text.toString().toInt() == respuestaCorrecta.toString().toInt()){
                    cardViewEsperandoRespuesta1.visibility = View.GONE
                    cardViewRespuestaCorrecta1.visibility = View.VISIBLE
                    cardViewRespuestaInCorrecta1.visibility = View.GONE
                    textRespuestaUsuario.setEnabled(false)
                }else{

                    cardViewEsperandoRespuesta1.visibility = View.GONE
                    cardViewRespuestaCorrecta1.visibility = View.GONE
                    cardViewRespuestaInCorrecta1.visibility = View.VISIBLE
                    textRespuestaUsuario.setEnabled(false)
                }

            }else{//si el edittext esta vacio

                seleccionaRespuesta1.setText("No has seleccionado respuesta!")
                seleccionaRespuesta1.setTextColor(rgb(48, 144, 198))
            }




        }











        //variables de control de preguntas


        println("esta es la variable "+aciertos+"!!!!!!!!!!!!!!!!!!!!!!!!")
        println("esta es la variable "+errores+"!!!!!!!!!!!!!!!!!!!!!!!!")


        btn1Correcto.setOnClickListener {


            var ComenzarEjercicio = Intent(this, MenuAppPrincipal::class.java)

            if(aciertos == 10){

                ComenzarEjercicio = Intent(this, EjercicioTerminado::class.java)

            }else{

                var numEjercicio = Random.nextInt(1, 5)

                when (numEjercicio) {
                    1-> {
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

                //sumar aciertos
                if (aciertos != null) {
                    aciertos++
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





        btn1InCorrecto.setOnClickListener {

            var ComenzarEjercicio = Intent(this, MenuAppPrincipal::class.java)

            if(errores==3 ||errores==6){

                ComenzarEjercicio = Intent(this, MalaRacha::class.java)

            }else{

                var numEjercicio = Random.nextInt(1, 5)

                when (numEjercicio) {
                    1-> {
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
            }
            //sumar errores
            if (errores != null) {
                errores++
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

    //Validar el botton Atras de dispositivos andriod
    override fun onBackPressed() {


    }






}

