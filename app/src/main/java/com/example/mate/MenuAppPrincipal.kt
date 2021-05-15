package com.example.mate

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.facebook.login.LoginManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_menu_app_principal.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlin.math.absoluteValue
import kotlin.properties.Delegates
import kotlin.random.Random


enum class ProviderType{
    BASIC,
    GOOGLE,
    FACEBOOK
}


class MenuAppPrincipal : AppCompatActivity() {



    private val db = FirebaseFirestore.getInstance()

    //prueba de imagen
    var img : ImageView? = null







    var usuarioRegistrado = 1



    //SUMAS
    var leccionNivel0Suma1 = 0
    var leccionNivel1Suma1 = 0
    var leccionNivel2Suma1 = 0
    var leccionNivel3Suma1 = 0
    var leccionNivel4Suma1 = 0
    var leccionNivel5Suma1 = 0

    var leccionNivel0Suma2 = 0
    var leccionNivel1Suma2 = 0
    var leccionNivel2Suma2 = 0
    var leccionNivel3Suma2 = 0
    var leccionNivel4Suma2 = 0
    var leccionNivel5Suma2 = 0

    var leccionNivel0Suma3 = 0
    var leccionNivel1Suma3 = 0
    var leccionNivel2Suma3 = 0
    var leccionNivel3Suma3 = 0
    var leccionNivel4Suma3 = 0
    var leccionNivel5Suma3 = 0

    var leccionNivel0Suma4 = 0
    var leccionNivel1Suma4 = 0
    var leccionNivel2Suma4 = 0
    var leccionNivel3Suma4 = 0
    var leccionNivel4Suma4 = 0
    var leccionNivel5Suma4 = 0
    //Resta
    var leccionNivel0Resta1 = 0
    var leccionNivel1Resta1 = 0
    var leccionNivel2Resta1 = 0
    var leccionNivel3Resta1 = 0
    var leccionNivel4Resta1 = 0
    var leccionNivel5Resta1 = 0

    var leccionNivel0Resta2 = 0
    var leccionNivel1Resta2 = 0
    var leccionNivel2Resta2 = 0
    var leccionNivel3Resta2 = 0
    var leccionNivel4Resta2 = 0
    var leccionNivel5Resta2 = 0

    var leccionNivel0Resta3 = 0
    var leccionNivel1Resta3 = 0
    var leccionNivel2Resta3 = 0
    var leccionNivel3Resta3 = 0
    var leccionNivel4Resta3 = 0
    var leccionNivel5Resta3 = 0

    var leccionNivel0Resta4 = 0
    var leccionNivel1Resta4 = 0
    var leccionNivel2Resta4 = 0
    var leccionNivel3Resta4 = 0
    var leccionNivel4Resta4 = 0
    var leccionNivel5Resta4 = 0



    //Multiplicacion
    var leccionNivel0Multiplicacion1 = 0
    var leccionNivel1Multiplicacion1 = 0
    var leccionNivel2Multiplicacion1 = 0
    var leccionNivel3Multiplicacion1 = 0
    var leccionNivel4Multiplicacion1 = 0
    var leccionNivel5Multiplicacion1 = 0

    var leccionNivel0Multiplicacion2 = 0
    var leccionNivel1Multiplicacion2 = 0
    var leccionNivel2Multiplicacion2 = 0
    var leccionNivel3Multiplicacion2 = 0
    var leccionNivel4Multiplicacion2 = 0
    var leccionNivel5Multiplicacion2 = 0

    var leccionNivel0Multiplicacion3 = 0
    var leccionNivel1Multiplicacion3 = 0
    var leccionNivel2Multiplicacion3 = 0
    var leccionNivel3Multiplicacion3 = 0
    var leccionNivel4Multiplicacion3 = 0
    var leccionNivel5Multiplicacion3 = 0

    var leccionNivel0Multiplicacion4 = 0
    var leccionNivel1Multiplicacion4 = 0
    var leccionNivel2Multiplicacion4 = 0
    var leccionNivel3Multiplicacion4 = 0
    var leccionNivel4Multiplicacion4 = 0
    var leccionNivel5Multiplicacion4 = 0



    //Division
    var leccionNivel0Division1 = 0
    var leccionNivel1Division1 = 0
    var leccionNivel2Division1 = 0
    var leccionNivel3Division1 = 0
    var leccionNivel4Division1 = 0
    var leccionNivel5Division1 = 0

    var leccionNivel0Division2 = 0
    var leccionNivel1Division2 = 0
    var leccionNivel2Division2 = 0
    var leccionNivel3Division2 = 0
    var leccionNivel4Division2 = 0
    var leccionNivel5Division2 = 0

    var leccionNivel0Division3 = 0
    var leccionNivel1Division3 = 0
    var leccionNivel2Division3 = 0
    var leccionNivel3Division3 = 0
    var leccionNivel4Division3 = 0
    var leccionNivel5Division3 = 0

    var leccionNivel0Division4 = 0
    var leccionNivel1Division4 = 0
    var leccionNivel2Division4 = 0
    var leccionNivel3Division4 = 0
    var leccionNivel4Division4 = 0
    var leccionNivel5Division4 = 0































    var leccionNivelSuma1 = 0
    var leccionNivelSuma2 = 0
    var leccionNivelSuma3 = 0
    var leccionNivelSuma4 = 0
    //resta
    var leccionNivelResta1 = 0
    var leccionNivelResta2 = 0
    var leccionNivelResta3 = 0
    var leccionNivelResta4 = 0
    //Multi
    var leccionNivelMultiplicacion1 = 0
    var leccionNivelMultiplicacion2 = 0
    var leccionNivelMultiplicacion3 = 0
    var leccionNivelMultiplicacion4 = 0
    //Divi
    var leccionNivelDivision1 = 0
    var leccionNivelDivision2 = 0
    var leccionNivelDivision3 = 0
    var leccionNivelDivision4 = 0
    //ASIGNAR NIVELES DE LAS DIFERENTES OPERACIONES
    //suma


    var nsuma1 = 0
    var nsuma2 = 0
    var nsuma3 = 0
    var nsuma4 = 0
    //resta
    var nresta1 = 0
    var nresta2 = 0
    var nresta3 = 0
    var nresta4 = 0
    //multi
    var nmulti1 = 0
    var nmulti2 = 0
    var nmulti3 = 0
    var nmulti4 = 0
    //divi
    var ndivi1 = 0
    var ndivi2 = 0
    var ndivi3 = 0
    var ndivi4 = 0

    var nsuma1prueba= 0
    var nsuma2prueba= 0
    var nsuma3prueba= 0
    var nsuma4prueba= 0

    var nresta1prueba = 0
    var nresta2prueba = 0
    var nresta3prueba = 0
    var nresta4prueba = 0

    var nmulti1prueba = 0
    var nmulti2prueba = 0
    var nmulti3prueba = 0
    var nmulti4prueba = 0

    var ndivi1prueba = 0
    var ndivi2prueba = 0
    var ndivi3prueba = 0
    var ndivi4prueba = 0

    //nivel de la leccion





    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_app_principal)








        var bundle = intent.extras
        //PROVEDORES Y EMAIL POR MEDIO DE LOGIN
        val email:String? =bundle?.getString("email")
        val provider:String? =bundle?.getString("provider")
        setup(email ?:"", provider ?:"")

        //GUARDO DE DATOS (GUARDADO DE SESSION)
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
        prefs.putString("email", email)
        prefs.putString("provider", provider)
        prefs.apply()








        if (email != null) {
            db.collection("user").document(email).get().addOnSuccessListener {


                //traer variables desde la base de datos en tiempo real.
                nsuma1prueba = it.getLong("nsuma1")?.toInt()!!//suma
                nsuma2prueba = it.getLong("nsuma2")?.toInt()!!
                nsuma3prueba = it.getLong("nsuma3")?.toInt()!!
                nsuma4prueba = it.getLong("nsuma4")?.toInt()!!

                nresta1prueba = it.getLong("nresta1")?.toInt()!!//resta
                nresta2prueba = it.getLong("nresta2")?.toInt()!!
                nresta3prueba = it.getLong("nresta3")?.toInt()!!
                nresta4prueba = it.getLong("nresta4")?.toInt()!!

                nmulti1prueba = it.getLong("nmulti1")?.toInt()!!//multiplicacion
                nmulti2prueba = it.getLong("nmulti2")?.toInt()!!
                nmulti3prueba = it.getLong("nmulti3")?.toInt()!!
                nmulti4prueba = it.getLong("nmulti4")?.toInt()!!

                ndivi1prueba = it.getLong("ndivi1")?.toInt()!!//division
                ndivi2prueba = it.getLong("ndivi2")?.toInt()!!
                ndivi3prueba = it.getLong("ndivi3")?.toInt()!!
                ndivi4prueba = it.getLong("ndivi4")?.toInt()!!

                leccionNivel0Suma1 = it.getLong("leccionNivel0Suma1")?.toInt()!!//suma
                leccionNivel1Suma1 = it.getLong("leccionNivel1Suma1")?.toInt()!!//suma
                leccionNivel2Suma1 = it.getLong("leccionNivel2Suma1")?.toInt()!!//suma
                leccionNivel3Suma1 = it.getLong("leccionNivel3Suma1")?.toInt()!!//suma
                leccionNivel4Suma1 = it.getLong("leccionNivel4Suma1")?.toInt()!!//suma
                leccionNivel5Suma1 = it.getLong("leccionNivel5Suma1")?.toInt()!!//suma

                leccionNivel0Suma2 = it.getLong("leccionNivel0Suma2")?.toInt()!!//suma
                leccionNivel1Suma2 = it.getLong("leccionNivel1Suma2")?.toInt()!!//suma
                leccionNivel2Suma2 = it.getLong("leccionNivel2Suma2")?.toInt()!!//suma
                leccionNivel3Suma2 = it.getLong("leccionNivel3Suma2")?.toInt()!!//suma
                leccionNivel4Suma2 = it.getLong("leccionNivel4Suma2")?.toInt()!!//suma
                leccionNivel5Suma2 = it.getLong("leccionNivel5Suma2")?.toInt()!!//suma

                leccionNivel0Suma3 = it.getLong("leccionNivel0Suma3")?.toInt()!!//suma
                leccionNivel1Suma3 = it.getLong("leccionNivel1Suma3")?.toInt()!!//suma
                leccionNivel2Suma3 = it.getLong("leccionNivel2Suma3")?.toInt()!!//suma
                leccionNivel3Suma3 = it.getLong("leccionNivel3Suma3")?.toInt()!!//suma
                leccionNivel4Suma3 = it.getLong("leccionNivel4Suma3")?.toInt()!!//suma
                leccionNivel5Suma3 = it.getLong("leccionNivel5Suma3")?.toInt()!!//suma

                leccionNivel0Suma4 = it.getLong("leccionNivel0Suma4")?.toInt()!!//suma
                leccionNivel1Suma4 = it.getLong("leccionNivel1Suma4")?.toInt()!!//suma
                leccionNivel2Suma4 = it.getLong("leccionNivel2Suma4")?.toInt()!!//suma
                leccionNivel3Suma4 = it.getLong("leccionNivel3Suma4")?.toInt()!!//suma
                leccionNivel4Suma4 = it.getLong("leccionNivel4Suma4")?.toInt()!!//suma
                leccionNivel5Suma4 = it.getLong("leccionNivel5Suma4")?.toInt()!!//suma

                //Resta
                leccionNivel0Resta1 = it.getLong("leccionNivel0Resta1")?.toInt()!!//Resta
                leccionNivel1Resta1 = it.getLong("leccionNivel1Resta1")?.toInt()!!//Resta
                leccionNivel2Resta1 = it.getLong("leccionNivel2Resta1")?.toInt()!!//Resta
                leccionNivel3Resta1 = it.getLong("leccionNivel3Resta1")?.toInt()!!//Resta
                leccionNivel4Resta1 = it.getLong("leccionNivel4Resta1")?.toInt()!!//Resta
                leccionNivel5Resta1 = it.getLong("leccionNivel5Resta1")?.toInt()!!//Resta

                leccionNivel0Resta2 = it.getLong("leccionNivel0Resta2")?.toInt()!!//Resta
                leccionNivel1Resta2 = it.getLong("leccionNivel1Resta2")?.toInt()!!//Resta
                leccionNivel2Resta2 = it.getLong("leccionNivel2Resta2")?.toInt()!!//Resta
                leccionNivel3Resta2 = it.getLong("leccionNivel3Resta2")?.toInt()!!//Resta
                leccionNivel4Resta2 = it.getLong("leccionNivel4Resta2")?.toInt()!!//Resta
                leccionNivel5Resta2 = it.getLong("leccionNivel5Resta2")?.toInt()!!//Resta

                leccionNivel0Resta3 = it.getLong("leccionNivel0Resta3")?.toInt()!!//Resta
                leccionNivel1Resta3 = it.getLong("leccionNivel1Resta3")?.toInt()!!//Resta
                leccionNivel2Resta3 = it.getLong("leccionNivel2Resta3")?.toInt()!!//Resta
                leccionNivel3Resta3 = it.getLong("leccionNivel3Resta3")?.toInt()!!//Resta
                leccionNivel4Resta3 = it.getLong("leccionNivel4Resta3")?.toInt()!!//Resta
                leccionNivel5Resta3 = it.getLong("leccionNivel5Resta3")?.toInt()!!//Resta

                leccionNivel0Resta4 = it.getLong("leccionNivel0Resta4")?.toInt()!!//Resta
                leccionNivel1Resta4 = it.getLong("leccionNivel1Resta4")?.toInt()!!//Resta
                leccionNivel2Resta4 = it.getLong("leccionNivel2Resta4")?.toInt()!!//Resta
                leccionNivel3Resta4 = it.getLong("leccionNivel3Resta4")?.toInt()!!//Resta
                leccionNivel4Resta4 = it.getLong("leccionNivel4Resta4")?.toInt()!!//Resta
                leccionNivel5Resta4 = it.getLong("leccionNivel5Resta4")?.toInt()!!//Resta



                //Multiplicacion
                leccionNivel0Multiplicacion1 = it.getLong("leccionNivel0Multiplicacion1")?.toInt()!!//Multiplicacion
                leccionNivel1Multiplicacion1 = it.getLong("leccionNivel1Multiplicacion1")?.toInt()!!//Multiplicacion
                leccionNivel2Multiplicacion1 = it.getLong("leccionNivel2Multiplicacion1")?.toInt()!!//Multiplicacion
                leccionNivel3Multiplicacion1 = it.getLong("leccionNivel3Multiplicacion1")?.toInt()!!//Multiplicacion
                leccionNivel4Multiplicacion1 = it.getLong("leccionNivel4Multiplicacion1")?.toInt()!!//Multiplicacion
                leccionNivel5Multiplicacion1 = it.getLong("leccionNivel5Multiplicacion1")?.toInt()!!//Multiplicacion

                leccionNivel0Multiplicacion2 = it.getLong("leccionNivel0Multiplicacion2")?.toInt()!!//Multiplicacion
                leccionNivel1Multiplicacion2 = it.getLong("leccionNivel1Multiplicacion2")?.toInt()!!//Multiplicacion
                leccionNivel2Multiplicacion2 = it.getLong("leccionNivel2Multiplicacion2")?.toInt()!!//Multiplicacion
                leccionNivel3Multiplicacion2 = it.getLong("leccionNivel3Multiplicacion2")?.toInt()!!//Multiplicacion
                leccionNivel4Multiplicacion2 = it.getLong("leccionNivel4Multiplicacion2")?.toInt()!!//Multiplicacion
                leccionNivel5Multiplicacion2 = it.getLong("leccionNivel5Multiplicacion2")?.toInt()!!//Multiplicacion

                leccionNivel0Multiplicacion3 = it.getLong("leccionNivel0Multiplicacion3")?.toInt()!!//Multiplicacion
                leccionNivel1Multiplicacion3 = it.getLong("leccionNivel1Multiplicacion3")?.toInt()!!//Multiplicacion
                leccionNivel2Multiplicacion3 = it.getLong("leccionNivel2Multiplicacion3")?.toInt()!!//Multiplicacion
                leccionNivel3Multiplicacion3 = it.getLong("leccionNivel3Multiplicacion3")?.toInt()!!//Multiplicacion
                leccionNivel4Multiplicacion3 = it.getLong("leccionNivel4Multiplicacion3")?.toInt()!!//Multiplicacion
                leccionNivel5Multiplicacion3 = it.getLong("leccionNivel5Multiplicacion3")?.toInt()!!//Multiplicacion

                leccionNivel0Multiplicacion4 = it.getLong("leccionNivel0Multiplicacion4")?.toInt()!!//Multiplicacion
                leccionNivel1Multiplicacion4 = it.getLong("leccionNivel1Multiplicacion4")?.toInt()!!//Multiplicacion
                leccionNivel2Multiplicacion4 = it.getLong("leccionNivel2Multiplicacion4")?.toInt()!!//Multiplicacion
                leccionNivel3Multiplicacion4 = it.getLong("leccionNivel3Multiplicacion4")?.toInt()!!//Multiplicacion
                leccionNivel4Multiplicacion4 = it.getLong("leccionNivel4Multiplicacion4")?.toInt()!!//Multiplicacion
                leccionNivel5Multiplicacion4 = it.getLong("leccionNivel5Multiplicacion4")?.toInt()!!//Multiplicacion



                //Division
                leccionNivel0Division1 = it.getLong("leccionNivel0Division1")?.toInt()!!//Division
                leccionNivel1Division1 = it.getLong("leccionNivel1Division1")?.toInt()!!//Division
                leccionNivel2Division1 = it.getLong("leccionNivel2Division1")?.toInt()!!//Division
                leccionNivel3Division1 = it.getLong("leccionNivel3Division1")?.toInt()!!//Division
                leccionNivel4Division1 = it.getLong("leccionNivel4Division1")?.toInt()!!//Division
                leccionNivel5Division1 = it.getLong("leccionNivel5Division1")?.toInt()!!//Division

                leccionNivel0Division2 = it.getLong("leccionNivel0Division2")?.toInt()!!//Division
                leccionNivel1Division2 = it.getLong("leccionNivel1Division2")?.toInt()!!//Division
                leccionNivel2Division2 = it.getLong("leccionNivel2Division2")?.toInt()!!//Division
                leccionNivel3Division2 = it.getLong("leccionNivel3Division2")?.toInt()!!//Division
                leccionNivel4Division2 = it.getLong("leccionNivel4Division2")?.toInt()!!//Division
                leccionNivel5Division2 = it.getLong("leccionNivel5Division2")?.toInt()!!//Division

                leccionNivel0Division3 = it.getLong("leccionNivel0Division3")?.toInt()!!//Division
                leccionNivel1Division3 = it.getLong("leccionNivel1Division3")?.toInt()!!//Division
                leccionNivel2Division3 = it.getLong("leccionNivel2Division3")?.toInt()!!//Division
                leccionNivel3Division3 = it.getLong("leccionNivel3Division3")?.toInt()!!//Division
                leccionNivel4Division3 = it.getLong("leccionNivel4Division3")?.toInt()!!//Division
                leccionNivel5Division3 = it.getLong("leccionNivel5Division3")?.toInt()!!//Division

                leccionNivel0Division4 = it.getLong("leccionNivel0Division4")?.toInt()!!//Division
                leccionNivel1Division4 = it.getLong("leccionNivel1Division4")?.toInt()!!//Division
                leccionNivel2Division4 = it.getLong("leccionNivel2Division4")?.toInt()!!//Division
                leccionNivel3Division4 = it.getLong("leccionNivel3Division4")?.toInt()!!//Division
                leccionNivel4Division4 = it.getLong("leccionNivel4Division4")?.toInt()!!//Division
                leccionNivel5Division4 = it.getLong("leccionNivel5Division4")?.toInt()!!//Division


                //asignar valores de la base de datos para los efectos visuales
                nsuma1 =nsuma1prueba
                nsuma2 =nsuma2prueba
                nsuma3 =nsuma3prueba
                nsuma4 =nsuma4prueba

                nresta1= nresta1prueba
                nresta2= nresta2prueba
                nresta3= nresta3prueba
                nresta4= nresta4prueba

                nmulti1 = nmulti1prueba
                nmulti2 = nmulti2prueba
                nmulti3 = nmulti3prueba
                nmulti4 = nmulti4prueba

                ndivi1 = ndivi1prueba
                ndivi2 = ndivi2prueba
                ndivi3 = ndivi3prueba
                ndivi4 = ndivi4prueba


                when(nsuma1){//suma
                    0->{leccionNivelSuma1 = leccionNivel0Suma1 }
                    1->{leccionNivelSuma1 = leccionNivel1Suma1 }
                    2->{leccionNivelSuma1 = leccionNivel2Suma1 }
                    3->{leccionNivelSuma1 = leccionNivel3Suma1 }
                    4->{leccionNivelSuma1 = leccionNivel4Suma1 }
                    5->{leccionNivelSuma1 = leccionNivel5Suma1 }
                }
                when(nsuma2){
                    0->{leccionNivelSuma2 = leccionNivel0Suma2 }
                    1->{leccionNivelSuma2 = leccionNivel1Suma2 }
                    2->{leccionNivelSuma2 = leccionNivel2Suma2 }
                    3->{leccionNivelSuma2 = leccionNivel3Suma2 }
                    4->{leccionNivelSuma2 = leccionNivel4Suma2 }
                    5->{leccionNivelSuma2 = leccionNivel5Suma2 }
                }
                when(nsuma3){
                    0->{leccionNivelSuma3 = leccionNivel0Suma3 }
                    1->{leccionNivelSuma3 = leccionNivel1Suma3 }
                    2->{leccionNivelSuma3 = leccionNivel2Suma3 }
                    3->{leccionNivelSuma3 = leccionNivel3Suma3 }
                    4->{leccionNivelSuma3 = leccionNivel4Suma3 }
                    5->{leccionNivelSuma3 = leccionNivel5Suma3 }
                }
                when(nsuma4){
                    0->{leccionNivelSuma4 = leccionNivel0Suma4 }
                    1->{leccionNivelSuma4 = leccionNivel1Suma4 }
                    2->{leccionNivelSuma4 = leccionNivel2Suma4 }
                    3->{leccionNivelSuma4 = leccionNivel3Suma4 }
                    4->{leccionNivelSuma4 = leccionNivel4Suma4 }
                    5->{leccionNivelSuma4 = leccionNivel5Suma4 }
                }

                when(nresta1){//resta
                    0->{leccionNivelResta1 = leccionNivel0Resta1 }
                    1->{leccionNivelResta1 = leccionNivel1Resta1 }
                    2->{leccionNivelResta1 = leccionNivel2Resta1 }
                    3->{leccionNivelResta1 = leccionNivel3Resta1 }
                    4->{leccionNivelResta1 = leccionNivel4Resta1 }
                    5->{leccionNivelResta1 = leccionNivel5Resta1 }
                }
                when(nresta2){
                    0->{leccionNivelResta2 = leccionNivel0Resta2 }
                    1->{leccionNivelResta2 = leccionNivel1Resta2 }
                    2->{leccionNivelResta2 = leccionNivel2Resta2 }
                    3->{leccionNivelResta2 = leccionNivel3Resta2 }
                    4->{leccionNivelResta2 = leccionNivel4Resta2 }
                    5->{leccionNivelResta2 = leccionNivel5Resta2 }
                }
                when(nresta3){
                    0->{leccionNivelResta3 = leccionNivel0Resta3 }
                    1->{leccionNivelResta3 = leccionNivel1Resta3 }
                    2->{leccionNivelResta3 = leccionNivel2Resta3 }
                    3->{leccionNivelResta3 = leccionNivel3Resta3 }
                    4->{leccionNivelResta3 = leccionNivel4Resta3 }
                    5->{leccionNivelResta3 = leccionNivel5Resta3 }
                }
                when(nresta4){
                    0->{leccionNivelResta4 = leccionNivel0Resta4 }
                    1->{leccionNivelResta4 = leccionNivel1Resta4 }
                    2->{leccionNivelResta4 = leccionNivel2Resta4 }
                    3->{leccionNivelResta4 = leccionNivel3Resta4 }
                    4->{leccionNivelResta4 = leccionNivel4Resta4 }
                    5->{leccionNivelResta4 = leccionNivel5Resta4 }
                }


                when(nmulti1){//Multiplicacion
                    0->{leccionNivelMultiplicacion1 = leccionNivel0Multiplicacion1 }
                    1->{leccionNivelMultiplicacion1 = leccionNivel1Multiplicacion1 }
                    2->{leccionNivelMultiplicacion1 = leccionNivel2Multiplicacion1 }
                    3->{leccionNivelMultiplicacion1 = leccionNivel3Multiplicacion1 }
                    4->{leccionNivelMultiplicacion1 = leccionNivel4Multiplicacion1 }
                    5->{leccionNivelMultiplicacion1 = leccionNivel5Multiplicacion1 }
                }
                when(nmulti2){
                    0->{leccionNivelMultiplicacion2 = leccionNivel0Multiplicacion2 }
                    1->{leccionNivelMultiplicacion2 = leccionNivel1Multiplicacion2 }
                    2->{leccionNivelMultiplicacion2 = leccionNivel2Multiplicacion2 }
                    3->{leccionNivelMultiplicacion2 = leccionNivel3Multiplicacion2 }
                    4->{leccionNivelMultiplicacion2 = leccionNivel4Multiplicacion2 }
                    5->{leccionNivelMultiplicacion2 = leccionNivel5Multiplicacion2 }
                }
                when(nmulti3){
                    0->{leccionNivelMultiplicacion3 = leccionNivel0Multiplicacion3 }
                    1->{leccionNivelMultiplicacion3 = leccionNivel1Multiplicacion3 }
                    2->{leccionNivelMultiplicacion3 = leccionNivel2Multiplicacion3 }
                    3->{leccionNivelMultiplicacion3 = leccionNivel3Multiplicacion3 }
                    4->{leccionNivelMultiplicacion3 = leccionNivel4Multiplicacion3 }
                    5->{leccionNivelMultiplicacion3 = leccionNivel5Multiplicacion3 }
                }
                when(nmulti4){
                    0->{leccionNivelMultiplicacion4 = leccionNivel0Multiplicacion4 }
                    1->{leccionNivelMultiplicacion4 = leccionNivel1Multiplicacion4 }
                    2->{leccionNivelMultiplicacion4 = leccionNivel2Multiplicacion4 }
                    3->{leccionNivelMultiplicacion4 = leccionNivel3Multiplicacion4 }
                    4->{leccionNivelMultiplicacion4 = leccionNivel4Multiplicacion4 }
                    5->{leccionNivelMultiplicacion4 = leccionNivel5Multiplicacion4 }
                }

                when(ndivi1){//Division
                    0->{leccionNivelDivision1 = leccionNivel0Division1 }
                    1->{leccionNivelDivision1 = leccionNivel1Division1 }
                    2->{leccionNivelDivision1 = leccionNivel2Division1 }
                    3->{leccionNivelDivision1 = leccionNivel3Division1 }
                    4->{leccionNivelDivision1 = leccionNivel4Division1 }
                    5->{leccionNivelDivision1 = leccionNivel5Division1 }
                }
                when(ndivi2){
                    0->{leccionNivelDivision2 = leccionNivel0Division2 }
                    1->{leccionNivelDivision2 = leccionNivel1Division2 }
                    2->{leccionNivelDivision2 = leccionNivel2Division2 }
                    3->{leccionNivelDivision2 = leccionNivel3Division2 }
                    4->{leccionNivelDivision2 = leccionNivel4Division2 }
                    5->{leccionNivelDivision2 = leccionNivel5Division2 }
                }
                when(ndivi3){
                    0->{leccionNivelDivision3 = leccionNivel0Division3 }
                    1->{leccionNivelDivision3 = leccionNivel1Division3 }
                    2->{leccionNivelDivision3 = leccionNivel2Division3 }
                    3->{leccionNivelDivision3 = leccionNivel3Division3 }
                    4->{leccionNivelDivision3 = leccionNivel4Division3 }
                    5->{leccionNivelDivision3 = leccionNivel5Division3 }
                }
                when(ndivi4){
                    0->{leccionNivelDivision4 = leccionNivel0Division4 }
                    1->{leccionNivelDivision4 = leccionNivel1Division4 }
                    2->{leccionNivelDivision4 = leccionNivel2Division4 }
                    3->{leccionNivelDivision4 = leccionNivel3Division4 }
                    4->{leccionNivelDivision4 = leccionNivel4Division4 }
                    5->{leccionNivelDivision4 = leccionNivel5Division4 }
                }









                //nivvel de la leccion
                var nivelLeccionSuma = 1
                var nivelLeccionResta = 1
                var nivelLeccionMultiplicacion = 1
                var nivelLeccionDivision = 1




                //Puntos de jugardor
                val coronas= 1
                val premium= 1
                coronaText.setText(" "+coronas+" ")
                premiumText.setText(" "+premium+" ")













                // Ocultar cardsViews, las cuales muestran las opciones para poder acceder al menu de cada leccion(suma, resta, multiplicacion, division)
                apagarCardsView()



                //botones suma
                btnSuma1.setOnClickListener {
                    if (cardViewSuma1.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewSuma1.visibility = View.VISIBLE
                    }
                }
                btnSuma2.setOnClickListener {
                    if (cardViewSuma2.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewSuma2.visibility = View.VISIBLE
                    }
                }
                btnSuma3.setOnClickListener {
                    if (cardViewSuma3.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewSuma3.visibility = View.VISIBLE
                    }
                }
                btnSuma4.setOnClickListener {
                    if (cardViewSuma4.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewSuma4.visibility = View.VISIBLE
                    }
                }

                //resta
                btnResta1.setOnClickListener {
                    if (cardViewResta1.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewResta1.visibility = View.VISIBLE
                    }
                }

                btnResta2.setOnClickListener {
                    if (cardViewResta2.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewResta2.visibility = View.VISIBLE
                    }
                }
                btnResta3.setOnClickListener {
                    if (cardViewResta3.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewResta3.visibility = View.VISIBLE
                    }
                }
                btnResta4.setOnClickListener {
                    if (cardViewResta4.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewResta4.visibility = View.VISIBLE
                    }
                }

                //Multiplicacion
                btnMultiplicacion1.setOnClickListener {
                    if (cardViewMultiplicacion1.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewMultiplicacion1.visibility = View.VISIBLE
                    }
                }
                btnMultiplicacion2.setOnClickListener {
                    if (cardViewMultiplicacion2.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewMultiplicacion2.visibility = View.VISIBLE
                    }
                }
                btnMultiplicacion3.setOnClickListener {
                    if (cardViewMultiplicacion3.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewMultiplicacion3.visibility = View.VISIBLE
                    }
                }
                btnMultiplicacion4.setOnClickListener {
                    if (cardViewMultiplicacion4.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewMultiplicacion4.visibility = View.VISIBLE
                    }
                }

                //division
                btnDivision1.setOnClickListener {
                    if (cardViewDivision1.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewDivision1.visibility = View.VISIBLE
                    }
                }
                btnDivision2.setOnClickListener {
                    if (cardViewDivision2.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewDivision2.visibility = View.VISIBLE
                    }
                }
                btnDivision3.setOnClickListener {
                    if (cardViewDivision3.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewDivision3.visibility = View.VISIBLE
                    }
                }
                btnDivision4.setOnClickListener {
                    if (cardViewDivision4.visibility == View.VISIBLE){
                        apagarCardsView()
                    }else{
                        apagarCardsView()
                        cardViewDivision4.visibility = View.VISIBLE
                    }
                }





                contentmenuprincipal.setOnClickListener {
                    apagarCardsView()
                }


                //activityes ejercicios

                //INICIO INTENT PARA TODOS LOS BOTONES
                var ComenzarEjercicio = Intent(this, EjercicioTerminado::class.java)

                var aciertosEnLeccion = 1
                var errores = 1


                /*
                    ACIONES DE LOS BOTONES DEL MENU
                */
                //BUTTONS SUMA MENU
                btnSuma2Cardview.setOnClickListener {//BUTTON SUMA "1"

                    var nivelejercicio = leccionNivelSuma1
                    var tipo = 1//suma
                    var buttonSelect = 1
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }


                btn1Suma2Cardview.setOnClickListener {//boton suma |2

                    var nivelejercicio = leccionNivelSuma2
                    var buttonSelect=2
                    var tipo = 1//suma
                    var numEjercicio = Random.nextInt(1, 5)
                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()//pasar variables
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio",nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)
                }


                btn1Suma3Cardview.setOnClickListener {//boton suma |3

                    var nivelejercicio = leccionNivelSuma3
                    var tipo = 1//suma
                    var buttonSelect = 3
                    var numEjercicio = Random.nextInt(1, 5)
                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()//pasar variables
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio",nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)
                }

                btn1Suma4Cardview.setOnClickListener {//boton suma |4

                    var nivelejercicio = leccionNivelSuma3
                    var tipo = 1//suma
                    var buttonSelect = 4
                    var numEjercicio = Random.nextInt(1, 5)
                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()//pasar variables
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio",nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)
                }


                //BUTTONS RESTA MENU
                btnResta2Cardview.setOnClickListener {//BUTTON RESTA "1"

                    var nivelejercicio = leccionNivelResta1
                    var tipo = 2//RESTA
                    var buttonSelect = 5
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                btn1Resta2Cardview.setOnClickListener {//BUTTON RESTA "2"

                    var nivelejercicio = leccionNivelResta2
                    var tipo = 2//RESTA
                    var buttonSelect = 6
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                btn1Resta3Cardview.setOnClickListener {//BUTTON RESTA "3"

                    var nivelejercicio = leccionNivelResta3
                    var tipo = 2//RESTA
                    var buttonSelect = 7
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }


                btn1Resta4Cardview.setOnClickListener {//BUTTON RESTA "4"

                    var nivelejercicio = leccionNivelResta4
                    var tipo = 2//RESTA
                    var buttonSelect = 8
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }




                //BOTONES MULTIPLICACION MENU
                btnMultiplicacion2Cardview.setOnClickListener {//BUTTON MULTIPLICACION "1"

                    var nivelejercicio = leccionNivelMultiplicacion1
                    var tipo = 3//MULTIPLICACION
                    var buttonSelect = 9
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                btn1Multiplicacion2Cardview.setOnClickListener {//BUTTON MULTIPLICACION "2"

                    var nivelejercicio = leccionNivelMultiplicacion2
                    var tipo = 3//MULTIPLICACION
                    var buttonSelect = 10
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                btn1Multiplicacion3Cardview.setOnClickListener {//BUTTON MULTIPLICACION "3"

                    var nivelejercicio = leccionNivelMultiplicacion3
                    var tipo = 3//MULTIPLICACION
                    var buttonSelect = 11
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                btn1Multiplicacion4Cardview.setOnClickListener {//BUTTON MULTIPLICACION "4"

                    var nivelejercicio = leccionNivelMultiplicacion4
                    var tipo = 3//MULTIPLICACION
                    var buttonSelect = 12
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                //BUTTONS MULTIPLICACION MENU
                btnDivision2Cardview.setOnClickListener {//BUTTON DIVISION "1"

                    var nivelejercicio = leccionNivelDivision1
                    var tipo = 4//DIVISION
                    var buttonSelect = 13
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                btn1Division2Cardview.setOnClickListener {//BUTTON DIVISION "2"

                    var nivelejercicio = leccionNivelDivision2
                    var tipo = 4//DIVISION
                    var buttonSelect = 14
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                btn1Division3Cardview.setOnClickListener {//BUTTON DIVISION "3"

                    var nivelejercicio = leccionNivelDivision3
                    var tipo = 4//DIVISION
                    var buttonSelect = 15
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }

                btn1Division4Cardview.setOnClickListener {//BUTTON DIVISION "4"

                    var nivelejercicio = leccionNivelDivision4
                    var tipo = 4//DIVISION
                    var buttonSelect = 16
                    var numEjercicio = Random.nextInt(1, 5)

                    when (numEjercicio) {
                        1 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        2 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        3 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        4 -> {ComenzarEjercicio = Intent(this, EjercicioTipo4::class.java)}
                        else -> { // Opción default
                        }
                    }

                    val b :Bundle = Bundle()
                    b.putInt("tipoOperacion",tipo)
                    b.putInt("nivelejercicio", nivelejercicio)
                    b.putInt("aciertosEnLeccion",aciertosEnLeccion)
                    b.putInt("errores",errores)
                    b.putString("email", email)
                    b.putString("provider", provider)
                    b.putInt("buttonSelect",buttonSelect)

                    finish()
                    ComenzarEjercicio.putExtras(b)
                    startActivity(ComenzarEjercicio)

                }














































































                var barra = 50


                //barras circulares
                //suma
                circularProgressBar.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(40, 110, 200)

                }

                circularProgressBar1.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(120, 200, 0)

                }

                circularProgressBar2.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(204, 120, 0)

                }
                circularProgressBar3.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(165, 104, 204)

                }



                //resta
                circularProgressBar4.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(40, 110, 200)

                }

                circularProgressBar5.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(120, 200, 0)

                }
                circularProgressBar6.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(204, 120, 0)

                }
                circularProgressBar7.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(165, 104, 204)

                }
                //multiplicacion
                circularProgressBar8.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(40, 110, 200)

                }

                circularProgressBar9.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(120, 200, 0)

                }
                circularProgressBar10.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(204, 120, 0)

                }
                circularProgressBar11.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(165, 104, 204)

                }

                //division
                circularProgressBar12.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(40, 110, 200)

                }

                circularProgressBar13.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(120, 200, 0)

                }
                circularProgressBar14.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(204, 120, 0)

                }
                circularProgressBar15.apply{
                    progressMax = 100f
                    setProgressWithAnimation(0f,1000)
                    progressBarWidth = 7f
                    backgroundProgressBarWidth = 7f
                    progressBarColor = Color.rgb(165, 104, 204)

                }



                //alterar progreso barras
                //suma
                circularProgressBar.setProgressWithAnimation(70f,1000)
                circularProgressBar1.setProgressWithAnimation(70f,1000)
                circularProgressBar2.setProgressWithAnimation(70f,1000)
                circularProgressBar3.setProgressWithAnimation(70f,1000)
                //resta
                circularProgressBar4.setProgressWithAnimation(70f,1000)
                circularProgressBar5.setProgressWithAnimation(70f,1000)
                circularProgressBar6.setProgressWithAnimation(70f,1000)
                circularProgressBar7.setProgressWithAnimation(70f,1000)
                //multiplicacion
                circularProgressBar8.setProgressWithAnimation(70f,1000)
                circularProgressBar9.setProgressWithAnimation(70f,1000)
                circularProgressBar10.setProgressWithAnimation(70f,1000)
                circularProgressBar11.setProgressWithAnimation(70f,1000)
                //divi
                circularProgressBar12.setProgressWithAnimation(70f,1000)
                circularProgressBar13.setProgressWithAnimation(70f,1000)
                circularProgressBar14.setProgressWithAnimation(70f,1000)
                circularProgressBar15.setProgressWithAnimation(70f,1000)














                //suma
                nivelSuma1.setText(""+nsuma1+"")
                nivelSuma2.setText(""+nsuma2+"")
                nivelSuma3.setText(""+nsuma3+"")
                nivelSuma4.setText(""+nsuma4+"")
                //resta
                nivelResta1.setText(""+nresta1+"")
                nivelResta2.setText(""+nresta2+"")
                nivelResta3.setText(""+nresta3+"")
                nivelResta4.setText(""+nresta4+"")
                //multi
                nivelMultiplicacion1.setText(""+nmulti1+"")
                nivelMultiplicacion2.setText(""+nmulti2+"")
                nivelMultiplicacion3.setText(""+nmulti3+"")
                nivelMultiplicacion4.setText(""+nmulti4+"")
                //divi
                nivelDivision1.setText(""+ndivi1+"")
                nivelDivision2.setText(""+ndivi2+"")
                nivelDivision3.setText(""+ndivi3+"")
                nivelDivision4.setText(""+ndivi4+"")


                //cardviews info
                //suma
                //1
                leccion1SumaText1.setText("Leccion "+leccionNivelSuma1+"/10")
                leccion1SumaText2.setText("Nivel "+nsuma1prueba+"/5")
                //2
                leccion2SumaText1.setText("Leccion "+leccionNivelSuma2+"/10")
                leccion2SumaText2.setText("Nivel "+nsuma2+"/5")
                //3
                leccion3SumaText1.setText("Leccion "+leccionNivelSuma3+"/10")
                leccion3SumaText2.setText("Nivel "+nsuma3+"/5")
                //4
                leccion4SumaText1.setText("Leccion "+leccionNivelSuma4+"/10")
                leccion4SumaText2.setText("Nivel "+nsuma4+"/5")
                //resta
                //1
                leccion1RestaText1.setText("Leccion "+leccionNivelResta1+"/10")
                leccion1RestaText2.setText("Nivel "+nresta1+"/5")
                //2
                leccion2RestaText1.setText("Leccion "+leccionNivelResta2+"/10")
                leccion2RestaText2.setText("Nivel "+nresta2+"/5")
                //3
                leccion3RestaText1.setText("Leccion "+leccionNivelResta3+"/10")
                leccion3RestaText2.setText("Nivel "+nresta3+"/5")
                //4
                leccion4RestaText1.setText("Leccion "+leccionNivelResta4+"/10")
                leccion4RestaText2.setText("Nivel "+nresta4+"/5")
                //Multiplicacion
                //1
                leccion1MultiplicacionText1.setText("Leccion "+leccionNivelMultiplicacion1+"/10")
                leccion1MultiplicacionText2.setText("Nivel "+nmulti1+"/5")
                //2
                leccion2MultiplicacionText1.setText("Leccion "+leccionNivelMultiplicacion2+"/10")
                leccion2MultiplicacionText2.setText("Nivel "+nmulti2+"/5")
                //3
                leccion3MultiplicacionText1.setText("Leccion "+leccionNivelMultiplicacion3+"/10")
                leccion3MultiplicacionText2.setText("Nivel "+nmulti3+"/5")
                //4
                leccion4MultiplicacionText1.setText("Leccion "+leccionNivelMultiplicacion4+"/10")
                leccion4MultiplicacionText2.setText("Nivel "+nmulti4+"/5")
                //Division
                //1
                leccion1DivisionText1.setText("Leccion "+leccionNivelDivision1+"/10")
                leccion1DivisionText2.setText("Nivel "+ndivi1+"/5")
                //2
                leccion2DivisionText1.setText("Leccion "+leccionNivelDivision2+"/10")
                leccion2DivisionText2.setText("Nivel "+ndivi2+"/5")
                //3
                leccion3DivisionText1.setText("Leccion "+leccionNivelDivision3+"/10")
                leccion3DivisionText2.setText("Nivel "+ndivi3+"/5")
                //4
                leccion4DivisionText1.setText("Leccion "+leccionNivelDivision4+"/10")
                leccion4DivisionText2.setText("Nivel "+ndivi4+"/5")








                //suma
                if(leccionNivelSuma1 == 0){//SUMA 1
                    coronaSumaOff1.visibility = View.VISIBLE
                    coronaSuma1.visibility = View.GONE
                    nivelSuma1.visibility = View.GONE
                    circularProgressBar.setProgressWithAnimation(0f,1000)//bar
                    btnSuma1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button

                }else{
                    coronaSuma1.visibility = View.VISIBLE
                    coronaSumaOff1.visibility = View.GONE
                    btnSuma1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles))//boton
                    cardView1Suma1.setBackground(getResources().getDrawable(R.drawable.cardview_style))//cardview
                    //texto
                    leccion1SumaText1.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    leccion1SumaText2.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    btnSuma1Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    btnSuma2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton))

                    btnSuma1Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border))

                    btnSuma2Cardview.setText("Comenzar")//texto en boton

                   if(leccionNivelSuma1 == 1){
                        circularProgressBar.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelSuma1 == 2){
                        circularProgressBar.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelSuma1 == 3){
                        circularProgressBar.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelSuma1 == 4){
                        circularProgressBar.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelSuma1 == 5){
                        circularProgressBar.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelSuma1 == 6){
                        circularProgressBar.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelSuma1 == 7){
                        circularProgressBar.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelSuma1 == 8){
                        circularProgressBar.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelSuma1 == 9){
                        circularProgressBar.setProgressWithAnimation(90f,1000)
                    }else if(leccionNivelSuma1 == 10){
                        circularProgressBar.apply{
                            progressBarColor = Color.rgb(255,207,51)
                        }
                        circularProgressBar.setProgressWithAnimation(100f,1000)//bar completa
                        btnSuma1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Suma1.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion1SumaText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion1SumaText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btnSuma1Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btnSuma2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btnSuma1Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btnSuma2Cardview.setText("Repasar")//texto en boton
                        leccion1SumaText1.setText("Leccion 5/5")

                    }
                }


                if(leccionNivelSuma2 == 0){//suma2
                    coronaSumaOff2.visibility = View.VISIBLE
                    coronaSuma2.visibility = View.GONE
                    nivelSuma2.visibility = View.GONE
                    circularProgressBar1.setProgressWithAnimation(0f,1000)//bar
                    btnSuma2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnSuma2.setEnabled(false)

                }else{
                    coronaSuma2.visibility = View.VISIBLE
                    coronaSumaOff2.visibility = View.GONE

                    btnSuma2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles1))//boton
                    cardView1Suma2.setBackground(getResources().getDrawable(R.drawable.cardview_style1))//cardview
                    //texto
                    leccion2SumaText1.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    leccion2SumaText2.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    btn1Suma2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    btn2Suma2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton1))

                    btn2Suma2Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border1))

                    btn1Suma2Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelSuma2 == 1){
                        circularProgressBar1.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelSuma2 == 2){
                        circularProgressBar1.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelSuma2 == 3){
                        circularProgressBar1.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelSuma2 == 4){
                        circularProgressBar1.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelSuma2 == 5){
                        circularProgressBar1.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelSuma2 == 6){
                        circularProgressBar1.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelSuma2 == 7){
                        circularProgressBar1.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelSuma2 == 8){
                        circularProgressBar1.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelSuma2 == 9){
                        circularProgressBar1.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelSuma2 == 10) {
                        circularProgressBar1.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar1.setProgressWithAnimation(100f, 1000)//bar completa
                        btnSuma2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Suma2.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion2SumaText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion2SumaText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Suma2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Suma2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Suma2Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Suma2Cardview.setText("Repasar")//texto en boton
                        leccion2SumaText1.setText("Leccion 5/5")
                    }

                }




                if(leccionNivelSuma3 == 0){//suma 3
                    coronaSumaOff3.visibility = View.VISIBLE
                    coronaSuma3.visibility = View.GONE
                    nivelSuma3.visibility = View.GONE

                    circularProgressBar2.setProgressWithAnimation(0f,1000)//bar
                    btnSuma3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnSuma3.setEnabled(false)

                }else{
                    coronaSuma3.visibility = View.VISIBLE
                    coronaSumaOff3.visibility = View.GONE

                    btnSuma3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles2))//boton
                    cardView1Suma3.setBackground(getResources().getDrawable(R.drawable.cardview_style2))//cardview
                    //texto
                    leccion3SumaText1.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    leccion3SumaText2.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    btn1Suma3Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    btn2Suma3Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton2))

                    btn2Suma3Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border2))

                    btn1Suma3Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelSuma3 == 1){
                        circularProgressBar2.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelSuma3 == 2){
                        circularProgressBar2.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelSuma3 == 3){
                        circularProgressBar2.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelSuma3 == 4){
                        circularProgressBar2.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelSuma3 == 5){
                        circularProgressBar2.setProgressWithAnimation(50f,1000)
                    } else if(leccionNivelSuma3 == 6){
                        circularProgressBar2.setProgressWithAnimation(60f,1000)
                    } else if(leccionNivelSuma3 == 7){
                        circularProgressBar2.setProgressWithAnimation(70f,1000)
                    } else if(leccionNivelSuma3 == 8){
                        circularProgressBar2.setProgressWithAnimation(80f,1000)
                    } else if(leccionNivelSuma3 == 9){
                        circularProgressBar2.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelSuma3 == 10) {
                        circularProgressBar2.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar2.setProgressWithAnimation(100f, 1000)//bar completa
                        btnSuma3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Suma3.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion3SumaText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion3SumaText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Suma3Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Suma3Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Suma3Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Suma3Cardview.setText("Repasar")//texto en boton
                        leccion3SumaText1.setText("Leccion 5/5")
                    }

                }


                if(leccionNivelSuma4 == 0){
                    coronaSumaOff4.visibility = View.VISIBLE
                    coronaSuma4.visibility = View.GONE
                    nivelSuma4.visibility = View.GONE

                    circularProgressBar3.setProgressWithAnimation(0f,1000)//bar
                    btnSuma4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnSuma4.setEnabled(false)

                }else{
                    coronaSuma4.visibility = View.VISIBLE
                    coronaSumaOff4.visibility = View.GONE

                    btnSuma4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles3))//boton
                    cardView1Suma4.setBackground(getResources().getDrawable(R.drawable.cardview_style3))//cardview
                    //texto
                    leccion4SumaText1.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    leccion4SumaText2.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    btn1Suma4Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    btn2Suma4Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton3))

                    btn2Suma4Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border3))

                    btn1Suma4Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelSuma4 == 1){
                        circularProgressBar3.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelSuma4 == 2){
                        circularProgressBar3.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelSuma4 == 3){
                        circularProgressBar3.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelSuma4 == 4){
                        circularProgressBar3.setProgressWithAnimation(40f,1000)
                    } else if(leccionNivelSuma4 == 5){
                        circularProgressBar3.setProgressWithAnimation(50f,1000)
                    } else if(leccionNivelSuma4 == 6){
                        circularProgressBar3.setProgressWithAnimation(60f,1000)
                    } else if(leccionNivelSuma4 == 7){
                        circularProgressBar3.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelSuma4 == 8){
                        circularProgressBar3.setProgressWithAnimation(80f,1000)
                    } else if(leccionNivelSuma4 == 9){
                        circularProgressBar3.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelSuma4 == 10) {
                        circularProgressBar3.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar3.setProgressWithAnimation(100f, 1000)//bar completa
                        btnSuma4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Suma4.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion4SumaText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion4SumaText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Suma4Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Suma4Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Suma4Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Suma4Cardview.setText("Repasar")//texto en boton
                        leccion4SumaText1.setText("Leccion 5/5")

                    }
                }








                //RESTA
                if(leccionNivelResta1 == 0){//RESTA 1
                    coronaRestaOff1.visibility = View.VISIBLE
                    coronaResta1.visibility = View.GONE
                    nivelResta1.visibility = View.GONE
                    circularProgressBar4.setProgressWithAnimation(0f,1000)//bar
                    btnResta1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnResta1.setEnabled(false)

                }else{
                    coronaResta1.visibility = View.VISIBLE
                    coronaRestaOff1.visibility = View.GONE

                    btnResta1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles))//boton
                    cardView1Resta1.setBackground(getResources().getDrawable(R.drawable.cardview_style))//cardview
                    //texto
                    leccion1RestaText1.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    leccion1RestaText2.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    btnResta1Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    btnResta2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton))

                    btnResta1Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border))

                    btnResta2Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelResta1 == 1){
                        circularProgressBar4.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelResta1 == 2){
                        circularProgressBar4.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelResta1 == 3){
                        circularProgressBar4.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelResta1 == 4){
                        circularProgressBar4.setProgressWithAnimation(40f,1000)
                    } else if(leccionNivelResta1 == 5){
                        circularProgressBar4.setProgressWithAnimation(50f,1000)
                    } else if(leccionNivelResta1 == 6){
                        circularProgressBar4.setProgressWithAnimation(60f,1000)
                    } else if(leccionNivelResta1 == 7){
                        circularProgressBar4.setProgressWithAnimation(70f,1000)
                    } else if(leccionNivelResta1 == 8){
                        circularProgressBar4.setProgressWithAnimation(80f,1000)
                    } else if(leccionNivelResta1 == 9){
                        circularProgressBar4.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelResta1 == 10) {
                        circularProgressBar4.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar4.setProgressWithAnimation(100f, 1000)//bar completa
                        btnResta1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Resta1.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion1RestaText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion1RestaText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btnResta1Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btnResta2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btnResta1Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btnResta2Cardview.setText("Repasar")//texto en boton
                        leccion1RestaText1.setText("Leccion 5/5")

                    }

                }




                if(leccionNivelResta2 == 0){//resta2
                    coronaRestaOff2.visibility = View.VISIBLE
                    coronaResta2.visibility = View.GONE
                    nivelResta2.visibility = View.GONE
                    circularProgressBar5.setProgressWithAnimation(0f,1000)//bar
                    btnResta2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnResta2.setEnabled(false)
                }else{
                    coronaResta2.visibility = View.VISIBLE
                    coronaRestaOff2.visibility = View.GONE



                    btnResta2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles1))//boton
                    cardView1Resta2.setBackground(getResources().getDrawable(R.drawable.cardview_style1))//cardview
                    //texto
                    leccion2RestaText1.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    leccion2RestaText2.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    btn1Resta2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    btn2Resta2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton1))

                    btn2Resta2Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border1))

                    btn1Resta2Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelResta2 == 1){
                        circularProgressBar5.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelResta2 == 2){
                        circularProgressBar5.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelResta2 == 3){
                        circularProgressBar5.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelResta2 == 4){
                        circularProgressBar5.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelResta2 == 5){
                        circularProgressBar5.setProgressWithAnimation(50f,1000)
                    } else if(leccionNivelResta2 == 6){
                        circularProgressBar5.setProgressWithAnimation(60f,1000)
                    } else if(leccionNivelResta2 == 7){
                        circularProgressBar5.setProgressWithAnimation(70f,1000)
                    } else if(leccionNivelResta2 == 8){
                        circularProgressBar5.setProgressWithAnimation(80f,1000)
                    } else if(leccionNivelResta2 == 9){
                        circularProgressBar5.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelResta2 == 10) {
                        circularProgressBar5.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar5.setProgressWithAnimation(100f, 1000)//bar completa
                        btnResta2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Resta2.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion2RestaText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion2RestaText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Resta2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Resta2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Resta2Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Resta2Cardview.setText("Repasar")//texto en boton
                        leccion2RestaText1.setText("Leccion 5/5")
                    }


                }





                if(leccionNivelResta3 == 0){
                    coronaRestaOff3.visibility = View.VISIBLE
                    coronaResta3.visibility = View.GONE
                    nivelResta3.visibility = View.GONE

                    circularProgressBar6.setProgressWithAnimation(0f,1000)//bar
                    btnResta3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnResta3.setEnabled(false)

                }else{
                    coronaResta3.visibility = View.VISIBLE
                    coronaRestaOff3.visibility = View.GONE






                    btnResta3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles2))//boton
                    cardView1Resta3.setBackground(getResources().getDrawable(R.drawable.cardview_style2))//cardview
                    //texto
                    leccion3RestaText1.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    leccion3RestaText2.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    btn1Resta3Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    btn2Resta3Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton2))

                    btn2Resta3Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border2))

                    btn1Resta3Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelResta3 == 1){
                        circularProgressBar6.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelResta3 == 2){
                        circularProgressBar6.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelResta3 == 3){
                        circularProgressBar6.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelResta3 == 4){
                        circularProgressBar6.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelResta3 == 5){
                        circularProgressBar6.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelResta3 == 6){
                        circularProgressBar6.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelResta3 == 7){
                        circularProgressBar6.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelResta3 == 8){
                        circularProgressBar6.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelResta3 == 9){
                        circularProgressBar6.setProgressWithAnimation(90f,1000)
                    }
                    else if(leccionNivelResta3 == 10) {
                        circularProgressBar6.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar6.setProgressWithAnimation(100f, 1000)//bar completa
                        btnResta3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Resta3.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion3RestaText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion3RestaText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Resta3Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Resta3Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Resta3Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Resta3Cardview.setText("Repasar")//texto en boton
                        leccion3RestaText1.setText("Leccion 5/5")
                    }






                }








                if(leccionNivelResta4 == 0){
                    coronaRestaOff4.visibility = View.VISIBLE
                    coronaResta4.visibility = View.GONE
                    nivelResta4.visibility = View.GONE

                    circularProgressBar7.setProgressWithAnimation(0f,1000)//bar
                    btnResta4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnResta4.setEnabled(false)

                }else{
                    coronaResta4.visibility = View.VISIBLE
                    coronaRestaOff4.visibility = View.GONE




                    btnResta4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles3))//boton
                    cardView1Resta4.setBackground(getResources().getDrawable(R.drawable.cardview_style3))//cardview
                    //texto
                    leccion4RestaText1.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    leccion4RestaText2.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    btn1Resta4Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    btn2Resta4Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton3))

                    btn2Resta4Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border3))

                    btn1Resta4Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelResta4 == 1){
                        circularProgressBar7.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelResta4 == 2){
                        circularProgressBar7.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelResta4 == 3){
                        circularProgressBar7.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelResta4 == 4){
                        circularProgressBar7.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelResta4 == 5){
                        circularProgressBar7.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelResta4 == 6){
                        circularProgressBar7.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelResta4 == 7){
                        circularProgressBar7.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelResta4 == 8){
                        circularProgressBar7.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelResta4 == 9){
                        circularProgressBar7.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelResta4 == 10) {
                        circularProgressBar7.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar7.setProgressWithAnimation(100f, 1000)//bar completa
                        btnResta4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Resta4.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion4RestaText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion4RestaText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Resta4Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Resta4Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Resta4Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Resta4Cardview.setText("Repasar")//texto en boton
                        leccion4RestaText1.setText("Leccion 5/5")

                    }




                }
























                //Multiplicacion
                if(leccionNivelMultiplicacion1 == 0){//MULTI 1
                    coronaMultiplicacionOff1.visibility = View.VISIBLE
                    coronaMultiplicacion1.visibility = View.GONE
                    nivelMultiplicacion1.visibility = View.GONE

                    circularProgressBar8.setProgressWithAnimation(0f,1000)//bar
                    btnMultiplicacion1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnMultiplicacion1.setEnabled(false)

                }else{
                    coronaMultiplicacion1.visibility = View.VISIBLE
                    coronaMultiplicacionOff1.visibility = View.GONE

                    btnMultiplicacion1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles))//boton
                    cardView1Multiplicacion1.setBackground(getResources().getDrawable(R.drawable.cardview_style))//cardview
                    //texto
                    leccion1MultiplicacionText1.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    leccion1MultiplicacionText2.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    btnMultiplicacion1Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    btnMultiplicacion2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton))

                    btnMultiplicacion1Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border))

                    btnMultiplicacion2Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelMultiplicacion1 == 1){
                        circularProgressBar8.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelMultiplicacion1 == 2){
                        circularProgressBar8.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelMultiplicacion1 == 3){
                        circularProgressBar8.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelMultiplicacion1 == 4){
                        circularProgressBar8.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelMultiplicacion1 == 5){
                        circularProgressBar8.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelMultiplicacion1 == 6){
                        circularProgressBar8.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelMultiplicacion1 == 7){
                        circularProgressBar8.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelMultiplicacion1 == 8){
                        circularProgressBar8.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelMultiplicacion1 == 9){
                        circularProgressBar8.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelMultiplicacion1 == 10) {
                        circularProgressBar8.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar8.setProgressWithAnimation(100f, 1000)//bar completa
                        btnMultiplicacion1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Multiplicacion1.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion1MultiplicacionText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion1MultiplicacionText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btnMultiplicacion1Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btnMultiplicacion2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btnMultiplicacion1Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btnMultiplicacion2Cardview.setText("Repasar")//texto en boton
                        leccion1MultiplicacionText1.setText("Leccion 5/5")
                    }
                }







                if(leccionNivelMultiplicacion2 == 0){//multi2
                    coronaMultiplicacionOff2.visibility = View.VISIBLE
                    coronaMultiplicacion2.visibility = View.GONE
                    nivelMultiplicacion2.visibility = View.GONE

                    circularProgressBar9.setProgressWithAnimation(0f,1000)//bar
                    btnMultiplicacion2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnMultiplicacion2.setEnabled(false)

                }else{
                    coronaMultiplicacion2.visibility = View.VISIBLE
                    coronaMultiplicacionOff2.visibility = View.GONE

                    btnMultiplicacion2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles1))//boton
                    cardView1Multiplicacion2.setBackground(getResources().getDrawable(R.drawable.cardview_style1))//cardview
                    //texto
                    leccion2MultiplicacionText1.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    leccion2MultiplicacionText2.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    btn1Multiplicacion2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    btn2Multiplicacion2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton1))

                    btn2Multiplicacion2Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border1))

                    btn1Multiplicacion2Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelMultiplicacion2 == 1){
                        circularProgressBar9.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelMultiplicacion2 == 2){
                        circularProgressBar9.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelMultiplicacion2 == 3){
                        circularProgressBar9.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelMultiplicacion2 == 4){
                        circularProgressBar9.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelMultiplicacion2 == 5){
                        circularProgressBar9.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelMultiplicacion2 == 6){
                        circularProgressBar9.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelMultiplicacion2 == 7){
                        circularProgressBar9.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelMultiplicacion2 == 8){
                        circularProgressBar9.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelMultiplicacion2 == 9){
                        circularProgressBar9.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelMultiplicacion2 == 10) {
                        circularProgressBar9.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar9.setProgressWithAnimation(100f, 1000)//bar completa
                        btnMultiplicacion2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Multiplicacion2.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion2MultiplicacionText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion2MultiplicacionText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Multiplicacion2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Multiplicacion2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Multiplicacion2Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Multiplicacion2Cardview.setText("Repasar")//texto en boton
                        leccion2MultiplicacionText1.setText("Leccion 5/5")
                    }


                }





                if(leccionNivelMultiplicacion3 == 0){
                    coronaMultiplicacionOff3.visibility = View.VISIBLE
                    coronaMultiplicacion3.visibility = View.GONE
                    nivelMultiplicacion3.visibility = View.GONE

                    circularProgressBar10.setProgressWithAnimation(0f,1000)//bar
                    btnMultiplicacion3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnMultiplicacion3.setEnabled(false)


                }else{
                    coronaMultiplicacion3.visibility = View.VISIBLE
                    coronaMultiplicacionOff3.visibility = View.GONE



                    btnMultiplicacion3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles2))//boton
                    cardView1Multiplicacion3.setBackground(getResources().getDrawable(R.drawable.cardview_style2))//cardview
                    //texto
                    leccion3MultiplicacionText1.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    leccion3MultiplicacionText2.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    btn1Multiplicacion3Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    btn2Multiplicacion3Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton2))

                    btn2Multiplicacion3Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border2))

                    btn1Multiplicacion3Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelMultiplicacion3 == 1){
                        circularProgressBar10.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelMultiplicacion3 == 2){
                        circularProgressBar10.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelMultiplicacion3 == 3){
                        circularProgressBar10.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelMultiplicacion3 == 4){
                        circularProgressBar10.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelMultiplicacion3 == 5){
                        circularProgressBar10.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelMultiplicacion3 == 6){
                        circularProgressBar10.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelMultiplicacion3 == 7){
                        circularProgressBar10.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelMultiplicacion3 == 8){
                        circularProgressBar10.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelMultiplicacion3 == 9){
                        circularProgressBar10.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelMultiplicacion3 == 10) {
                        circularProgressBar10.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar10.setProgressWithAnimation(100f, 1000)//bar completa
                        btnMultiplicacion3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Multiplicacion3.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion3MultiplicacionText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion3MultiplicacionText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Multiplicacion3Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Multiplicacion3Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Multiplicacion3Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Multiplicacion3Cardview.setText("Repasar")//texto en boton
                        leccion3MultiplicacionText1.setText("Leccion 5/5")
                    }

                }


                if(leccionNivelMultiplicacion4 == 0){//multi 4
                    coronaMultiplicacionOff4.visibility = View.VISIBLE
                    coronaMultiplicacion4.visibility = View.GONE
                    nivelMultiplicacion4.visibility = View.GONE

                    circularProgressBar11.setProgressWithAnimation(0f,1000)//bar
                    btnMultiplicacion4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnMultiplicacion4.setEnabled(false)

                }else{
                    coronaMultiplicacion4.visibility = View.VISIBLE
                    coronaMultiplicacionOff4.visibility = View.GONE


                    btnMultiplicacion4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles3))//boton
                    cardView1Multiplicacion4.setBackground(getResources().getDrawable(R.drawable.cardview_style3))//cardview
                    //texto
                    leccion4MultiplicacionText1.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    leccion4MultiplicacionText2.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    btn1Multiplicacion4Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    btn2Multiplicacion4Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton3))

                    btn2Multiplicacion4Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border3))

                    btn1Multiplicacion4Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelMultiplicacion4 == 1){
                        circularProgressBar11.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelMultiplicacion4 == 2){
                        circularProgressBar11.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelMultiplicacion4 == 3){
                        circularProgressBar11.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelMultiplicacion4 == 4){
                        circularProgressBar11.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelMultiplicacion4 == 5){
                        circularProgressBar11.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelMultiplicacion4 == 6){
                        circularProgressBar11.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelMultiplicacion4 == 7){
                        circularProgressBar11.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelMultiplicacion4 == 8){
                        circularProgressBar11.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelMultiplicacion4 == 9){
                        circularProgressBar11.setProgressWithAnimation(90f,1000)
                    }
                    else if(leccionNivelMultiplicacion4 == 10) {
                        circularProgressBar11.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar11.setProgressWithAnimation(100f, 1000)//bar completa
                        btnMultiplicacion4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Multiplicacion4.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion4MultiplicacionText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion4MultiplicacionText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Multiplicacion4Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Multiplicacion4Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Multiplicacion4Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Multiplicacion4Cardview.setText("Repasar")//texto en boton
                        leccion4MultiplicacionText1.setText("Leccion 5/5")

                    }



                }





                //division
                if(leccionNivelDivision1 == 0){//DIVI
                    coronaDivisonOff1.visibility = View.VISIBLE
                    coronaDivison1.visibility = View.GONE
                    nivelDivision1.visibility = View.GONE

                    circularProgressBar12.setProgressWithAnimation(0f,1000)//bar
                    btnDivision1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnDivision1.setEnabled(false)

                }else{
                    coronaDivison1.visibility = View.VISIBLE
                    coronaDivisonOff1.visibility = View.GONE




                    btnDivision1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles))//boton
                    cardView1Division1.setBackground(getResources().getDrawable(R.drawable.cardview_style))//cardview
                    //texto
                    leccion1DivisionText1.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    leccion1DivisionText2.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    btnDivision1Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton))
                    btnDivision2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton))

                    btnDivision1Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border))

                    btnDivision2Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelDivision1 == 1){
                        circularProgressBar12.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelDivision1 == 2){
                        circularProgressBar12.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelDivision1 == 3){
                        circularProgressBar12.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelDivision1 == 4){
                        circularProgressBar12.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelDivision1 == 5){
                        circularProgressBar12.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelDivision1 == 6){
                        circularProgressBar12.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelDivision1 == 7){
                        circularProgressBar12.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelDivision1 == 8){
                        circularProgressBar12.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelDivision1 == 9){
                        circularProgressBar12.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelDivision1 == 10) {
                        circularProgressBar12.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar12.setProgressWithAnimation(100f, 1000)//bar completa
                        btnDivision1.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Division1.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion1DivisionText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion1DivisionText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btnDivision1Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btnDivision2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btnDivision1Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btnDivision2Cardview.setText("Repasar")//texto en boton
                        leccion1DivisionText1.setText("Leccion 5/5")

                    }

                }





                if(leccionNivelDivision2 == 0){//divi 2
                    coronaDivisonOff2.visibility = View.VISIBLE
                    coronaDivison2.visibility = View.GONE
                    nivelDivision2.visibility = View.GONE

                    circularProgressBar13.setProgressWithAnimation(0f,1000)//bar
                    btnDivision2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnDivision2.setEnabled(false)

                }else{
                    coronaDivison2.visibility = View.VISIBLE
                    coronaDivisonOff2.visibility = View.GONE

                    btnDivision2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles1))//boton
                    cardView1Division2.setBackground(getResources().getDrawable(R.drawable.cardview_style1))//cardview
                    //texto
                    leccion2DivisionText1.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    leccion2DivisionText2.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    btn1Division2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton1))
                    btn2Division2Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton1))

                    btn2Division2Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border1))

                    btn1Division2Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelDivision2 == 1){
                        circularProgressBar13.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelDivision2 == 2){
                        circularProgressBar13.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelDivision2 == 3){
                        circularProgressBar13.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelDivision2 == 4){
                        circularProgressBar13.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelDivision2 == 5){
                        circularProgressBar13.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelDivision2 == 6){
                        circularProgressBar13.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelDivision2 == 7){
                        circularProgressBar13.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelDivision2 == 8){
                        circularProgressBar13.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelDivision2 == 9){
                        circularProgressBar13.setProgressWithAnimation(90f,1000)
                    } else if(leccionNivelDivision2 == 10) {
                        circularProgressBar13.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar13.setProgressWithAnimation(100f, 1000)//bar completa
                        btnDivision2.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Division2.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion2DivisionText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion2DivisionText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Division2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Division2Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Division2Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Division2Cardview.setText("Repasar")//texto en boton
                        leccion2DivisionText1.setText("Leccion 5/5")
                    }

                }






                if(leccionNivelDivision3 == 0){
                    coronaDivisonOff3.visibility = View.VISIBLE
                    coronaDivison3.visibility = View.GONE
                    nivelDivision3.visibility = View.GONE

                    circularProgressBar14.setProgressWithAnimation(0f,1000)//bar
                    btnDivision3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnDivision3.setEnabled(false)

                }else{
                    coronaDivison3.visibility = View.VISIBLE
                    coronaDivisonOff3.visibility = View.GONE

                    btnDivision3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles2))//boton
                    cardView1Division3.setBackground(getResources().getDrawable(R.drawable.cardview_style2))//cardview
                    //texto
                    leccion3DivisionText1.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    leccion3DivisionText2.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    btn1Division3Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton2))
                    btn2Division3Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton2))

                    btn2Division3Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border2))

                    btn1Division3Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelDivision3 == 1){
                        circularProgressBar14.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelDivision3 == 2){
                        circularProgressBar14.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelDivision3 == 3){
                        circularProgressBar14.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelDivision3 == 4){
                        circularProgressBar14.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelDivision3 == 5){
                        circularProgressBar14.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelDivision3 == 6){
                        circularProgressBar14.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelDivision3 == 7){
                        circularProgressBar14.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelDivision3 == 8){
                        circularProgressBar14.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelDivision3 == 9){
                        circularProgressBar14.setProgressWithAnimation(90f,1000)
                    }else if(leccionNivelDivision3 == 10) {
                        circularProgressBar14.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar14.setProgressWithAnimation(100f, 1000)//bar completa
                        btnDivision3.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Division3.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion3DivisionText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion3DivisionText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Division3Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Division3Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Division3Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Division3Cardview.setText("Repasar")//texto en boton
                        leccion3DivisionText1.setText("Leccion 5/5")
                    }

                }




                if(leccionNivelDivision4 == 0){//divi 4
                    coronaDivisonOff4.visibility = View.VISIBLE
                    coronaDivison4.visibility = View.GONE
                    nivelDivision4.visibility = View.GONE

                    circularProgressBar15.setProgressWithAnimation(0f,1000)//bar
                    btnDivision4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles4))//img button
                    btnDivision4.setEnabled(false)

                }else{
                    coronaDivison4.visibility = View.VISIBLE
                    coronaDivisonOff4.visibility = View.GONE


                    btnDivision4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles3))//boton
                    cardView1Division4.setBackground(getResources().getDrawable(R.drawable.cardview_style3))//cardview
                    //texto
                    leccion4DivisionText1.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    leccion4DivisionText2.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    btn1Division4Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton3))
                    btn2Division4Cardview.setTextColor(getResources().getColor(R.color.colorCardBoton3))

                    btn2Division4Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border3))

                    btn1Division4Cardview.setText("Comenzar")//texto en boton

                    if(leccionNivelDivision4 == 1){
                        circularProgressBar15.setProgressWithAnimation(10f,1000)
                    }else if(leccionNivelDivision4 == 2){
                        circularProgressBar15.setProgressWithAnimation(20f,1000)
                    }else if(leccionNivelDivision4 == 3){
                        circularProgressBar15.setProgressWithAnimation(30f,1000)
                    }else if(leccionNivelDivision4 == 4){
                        circularProgressBar15.setProgressWithAnimation(40f,1000)
                    }else if(leccionNivelDivision4 == 5){
                        circularProgressBar15.setProgressWithAnimation(50f,1000)
                    }else if(leccionNivelDivision4 == 6){
                        circularProgressBar15.setProgressWithAnimation(60f,1000)
                    }else if(leccionNivelDivision4 == 7){
                        circularProgressBar15.setProgressWithAnimation(70f,1000)
                    }else if(leccionNivelDivision4 == 8){
                        circularProgressBar15.setProgressWithAnimation(80f,1000)
                    }else if(leccionNivelDivision4 == 9){
                        circularProgressBar15.setProgressWithAnimation(90f,1000)
                    }else if(leccionNivelDivision4 == 10) {
                        circularProgressBar15.apply {
                            progressBarColor = Color.rgb(255, 207, 51)
                        }
                        circularProgressBar15.setProgressWithAnimation(100f, 1000)//bar completa
                        btnDivision4.setBackground(getResources().getDrawable(R.drawable.buttons_menu_niveles5))//boton de la operacion
                        cardView1Division4.setBackground(getResources().getDrawable(R.drawable.cardview_style4))//fondo de cardview
                        //texto
                        leccion4DivisionText1.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        leccion4DivisionText2.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn1Division4Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        btn2Division4Cardview.setTextColor(getResources().getColor(R.color.completadoMenuFuerte))
                        //borde de boton
                        btn2Division4Cardview.setBackground(getResources().getDrawable(R.drawable.button_cardview_border_completado))
                        btn1Division4Cardview.setText("Repasar")//texto en boton
                        leccion4DivisionText1.setText("Leccion 5/5")

                    }


                }






















                dashboard.setOnClickListener {
                    val LoginIntent = Intent(this, dashboardUno::class.java)

                    startActivity(LoginIntent)

                }












































            }




















































        }
        }



























    fun apagarCardsView() {
        //suma
        cardViewSuma1.visibility = View.GONE
        cardViewSuma2.visibility = View.GONE
        cardViewSuma3.visibility = View.GONE
        cardViewSuma4.visibility = View.GONE
        //resta
        cardViewResta1.visibility = View.GONE
        cardViewResta2.visibility = View.GONE
        cardViewResta3.visibility = View.GONE
        cardViewResta4.visibility = View.GONE
        //Multiplicacion
        cardViewMultiplicacion1.visibility = View.GONE
        cardViewMultiplicacion2.visibility = View.GONE
        cardViewMultiplicacion3.visibility = View.GONE
        cardViewMultiplicacion4.visibility = View.GONE
        //division
        cardViewDivision1.visibility = View.GONE
        cardViewDivision2.visibility = View.GONE
        cardViewDivision3.visibility = View.GONE
        cardViewDivision4.visibility = View.GONE
    }




    //Validar el botton Atras de dispositivos andriod
    override fun onBackPressed() {


    }



    private fun setup(email: String, provider: String){

        cerrarSesion.setOnClickListener{

            val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
            prefs.clear()
            prefs.apply()


            if(provider == ProviderType.FACEBOOK.name){//en caso de que se cierre sesion con facebook
                LoginManager.getInstance().logOut()
            }



            FirebaseAuth.getInstance().signOut()
            onBackPressed()

            val loginIntent:Intent = Intent (this,MainActivity::class.java).apply {
            }
            startActivity(loginIntent)

        }











    }



















}




