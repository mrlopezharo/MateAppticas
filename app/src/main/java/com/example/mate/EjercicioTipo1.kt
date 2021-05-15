package com.example.mate

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Color.rgb
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ejercicio_tipo1.*
import kotlinx.android.synthetic.main.activity_menu_app_principal.*
import kotlin.random.Random


class EjercicioTipo1 : AppCompatActivity() {





    val array = IntArray(4)




    var boton1 = 0
    var boton2 = 0
    var boton3 = 0
    var boton4 = 0
    var boton5 = 0
    var respuestaFinal= 0

    var EstadoDeRespuesta = false
    var mostrarBotonRespuesta=0






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
    var PreguntaEjercicio1 = " "
























































    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_tipo1)





        var bundle = intent.extras
        var aciertos = bundle?.getInt("aciertosEnLeccion")
        var errores = bundle?.getInt("errores")

        var tipoOperacion = bundle?.getInt("tipoOperacion")
        var nivelejercicio = bundle?.getInt("nivelejercicio")
        var buttonSelect = bundle?.getInt("buttonSelect")

        var email = bundle?.getString("email")
        var provider = bundle?.getString("provider")










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
                    3,4 -> {
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
                PreguntaEjercicio1 = "¿Cuanto es "+numero1+" + " +numero2+" ?"

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
                PreguntaEjercicio1 = "¿Cuanto es "+numero1+" - " +numero2+" ?"

            }
            3 -> {//Multiplicacion

                when (leccionMultiplicacion) {
                    0,1,2 -> {
                        numero1 =  Random.nextInt(1, 9)
                        numero2 =  Random.nextInt(1, 9)
                    }
                    3,4 -> {
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
                PreguntaEjercicio1 = "¿Cuanto es "+numero1+" x " +numero2+" ?"

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
                PreguntaEjercicio1 = "¿Cuanto es "+numero1+" ÷ " +numero2+" ?"







            }
        }





















































        //generar pregunta
        preguntaEjercicio.setText(""+PreguntaEjercicio1+"")


        apagarBotonesSecundarios()






        for(i:Int in array.indices){






            when (tipoOperacion) {
                1 -> {//suma
                    when (leccionSuma) {
                        0,1,2 -> {
                            array[i] =  Random.nextInt(1, 6)
                        }
                        3,4-> {
                            array[i] =  Random.nextInt(1, 10)
                        }
                        5,6 -> {
                            array[i] =  Random.nextInt(10, 20)
                        }
                        7,8 -> {
                            array[i] =  Random.nextInt(20, 50)
                        }
                        9,10 -> {
                            array[i] =  Random.nextInt(50, 100)
                        }
                        else -> { // Opción default
                        }
                    }
                }
                2 -> {//resta
                    when (leccionResta) {
                        0,1,2 -> {
                            array[i] =  Random.nextInt(1, 6)
                        }
                        3,4-> {
                            array[i] =  Random.nextInt(1, 10)
                        }
                        5,6 -> {
                            array[i] =  Random.nextInt(10, 20)
                        }
                        7,8 -> {
                            array[i] =  Random.nextInt(25, 50)
                        }
                        9,10 -> {
                            array[i] =  Random.nextInt(50, 100)
                        }
                        else -> { // Opción default
                        }
                    }
                }
                3 -> {//multiplicacion

                    when (leccionMultiplicacion) {
                        0,1,2 -> {
                            array[i] =  Random.nextInt(4, 99)
                        }
                        3,4 -> {
                            array[i] =  Random.nextInt(4, 200)
                        }
                        5,6 -> {
                            array[i] =  Random.nextInt(25, 999)
                        }
                        7,8 -> {
                            array[i] =  Random.nextInt(25, 999)
                        }
                        9,10 -> {
                            array[i] =  Random.nextInt(25, 999)
                        }
                        else -> { // Opción default
                        }
                    }


                }
                4 -> {//Division

                    when (leccionDivision) {
                        0,1,2 -> {
                            array[i] =  Random.nextInt(1, 100)
                        }
                        3,4 -> {
                            array[i] =  Random.nextInt(1, 100)
                        }
                        5,6 -> {
                            array[i] =  Random.nextInt(1, 100)
                        }
                        7,8 -> {
                            array[i] =  Random.nextInt(1, 100)
                        }
                        9,10 -> {
                            array[i] =  Random.nextInt(1, 100)
                        }
                        else -> { // Opción default
                        }
                    }

                }
            }








            var cont = 0

            while (cont<4){

                if(array[i] == array[cont] && i!=cont || array[i] == respuestaCorrecta){

                    when (tipoOperacion) {
                        1 -> {//suma
                            when (leccionSuma) {
                                0,1,2 -> {

                                    array[i] =  Random.nextInt(1, 6)
                                }
                                3,4-> {
                                    array[i] =  Random.nextInt(1, 10)
                                }
                                5,6 -> {
                                    array[i] =  Random.nextInt(10, 20)
                                }
                                7,8 -> {
                                    array[i] =  Random.nextInt(20, 50)
                                }
                                9,10 -> {

                                    array[i] =  Random.nextInt(50, 100)
                                }
                                else -> { // Opción default
                                }
                            }
                        }
                        2 -> {//resta
                            when (leccionResta) {
                                0,1,2 -> {
                                    array[i] =  Random.nextInt(1, 6)
                                }
                                3,4-> {
                                    array[i] =  Random.nextInt(1, 10)
                                }
                                5,6 -> {
                                    array[i] =  Random.nextInt(10, 20)
                                }
                                7,8 -> {
                                    array[i] =  Random.nextInt(25, 50)
                                }
                                9,10 -> {
                                    array[i] =  Random.nextInt(50, 100)
                                }
                                else -> { // Opción default
                                }
                            }
                        }
                        3 -> {//multiplicacion

                            when (leccionMultiplicacion) {
                                0,1,2 -> {
                                    array[i] =  Random.nextInt(1, 99)
                                }
                                3,4-> {
                                    array[i] =  Random.nextInt(4, 200)
                                }
                                5,6 -> {
                                    array[i] =  Random.nextInt(10, 999)
                                }
                                7,8 -> {
                                    array[i] =  Random.nextInt(20, 999)
                                }
                                9,10 -> {
                                    array[i] =  Random.nextInt(25, 999)
                                }
                                else -> { // Opción default
                                }
                            }
                        }
                        4 -> {//Division

                            when (leccionDivision) {
                                0,1,2 -> {
                                    array[i] =  Random.nextInt(1, 100)
                                }
                                3,4-> {
                                    array[i] =  Random.nextInt(1, 100)
                                }
                                5,6 -> {
                                    array[i] =  Random.nextInt(1, 100)
                                }
                                7,8 -> {
                                    array[i] =  Random.nextInt(1, 100)
                                }
                                9,10 -> {
                                    array[i] =  Random.nextInt(1, 100)
                                }
                                else -> { // Opción default
                                }
                            }

                        }
                    }


                    //println("un repetido")
                    cont = 0
                }else{
                    cont++

                }
            }
        }




        for (n:Int in array.indices){

           // println("Estas son las posision $n es:  ${array[n]}")
        }
       // println(respuestaCorrecta)


        var respuesta1 = array[0]
        var respuesta2 = array[1]
        var respuesta3 = array[2]
        var respuesta4 = array[3]



        //modifique el until hasta 6 para testear
        var random = Random.nextInt(1, 6)

        when (random) {

            1 -> {
                boton1 = respuestaCorrecta
                boton2 = respuesta1
                boton3 = respuesta2
                boton4 = respuesta3
                boton5 = respuesta4
            }
            2-> {
                boton1 = respuesta1
                boton2 = respuestaCorrecta
                boton3 = respuesta2
                boton4 = respuesta3
                boton5 = respuesta4

            }
            3 -> {
                boton1 = respuesta1
                boton2 = respuesta2
                boton3 = respuestaCorrecta
                boton4 = respuesta3
                boton5 = respuesta4

            }
            4 -> {
                boton1 = respuesta1
                boton2 = respuesta2
                boton3 = respuesta3
                boton4 = respuestaCorrecta
                boton5 = respuesta4

            }

            5 -> {
                boton1 = respuesta1
                boton2 = respuesta2
                boton3 = respuesta3
                boton4 = respuesta4
                boton5 = respuestaCorrecta

            }

            else -> { // Opción default

            }
        }

        //botones 1 texto
        btnRespuesta.setText(""+boton1+"")
        btnRespuestaSeleccionada.setText(""+boton1+"")
        btnRespuestaCorrecta.setText(""+boton1+"")
        btnRespuestaError.setText(""+boton1+"")

        //botones 2 texto
        btnRespuesta1.setText(""+boton2+"")
        btnRespuestaSeleccionada1.setText(""+boton2+"")
        btnRespuestaCorrecta1.setText(""+boton2+"")
        btnRespuestaError1.setText(""+boton2+"")

        //botones 3 texto
        btnRespuesta2.setText(""+boton3+"")
        btnRespuestaSeleccionada2.setText(""+boton3+"")
        btnRespuestaCorrecta2.setText(""+boton3+"")
        btnRespuestaError2.setText(""+boton3+"")
        //botones 4 texto
        btnRespuesta3.setText(""+boton4+"")
        btnRespuestaSeleccionada3.setText(""+boton4+"")
        btnRespuestaCorrecta3.setText(""+boton4+"")
        btnRespuestaError3.setText(""+boton4+"")

        //botones 5 texto
        btnRespuesta4.setText(""+boton5+"")
        btnRespuestaSeleccionada4.setText(""+boton5+"")
        btnRespuestaCorrecta4.setText(""+boton5+"")
        btnRespuestaError4.setText(""+boton5+"")


        btnRespuesta.setOnClickListener {
            apagarBotonesSecundarios()
            btnRespuesta.visibility == View.GONE
            btnRespuestaSeleccionada.visibility = View.VISIBLE
            btnRespuestaSeleccionada.setText(""+boton1+"")
            respuestaFinal = boton1
            EstadoDeRespuesta=true
            mostrarBotonRespuesta=1
        }
        btnRespuesta1.setOnClickListener {
            apagarBotonesSecundarios()
            btnRespuesta1.visibility == View.GONE
            btnRespuestaSeleccionada1.visibility = View.VISIBLE
            btnRespuestaSeleccionada1.setText(""+boton2+"")
            respuestaFinal = boton2
            EstadoDeRespuesta=true
            mostrarBotonRespuesta=2

        }
        btnRespuesta2.setOnClickListener {
            apagarBotonesSecundarios()
            btnRespuesta2.visibility == View.GONE
            btnRespuestaSeleccionada2.visibility = View.VISIBLE
            btnRespuestaSeleccionada2.setText(""+boton3+"")
            respuestaFinal = boton3
            EstadoDeRespuesta=true
            mostrarBotonRespuesta=3
        }
        btnRespuesta3.setOnClickListener {
            apagarBotonesSecundarios()
            btnRespuesta3.visibility == View.GONE
            btnRespuestaSeleccionada3.visibility = View.VISIBLE
            btnRespuestaSeleccionada3.setText(""+boton4+"")
            respuestaFinal = boton4
            EstadoDeRespuesta=true
            mostrarBotonRespuesta=4
        }

        btnRespuesta4.setOnClickListener {
            apagarBotonesSecundarios()
            btnRespuesta4.visibility == View.GONE
            btnRespuestaSeleccionada4.visibility = View.VISIBLE
            btnRespuestaSeleccionada4.setText(""+boton5+"")
            respuestaFinal = boton5
            EstadoDeRespuesta=true
            mostrarBotonRespuesta=5
        }




        //cardviews respuesta
        cardViewEsperandoRespuesta.visibility = View.VISIBLE
        cardViewRespuestaCorrecta.visibility = View.GONE
        cardViewRespuestaInCorrecta.visibility = View.GONE



        //Cardview Incorrecto -respuesta correcta
        RespuestaInCorrectaTxt1.setText("La respuesta es:  "+respuestaCorrecta+"")

        seleccionaRespuesta.setText("Selecciona la respuesta correcta")


        Confirmar.setOnClickListener {

            if(EstadoDeRespuesta==true){

                if (respuestaFinal == respuestaCorrecta){

                    cardViewRespuestaCorrecta.visibility = View.VISIBLE //ENCENDIDO
                    cardViewRespuestaInCorrecta.visibility = View.GONE
                    cardViewEsperandoRespuesta.visibility = View.GONE
                    apagarBotones() //apagar todos los botones

                    when (mostrarBotonRespuesta) {

                        1 -> {
                         //   btnRespuesta.visibility = View.GONE
                            btnRespuestaSeleccionada.visibility = View.GONE
                            btnRespuestaCorrecta.visibility = View.VISIBLE
                            btnRespuestaError.visibility = View.GONE
                        }
                        2-> {
                          //  btnRespuesta1.visibility = View.GONE
                            btnRespuestaSeleccionada1.visibility = View.GONE
                            btnRespuestaCorrecta1.visibility = View.VISIBLE
                            btnRespuestaError1.visibility = View.GONE

                        }
                        3 -> {
                         //   btnRespuesta2.visibility = View.GONE
                            btnRespuestaSeleccionada2.visibility = View.GONE
                            btnRespuestaCorrecta2.visibility = View.VISIBLE
                            btnRespuestaError2.visibility = View.GONE

                        }
                        4 -> {
                         //   btnRespuesta3.visibility = View.GONE
                            btnRespuestaSeleccionada3.visibility = View.GONE
                            btnRespuestaCorrecta3.visibility = View.VISIBLE
                            btnRespuestaError3.visibility = View.GONE

                        }

                        5 -> {
                          //  btnRespuesta4.visibility = View.GONE
                            btnRespuestaSeleccionada4.visibility = View.GONE
                            btnRespuestaCorrecta4.visibility = View.VISIBLE
                            btnRespuestaError4.visibility = View.GONE

                        }

                        else -> { // Opción default

                        }
                    }





                }else{
                    cardViewRespuestaInCorrecta.visibility = View.VISIBLE //ENCENDIDO
                    cardViewRespuestaCorrecta.visibility = View.GONE
                    cardViewEsperandoRespuesta.visibility = View.GONE
                    apagarBotones() //apagar todos los botones

                    when (mostrarBotonRespuesta) {

                        1 -> {
                           // btnRespuesta.visibility = View.GONE
                            btnRespuestaSeleccionada.visibility = View.GONE
                            btnRespuestaCorrecta.visibility = View.GONE
                            btnRespuestaError.visibility = View.VISIBLE
                        }
                        2-> {
                          //  btnRespuesta1.visibility = View.GONE
                            btnRespuestaSeleccionada1.visibility = View.GONE
                            btnRespuestaCorrecta1.visibility = View.GONE
                            btnRespuestaError1.visibility = View.VISIBLE

                        }
                        3 -> {
                          //  btnRespuesta2.visibility = View.GONE
                            btnRespuestaSeleccionada2.visibility = View.GONE
                            btnRespuestaCorrecta2.visibility = View.GONE
                            btnRespuestaError2.visibility = View.VISIBLE

                        }
                        4 -> {
                         //   btnRespuesta3.visibility = View.GONE
                            btnRespuestaSeleccionada3.visibility = View.GONE
                            btnRespuestaCorrecta3.visibility = View.GONE
                            btnRespuestaError3.visibility = View.VISIBLE

                        }

                        5 -> {
                        //    btnRespuesta4.visibility = View.GONE
                            btnRespuestaSeleccionada4.visibility = View.GONE
                            btnRespuestaCorrecta4.visibility = View.GONE
                            btnRespuestaError4.visibility = View.VISIBLE

                        }

                        else -> { // Opción default

                        }
                    }












                }





            }else{

                seleccionaRespuesta.setText("No has seleccionado respuesta!")
                seleccionaRespuesta.setTextColor(rgb(48, 144, 198))
            }


        }
































        //variables de control de preguntas


        println("numero: "+ numero1+" este es el numero 2: "+numero2+" este es el resultado: "+respuestaCorrecta+"" )
        println("esta es la variable "+aciertos+"!!!!!!!!!!!!!!!!!!!!!!!!")
        println("esta es la variable "+errores+"!!!!!!!!!!!!!!!!!!!!!!!!")
        println("tipo de ejercicio: "+tipoOperacion+"")






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

            if (nivelejercicio != null) {
                b.putInt("nivelejercicio",nivelejercicio)
            }

            b.putString("email", email)
            b.putString("provider", provider)

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

            if (nivelejercicio != null) {
                b.putInt("nivelejercicio",nivelejercicio)
            }

            if (buttonSelect != null) {
                b.putInt("buttonSelect",buttonSelect)
            }


            b.putString("email", email)
            b.putString("provider", provider)

            finish()
            ComenzarEjercicio.putExtras(b)
            startActivity(ComenzarEjercicio)

        }





























































    }

    fun apagarBotonesSecundarios(){
        //ocultar botones
        btnRespuestaSeleccionada.visibility = View.GONE
        btnRespuestaCorrecta.visibility = View.GONE
        btnRespuestaError.visibility = View.GONE


        btnRespuestaSeleccionada1.visibility = View.GONE
        btnRespuestaCorrecta1.visibility = View.GONE
        btnRespuestaError1.visibility = View.GONE

        btnRespuestaSeleccionada2.visibility = View.GONE
        btnRespuestaCorrecta2.visibility = View.GONE
        btnRespuestaError2.visibility = View.GONE

        btnRespuestaSeleccionada3.visibility = View.GONE
        btnRespuestaCorrecta3.visibility = View.GONE
        btnRespuestaError3.visibility = View.GONE

        btnRespuestaSeleccionada4.visibility = View.GONE
        btnRespuestaCorrecta4.visibility = View.GONE
        btnRespuestaError4.visibility = View.GONE


    }






    fun apagarBotones(){
        //apaga todos los botonones
        btnRespuesta.setEnabled(false)
        btnRespuestaSeleccionada.setEnabled(false)



        btnRespuesta1.setEnabled(false)
        btnRespuestaSeleccionada1.setEnabled(false)




        btnRespuesta2.setEnabled(false)
        btnRespuestaSeleccionada2.setEnabled(false)



        btnRespuesta3.setEnabled(false)
        btnRespuestaSeleccionada3.setEnabled(false)


        btnRespuesta4.setEnabled(false)
        btnRespuestaSeleccionada4.setEnabled(false)



        btnRespuestaCorrecta.setEnabled(false)
        btnRespuestaError.setEnabled(false)
        btnRespuestaCorrecta1.setEnabled(false)
        btnRespuestaError1.setEnabled(false)
        btnRespuestaCorrecta2.setEnabled(false)
        btnRespuestaError2.setEnabled(false)
        btnRespuestaCorrecta3.setEnabled(false)
        btnRespuestaError3.setEnabled(false)
        btnRespuestaCorrecta4.setEnabled(false)
        btnRespuestaError4.setEnabled(false)
    }


    //Validar el botton Atras de dispositivos andriod
    override fun onBackPressed() {


    }








}



/*
        val states = arrayOf(intArrayOf(android.R.attr.state_pressed), IntArray(1))
        val colors = intArrayOf(rgb(28, 176, 246), Color.BLACK)
        val cState = ColorStateList(states, colors)
        btnRespuesta.setTextColor(cState)
*/
