package com.example.mate

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ejercicio_tipo4.*
import kotlin.random.Random

class EjercicioTipo4 : AppCompatActivity() {




    val arrayEjercicio4 = IntArray(3)

    val array = IntArray(3)

    var respuestaUsuarioN1 = 0
    var respuestaUsuarioN2 = 0
    var respuestaUsuarioN3 = 0

    var opcionUsuario1 = false
    var opcionUsuario2 = false
    var opcionUsuario3 = false

    var resultadoFinal1 = 0
    var resultadoFinal2 = 0
    var resultadoFinal3 = 0

    var apagarRespuesta1 = true
    var apagarRespuesta2 = true
    var apagarRespuesta3 = true






    //VARIABLES DE LA BASE DE DATOS
    //Numero de Leccion
    var leccionSuma = 1
    var leccionResta = 1
    var leccionMultiplicacion = 1
    var leccionDivision = 1



    //numeros de las respuestas
    var numero1 =  0
    var numero2 =  0
    var resultado1 = 0









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_tipo4)







        var bundle = intent.extras
        var aciertos = bundle?.getInt("aciertosEnLeccion")
        var errores = bundle?.getInt("errores")
        var nivelejercicio = bundle?.getInt("nivelejercicio")
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
                }
                resultado1 = numero1 + numero2
                signoEjercicio4.text = "+"

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
                    }
                }


                resultado1 = numero1 - numero2
                signoEjercicio4.text = "-"

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
                }
                resultado1 = numero1 * numero2
                signoEjercicio4.text = "x"

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

                }
                resultado1 = numero1 / numero2
                signoEjercicio4.text = "÷"





            }
        }











        ocultarBotones()


        arrayEjercicio4[0] = numero1
        arrayEjercicio4[1] = numero2
        arrayEjercicio4[2] = resultado1

        array[0]=0
        array[1]=0
        array[2]=0





        var cont = 0

        while (cont<3){
            var azar = Random.nextInt(0, 3)

            if(array[azar]==0){
                array[azar] = arrayEjercicio4[cont]

                cont++
            }
        }



        val respuesta1 = array[0]
        val respuesta2 = array[1]
        val respuesta3 = array[2]


        btn.setText(""+respuesta1+"")
        btn1.setText(""+respuesta2+"")
        btn2.setText(""+respuesta3+"")




        //botones de respuestas

        btn2.setOnClickListener{

            if(!opcionUsuario1){
                btn1Respuesta.visibility = View.VISIBLE
                btn2.visibility = View.GONE
                btn1Respuesta.setText(""+respuesta3+"")
                respuestaUsuarioN1=3
                opcionUsuario1=true
                resultadoFinal1=respuesta3
            }else if(!opcionUsuario2){
                btn1Respuesta1.visibility = View.VISIBLE
                btn2.visibility = View.GONE
                btn1Respuesta1.setText(""+respuesta3+"")
                respuestaUsuarioN2=3
                opcionUsuario2=true
                resultadoFinal2=respuesta3

            }else if(!opcionUsuario3){
                btn1Respuesta2.visibility = View.VISIBLE
                btn2.visibility = View.GONE
                btn1Respuesta2.setText(""+respuesta3+"")
                respuestaUsuarioN3=3
                opcionUsuario3=true
                resultadoFinal3=respuesta3

            }

        }

        btn.setOnClickListener{

            if(!opcionUsuario1){
                btn1Respuesta.visibility = View.VISIBLE
                btn.visibility = View.GONE
                btn1Respuesta.setText(""+respuesta1+"")
                respuestaUsuarioN1=1
                opcionUsuario1=true
                resultadoFinal1=respuesta1
            }else if(!opcionUsuario2){
                btn1Respuesta1.visibility = View.VISIBLE
                btn.visibility = View.GONE
                btn1Respuesta1.setText(""+respuesta1+"")
                respuestaUsuarioN2=1
                opcionUsuario2=true
                resultadoFinal2=respuesta1

            }else if(!opcionUsuario3){
                btn1Respuesta2.visibility = View.VISIBLE
                btn.visibility = View.GONE
                btn1Respuesta2.setText(""+respuesta1+"")
                respuestaUsuarioN3=1
                opcionUsuario3=true
                resultadoFinal3=respuesta1

            }

        }

        btn1.setOnClickListener{

            if(!opcionUsuario1){
                btn1Respuesta.visibility = View.VISIBLE
                btn1.visibility = View.GONE
                btn1Respuesta.setText(""+respuesta2+"")
                respuestaUsuarioN1=2
                opcionUsuario1=true
                resultadoFinal1=respuesta2
            }else if(!opcionUsuario2){
                btn1Respuesta1.visibility = View.VISIBLE
                btn1.visibility = View.GONE
                btn1Respuesta1.setText(""+respuesta2+"")
                respuestaUsuarioN2=2
                opcionUsuario2=true
                resultadoFinal2=respuesta2

            }else if(!opcionUsuario3){
                btn1Respuesta2.visibility = View.VISIBLE
                btn1.visibility = View.GONE
                btn1Respuesta2.setText(""+respuesta2+"")
                respuestaUsuarioN3=2
                opcionUsuario3=true
                resultadoFinal3=respuesta2

            }

        }




        //botones de las respuestas seleccionadas

        btn1Respuesta.setOnClickListener {

            if(opcionUsuario1 && apagarRespuesta1){

                btn1Respuesta.visibility = View.GONE
                when (respuestaUsuarioN1) {
                    1 -> {
                        btn.visibility = View.VISIBLE
                    }
                    2-> {
                        btn1.visibility = View.VISIBLE
                    }
                    3 -> {
                        btn2.visibility = View.VISIBLE
                    }
                    else -> { // Opción default
                    }
                }
                respuestaUsuarioN1=0
                opcionUsuario1=false
            }
        }



        btn1Respuesta1.setOnClickListener {

            if(opcionUsuario2 && apagarRespuesta2){

                btn1Respuesta1.visibility = View.GONE
                when (respuestaUsuarioN2) {
                    1 -> {
                        btn.visibility = View.VISIBLE
                    }
                    2-> {
                        btn1.visibility = View.VISIBLE
                    }
                    3 -> {
                        btn2.visibility = View.VISIBLE
                    }
                    else -> { // Opción default
                    }
                }
                respuestaUsuarioN2=0
                opcionUsuario2=false
            }
        }


        btn1Respuesta2.setOnClickListener {

            if(opcionUsuario3 && apagarRespuesta3){

                btn1Respuesta2.visibility = View.GONE
                when (respuestaUsuarioN3) {
                    1 -> {
                        btn.visibility = View.VISIBLE
                    }
                    2-> {
                        btn1.visibility = View.VISIBLE
                    }
                    3 -> {
                        btn2.visibility = View.VISIBLE
                    }
                    else -> { // Opción default
                    }
                }
                respuestaUsuarioN3=0
                opcionUsuario3=false
            }
        }






        //comprobar respuesta


        CViewConfirmarEjercicio4.visibility = View.VISIBLE
        CViewIncorrectoEjercicio4.visibility = View.GONE
        CViewCorrectoEjercicio4.visibility = View.GONE

        selecRespuesta.setText("Acomoda la operacion")


        Confirmar.setOnClickListener {

            if (opcionUsuario1 && opcionUsuario2 && opcionUsuario3){
                if(resultadoFinal3 == resultado1 && (resultadoFinal1+resultadoFinal2) == resultadoFinal3 || resultadoFinal3 == resultado1 && (resultadoFinal1-resultadoFinal2) == resultadoFinal3 || resultadoFinal3 == resultado1 && (resultadoFinal1*resultadoFinal2) == resultadoFinal3 || resultadoFinal3 == resultado1 && (resultadoFinal1/resultadoFinal2) == resultadoFinal3){
                    CViewConfirmarEjercicio4.visibility = View.GONE
                    CViewCorrectoEjercicio4.visibility = View.VISIBLE
                }else{
                    CViewConfirmarEjercicio4.visibility = View.GONE
                    CViewIncorrectoEjercicio4.visibility = View.VISIBLE

                    when (tipoOperacion) {
                        1->{
                            txtIncorrectoEj4.setText("Incorrecto, la respuesta es: "+numero1+" + "+numero2+" = "+resultado1+"")
                        }
                        2->{
                            txtIncorrectoEj4.setText("Incorrecto, la respuesta es: "+numero1+" - "+numero2+" = "+resultado1+"")
                        }
                        3->{
                            txtIncorrectoEj4.setText("Incorrecto, la respuesta es: "+numero1+" x "+numero2+" = "+resultado1+"")
                        }
                        4->{
                            txtIncorrectoEj4.setText("Incorrecto, la respuesta es: "+numero1+" ÷ "+numero2+" = "+resultado1+"")
                        }
                    }



                }
                apagarRespuesta1 = false
                apagarRespuesta2 = false
                apagarRespuesta3 = false
            }else{
                selecRespuesta.setText("Selecciona tus respuestas!")
                selecRespuesta.setTextColor(Color.rgb(48, 144, 198))
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

    fun ocultarBotones(){
        //botones para seleccionar
        btn1Respuesta.visibility = View.GONE
        btn1Respuesta1.visibility = View.GONE
        btn1Respuesta2.visibility = View.GONE

    }

    //Validar el botton Atras de dispositivos andriod
    override fun onBackPressed() {


    }






}


