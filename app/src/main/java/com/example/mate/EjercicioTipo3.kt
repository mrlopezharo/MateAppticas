package com.example.mate

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ejercicio_tipo3.*
import kotlin.random.Random

class EjercicioTipo3 : AppCompatActivity() {


    val arrayEjercicio3 = IntArray(5)




    var opcion1 = false
    var opcion2 = false
    var respuestaUser1 = 0
    var respuestaUser2 = 0

    var resultadoFinalUser1 = 0
    var resultadoFinalUser2 = 0

    var apagar1 = true
    var apagar2 = true







    //VARIABLES DE LA BASE DE DATOS
    //Numero de Leccion
    var leccionSuma = 1
    var leccionResta = 1
    var leccionMultiplicacion = 1
    var leccionDivision = 1



//numeros de las respuestas
    var num1 =  0
    var num2 =  0
    var respuestaEjercicio3 = 0






































    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_tipo3)







        var bundle = intent.extras
        var aciertos = bundle?.getInt("aciertosEnLeccion")
        var errores = bundle?.getInt("errores")
        var tipoOperacion = bundle?.getInt("tipoOperacion")
        var nivelejercicio = bundle?.getInt("nivelejercicio")
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
                        num1 =  Random.nextInt(1, 6)
                        num2 =  Random.nextInt(1, 6)
                    }
                    3,4-> {
                        num1 =  Random.nextInt(1, 10)
                        num2 =  Random.nextInt(1, 10)
                    }
                    5,6 -> {
                        num1 =  Random.nextInt(10, 20)
                        num2 =  Random.nextInt(10, 20)
                    }
                    7,8 -> {
                        num1 =  Random.nextInt(20, 50)
                        num2 =  Random.nextInt(20, 50)
                    }
                    9,10 -> {
                        num1 =  Random.nextInt(50, 100)
                        num2 =  Random.nextInt(50, 100)
                    }
                    else -> { // Opción default
                    }
                }
                signoEjercicio.setText(" + ")
                respuestaEjercicio3 = num1 + num2

                preguntaEjercicioNumero3.setText(" = "+(num1+num2) +"")

            }
            2 -> {//Resta

                while (num2>=num1) {
                    when (leccionResta) {
                        0,1,2 -> {
                            num1 =  Random.nextInt(1, 6)
                            num2 =  Random.nextInt(1, 3)
                        }
                        3,4-> {
                            num1 =  Random.nextInt(1, 10)
                            num2 =  Random.nextInt(1, 5)
                        }
                        5,6 -> {
                            num1 =  Random.nextInt(11, 20)
                            num2 =  Random.nextInt(5, 10)
                        }
                        7,8 -> {
                            num1 =  Random.nextInt(20, 50)
                            num2 =  Random.nextInt(10, 25)
                        }
                        9,10 -> {
                            num1 =  Random.nextInt(50, 100)
                            num2 =  Random.nextInt(25, 50)
                        }
                        else -> { // Opción default
                        }
                    }

                }

                signoEjercicio.setText(" - ")
                respuestaEjercicio3 = num1 - num2
                preguntaEjercicioNumero3.setText(" = "+(num1-num2) +"")

            }
            3 -> {//Multiplicacion

                when (leccionMultiplicacion) {
                    0,1,2 -> {
                        num1 =  Random.nextInt(1, 9)
                        num2 =  Random.nextInt(1, 9)
                    }
                    3,4-> {
                        num1 =  Random.nextInt(4, 9)
                        num2 =  Random.nextInt(4, 9)
                    }
                    5,6 -> {
                        num1 =  Random.nextInt(10, 15)
                        num2 =  Random.nextInt(10, 15)
                    }
                    7,8 -> {
                        num1 =  Random.nextInt(20, 25)
                        num2 =  Random.nextInt(20, 25)
                    }
                    9,10 -> {
                        num1 =  Random.nextInt(25, 30)
                        num2 =  Random.nextInt(25, 30)
                    }
                    else -> { // Opción default
                    }
                }
                signoEjercicio.setText(" x ")
                respuestaEjercicio3 = num1 * num2
                preguntaEjercicioNumero3.setText(" = "+(num1 * num2) +"")

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
                        num1 = numero1Random
                        num2 =  2
                    }

                    else -> { // Opción default
                    }
                }
                signoEjercicio.setText(" ÷ ")
                respuestaEjercicio3 = num1 / num2
                preguntaEjercicioNumero3.setText(" = $respuestaEjercicio3")




            }
        }

































































































        for(i:Int in arrayEjercicio3.indices){

            when (tipoOperacion) {
                1 -> {//suma
                    when (leccionSuma) {
                        0,1,2,3,4,5,6,7,8,9,10 -> {
                            arrayEjercicio3[i] =  Random.nextInt(respuestaEjercicio3-10, respuestaEjercicio3+10)
                        }
                    }
                }
                2 -> {//resta
                    when (leccionResta) {
                        0,1,2,3,4,5,6,7,8,9,10 -> {
                            arrayEjercicio3[i] =  Random.nextInt(respuestaEjercicio3-10, respuestaEjercicio3+10)
                        }
                    }
                }
                3 -> {//multiplicacion

                    when (leccionMultiplicacion) {
                        0,1,2,3,4,5,6,7,8,9,10 -> {
                            arrayEjercicio3[i] =  Random.nextInt(respuestaEjercicio3-10, respuestaEjercicio3+10)
                        }
                    }
                }
                4 -> {//Division

                    when (leccionDivision) {
                        0,1,2,3,4,5,6,7,8,9,10 -> {
                            arrayEjercicio3[i] =  Random.nextInt(respuestaEjercicio3-10, respuestaEjercicio3+10)
                        }
                    }

                }
            }












































            var cont = 0

            while (cont<5){

                if(arrayEjercicio3[i] == arrayEjercicio3[cont] && i!=cont){






                    when (tipoOperacion) {
                        1 -> {//suma
                            when (leccionSuma) {
                                0,1,2,3,4,5,6,7,8,9,10 -> {
                                    arrayEjercicio3[i] =  Random.nextInt(respuestaEjercicio3-10, respuestaEjercicio3+10)
                                }
                            }
                        }
                        2 -> {//resta
                            when (leccionResta) {
                                0,1,2,3,4,5,6,7,8,9,10 -> {
                                    arrayEjercicio3[i] =  Random.nextInt(respuestaEjercicio3-10, respuestaEjercicio3+10)
                                }
                            }
                        }
                        3 -> {//multiplicacion

                            when (leccionMultiplicacion) {
                                0,1,2,3,4,5,6,7,8,9,10 -> {
                                    arrayEjercicio3[i] =  Random.nextInt(respuestaEjercicio3-10, respuestaEjercicio3+10)
                                }
                            }
                        }
                        4 -> {//Division

                            when (leccionDivision) {
                                0,1,2,3,4,5,6,7,8,9,10 -> {
                                    arrayEjercicio3[i] =  Random.nextInt(respuestaEjercicio3-10, respuestaEjercicio3+10)
                                }
                            }
                        }
                    }












                    println("un repetido")
                    cont = 0
                }else{
                    cont++

                }
            }
        }























        var resp1 = arrayEjercicio3[0]
        var resp2 = arrayEjercicio3[1]
        var resp3 = arrayEjercicio3[2]
        var resp4 = arrayEjercicio3[3]
        var resp5 = arrayEjercicio3[4]

        var random1 = 0
        var random2 = 0


        while (random1 == random2) {
            random1 = Random.nextInt(1, 5)
            random2 = Random.nextInt(1, 5)
            println("random1 = "+random1+"          random2 = "+random2+"")
        }

        when (random1) {
            1 -> {
                resp1=num1
            }
            2-> {
                resp2=num1
            }
            3 -> {
                resp3=num1
            }
            4 -> {
                resp4=num1
            }
            5 -> {
                resp5=num1
            }
            else -> { // Opción default
            }
        }

        when (random2) {
            1 -> {
                resp1=num2
            }
            2-> {
                resp2=num2
            }
            3 -> {
                resp3=num2
            }
            4 -> {
                resp4=num2
            }
            5 -> {
                resp5=num2
            }
            else -> { // Opción default
            }
        }




        btnRes1.setText(""+resp1+"")
        btnRes2.setText(""+resp2+"")
        btnRes3.setText(""+resp3+"")
        btnRes4.setText(""+resp4+"")
        btnRes5.setText(""+resp5+"")


        ocultarBotones()





        btnRes1.setOnClickListener {

            if(!opcion1){
                btn1Respuesta.visibility = View.VISIBLE
                btnRes1.visibility = View.GONE
                btn1Respuesta.setText(""+resp1+"")
                respuestaUser1=1
                opcion1=true
                resultadoFinalUser1=resp1
            }else if(!opcion2){
                btn1Respuesta1.visibility = View.VISIBLE
                btnRes1.visibility = View.GONE
                btn1Respuesta1.setText(""+resp1+"")
                respuestaUser2=1
                opcion2=true
                resultadoFinalUser2=resp1
            }
        }

        btnRes2.setOnClickListener {

            if(!opcion1){
                btn1Respuesta.visibility = View.VISIBLE
                btnRes2.visibility = View.GONE
                btn1Respuesta.setText(""+resp2+"")
                respuestaUser1=2
                opcion1=true
                resultadoFinalUser1=resp2
            }else if(!opcion2){
                btn1Respuesta1.visibility = View.VISIBLE
                btnRes2.visibility = View.GONE
                btn1Respuesta1.setText(""+resp2+"")
                respuestaUser2=2
                opcion2=true
                resultadoFinalUser2=resp2
            }
        }

        btnRes3.setOnClickListener {

            if(!opcion1){
                btn1Respuesta.visibility = View.VISIBLE
                btnRes3.visibility = View.GONE
                btn1Respuesta.setText(""+resp3+"")
                respuestaUser1=3
                opcion1=true
                resultadoFinalUser1=resp3
            }else if(!opcion2){
                btn1Respuesta1.visibility = View.VISIBLE
                btnRes3.visibility = View.GONE
                btn1Respuesta1.setText(""+resp3+"")
                respuestaUser2=3
                opcion2=true
                resultadoFinalUser2=resp3
            }
        }

        btnRes4.setOnClickListener {

            if(!opcion1){
                btn1Respuesta.visibility = View.VISIBLE
                btnRes4.visibility = View.GONE
                btn1Respuesta.setText(""+resp4+"")
                respuestaUser1=4
                opcion1=true
                resultadoFinalUser1=resp4
            }else if(!opcion2){
                btn1Respuesta1.visibility = View.VISIBLE
                btnRes4.visibility = View.GONE
                btn1Respuesta1.setText(""+resp4+"")
                respuestaUser2=4
                opcion2=true
                resultadoFinalUser2=resp4
            }
        }

        btnRes5.setOnClickListener {

            if(!opcion1){
                btn1Respuesta.visibility = View.VISIBLE
                btnRes5.visibility = View.GONE
                btn1Respuesta.setText(""+resp5+"")
                respuestaUser1=5
                opcion1=true
                resultadoFinalUser1=resp5
            }else if(!opcion2){
                btn1Respuesta1.visibility = View.VISIBLE
                btnRes5.visibility = View.GONE
                btn1Respuesta1.setText(""+resp5+"")
                respuestaUser2=5
                opcion2=true
                resultadoFinalUser2=resp5
            }
        }


        //botones de respuestas
        btn1Respuesta.setOnClickListener {

            if(opcion1 && apagar2){

                btn1Respuesta.visibility = View.GONE
                when (respuestaUser1) {
                    1 -> {
                        btnRes1.visibility = View.VISIBLE
                    }
                    2-> {
                        btnRes2.visibility = View.VISIBLE
                    }
                    3 -> {
                        btnRes3.visibility = View.VISIBLE
                    }
                    4 -> {
                        btnRes4.visibility = View.VISIBLE
                    }
                    5 -> {
                        btnRes5.visibility = View.VISIBLE
                    }
                    else -> { // Opción default
                    }
                }
                respuestaUser1=0
                opcion1=false
            }
        }


        btn1Respuesta1.setOnClickListener {

            if(opcion2 && apagar1){

                btn1Respuesta1.visibility = View.GONE

                when (respuestaUser2) {
                    1 -> {
                        btnRes1.visibility = View.VISIBLE
                    }
                    2-> {
                        btnRes2.visibility = View.VISIBLE
                    }
                    3 -> {
                        btnRes3.visibility = View.VISIBLE
                    }
                    4 -> {
                        btnRes4.visibility = View.VISIBLE
                    }
                    5 -> {
                        btnRes5.visibility = View.VISIBLE
                    }
                    else -> { // Opción default
                    }
                }
                respuestaUser2=0
                opcion2=false
            }
        }


        preguntaEjercicioNumero3.setText(" = $respuestaEjercicio3")




        CViewConfirmar.visibility = View.VISIBLE
        CViewIncorrecto.visibility = View.GONE
        CViewCorrecto.visibility = View.GONE
        seleccionaRespuesta.setText("Completa la operacion")


        Confirmar.setOnClickListener {//button confirmar inicio

            if (opcion1 && opcion2){
                if(resultadoFinalUser1+resultadoFinalUser2 == respuestaEjercicio3 || resultadoFinalUser1-resultadoFinalUser2 == respuestaEjercicio3 || resultadoFinalUser1*resultadoFinalUser2 == respuestaEjercicio3 ||resultadoFinalUser1/resultadoFinalUser2 == respuestaEjercicio3){

                    CViewConfirmar.visibility = View.GONE
                    CViewCorrecto.visibility = View.VISIBLE

                }else{

                    CViewConfirmar.visibility = View.GONE
                    CViewIncorrecto.visibility = View.VISIBLE

                    when (tipoOperacion) {
                        1->{
                            txtIncorrectoEj3.setText("Incorrecto, la respuesta es: "+num1+" + "+num2+" = "+respuestaEjercicio3+"")
                        }
                        2->{
                            txtIncorrectoEj3.setText("Incorrecto, la respuesta es: "+num1+" - "+num2+" = "+respuestaEjercicio3+"")
                        }
                        3->{
                            txtIncorrectoEj3.setText("Incorrecto, la respuesta es: "+num1+" x "+num2+" = "+respuestaEjercicio3+"")
                        }
                        4->{
                            txtIncorrectoEj3.setText("Incorrecto, la respuesta es: "+num1+" ÷ "+num2+" = "+respuestaEjercicio3+"")
                        }
                    }





                }
                apagar1 = false
                apagar2 = false
            }else{
                seleccionaRespuesta.setText("Selecciona tus respuestas!")
                seleccionaRespuesta.setTextColor(Color.rgb(48, 144, 198))

            }
        }//final button confirmar





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



    fun apagarBotones(){
        //apaga todos los botonones
        btn1Res1.setEnabled(false)
        btn1Res2.setEnabled(false)
        btn1Res3.setEnabled(false)
        btn1Res4.setEnabled(false)
        btn1Res5.setEnabled(false)
        btn1Respuesta.setEnabled(false)
        btn1Respuesta1.setEnabled(false)
    }

    fun ocultarBotones(){
        //apaga todos los botonones
        btn1Respuesta.visibility = View.GONE
        btn1Respuesta1.visibility = View.GONE


    }


    //Validar el botton Atras de dispositivos andriod
    override fun onBackPressed() {


    }








}




