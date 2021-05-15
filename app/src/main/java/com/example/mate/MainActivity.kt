package com.example.mate

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_ejercicio_tipo2.*
import kotlinx.android.synthetic.main.activity_ejercicio_tipo4.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu_app_principal.*



class MainActivity : AppCompatActivity() {

    val numero = 0
    private val db = FirebaseFirestore.getInstance()


    //CONSTANTE PARA PASAR LA RESPUESTA DE LA AUTENTIFICACION DE GOOGLE
    private val GOOGLE_SIGN_IN = 100 //google
    private val callbackManager = CallbackManager.Factory.create()//facebook ()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
        session()

    }





    private fun session(){
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)
        val email:String? = prefs.getString("email", null)
        val provider:String? = prefs.getString("provider",null)
        if(email !=null && provider !=null){
            showHome(email, ProviderType.valueOf(provider))
        }
    }









    //CREAR USUARIO
    private  fun setup(){

        //registro normal
        registroButton.setOnClickListener{
            if(emailText.text.isNotEmpty() && contraseñaText.text.isNotEmpty()){
                FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(emailText.text.toString(),
                        contraseñaText.text.toString()).addOnCompleteListener{
                    if(it.isSuccessful){
                        showHome1(it.result?.user?.email ?: "", ProviderType.BASIC)

                    }else{
                        showAlert()
                    }
                }
            }
        }


        btnLogin.setOnClickListener{
            if(emailText.text.isNotEmpty() && contraseñaText.text.isNotEmpty()){
                FirebaseAuth.getInstance()
                    .signInWithEmailAndPassword(emailText.text.toString(),
                        contraseñaText.text.toString()).addOnCompleteListener{
                    if(it.isSuccessful){
                        showHome(it.result?.user?.email ?: "", ProviderType.BASIC)
                    }else{
                        showAlert()
                    }
                }
            }
        }

        googleButton.setOnClickListener{
            //configuracion
            val googleConf =
                GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build()

            val googleClient = GoogleSignIn.getClient(this, googleConf)
            googleClient.signOut()
           startActivityForResult(googleClient.signInIntent, GOOGLE_SIGN_IN)

        }



        facebookButton.setOnClickListener{

            LoginManager.getInstance().logInWithReadPermissions(this, listOf("email"))

            LoginManager.getInstance().registerCallback(callbackManager, object : FacebookCallback<LoginResult>{

                override fun onSuccess(result: LoginResult?) {   // si el login fue correcto

                    result?.let {
                        val token = it.accessToken

                        val credential = FacebookAuthProvider.getCredential(token.token)

                        FirebaseAuth.getInstance().signInWithCredential(credential).addOnCompleteListener{
                            if(it.isSuccessful){
                                registro(it.result?.user?.email ?: "", ProviderType.FACEBOOK)
                                showHome(it.result?.user?.email ?: "", ProviderType.FACEBOOK)

                            }else{
                                showAlert()
                            }

                        }





                    }
                }

                override fun onCancel() {

                }

                override fun onError(error: FacebookException?) {
                    showAlert()
                }
            })





        }




    }







    //cofniguracion de alerta al encontrar error al autentificar
    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error al autenticar")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showHome(email: String, provider: ProviderType){




        val homeIntent:Intent = Intent (this,MenuAppPrincipal::class.java).apply {
            putExtra("email", email)
            putExtra("provider", provider.name)
        }
        startActivity(homeIntent)
    }


    private fun showHome1(email: String, provider: ProviderType){

        db.collection("user").document(email).set(
        hashMapOf("email" to email,
            "nsuma1" to 1,
            "nsuma2" to 0,
            "nsuma3" to 0,
            "nsuma4" to 0,
            "nresta1" to 0,
            "nresta2" to 0,
            "nresta3" to 0,
            "nresta4" to 0,
            "nmulti1" to 0,
            "nmulti2" to 0,
            "nmulti3" to 0,
            "nmulti4" to 0,
            "ndivi1" to 0,
            "ndivi2" to 0,
            "ndivi3" to 0,
            "ndivi4" to 0,

            //suma
            "leccionNivel0Suma1" to 0,
            "leccionNivel1Suma1" to 1,
            "leccionNivel2Suma1" to 0,
            "leccionNivel3Suma1" to 0,
            "leccionNivel4Suma1" to 0,
            "leccionNivel5Suma1" to 0,

            "leccionNivel0Suma2" to 0,
            "leccionNivel1Suma2" to 0,
            "leccionNivel2Suma2" to 0,
            "leccionNivel3Suma2" to 0,
            "leccionNivel4Suma2" to 0,
            "leccionNivel5Suma2" to 0,

            "leccionNivel0Suma3" to 0,
            "leccionNivel1Suma3" to 0,
            "leccionNivel2Suma3" to 0,
            "leccionNivel3Suma3" to 0,
            "leccionNivel4Suma3" to 0,
            "leccionNivel5Suma3" to 0,

            "leccionNivel0Suma4" to 0,
            "leccionNivel1Suma4" to 0,
            "leccionNivel2Suma4" to 0,
            "leccionNivel3Suma4" to 0,
            "leccionNivel4Suma4" to 0,
            "leccionNivel5Suma4" to 0,


            //Resta
            "leccionNivel0Resta1" to 0,
            "leccionNivel1Resta1" to 0,
            "leccionNivel2Resta1" to 0,
            "leccionNivel3Resta1" to 0,
            "leccionNivel4Resta1" to 0,
            "leccionNivel5Resta1" to 0,

            "leccionNivel0Resta2" to 0,
            "leccionNivel1Resta2" to 0,
            "leccionNivel2Resta2" to 0,
            "leccionNivel3Resta2" to 0,
            "leccionNivel4Resta2" to 0,
            "leccionNivel5Resta2" to 0,

            "leccionNivel0Resta3" to 0,
            "leccionNivel1Resta3" to 0,
            "leccionNivel2Resta3" to 0,
            "leccionNivel3Resta3" to 0,
            "leccionNivel4Resta3" to 0,
            "leccionNivel5Resta3" to 0,

            "leccionNivel0Resta4" to 0,
            "leccionNivel1Resta4" to 0,
            "leccionNivel2Resta4" to 0,
            "leccionNivel3Resta4" to 0,
            "leccionNivel4Resta4" to 0,
            "leccionNivel5Resta4" to 0,

            //multiplicacion
            "leccionNivel0Multiplicacion1" to 0,
            "leccionNivel1Multiplicacion1" to 0,
            "leccionNivel2Multiplicacion1" to 0,
            "leccionNivel3Multiplicacion1" to 0,
            "leccionNivel4Multiplicacion1" to 0,
            "leccionNivel5Multiplicacion1" to 0,

            "leccionNivel0Multiplicacion2" to 0,
            "leccionNivel1Multiplicacion2" to 0,
            "leccionNivel2Multiplicacion2" to 0,
            "leccionNivel3Multiplicacion2" to 0,
            "leccionNivel4Multiplicacion2" to 0,
            "leccionNivel5Multiplicacion2" to 0,

            "leccionNivel0Multiplicacion3" to 0,
            "leccionNivel1Multiplicacion3" to 0,
            "leccionNivel2Multiplicacion3" to 0,
            "leccionNivel3Multiplicacion3" to 0,
            "leccionNivel4Multiplicacion3" to 0,
            "leccionNivel5Multiplicacion3" to 0,

            "leccionNivel0Multiplicacion4" to 0,
            "leccionNivel1Multiplicacion4" to 0,
            "leccionNivel2Multiplicacion4" to 0,
            "leccionNivel3Multiplicacion4" to 0,
            "leccionNivel4Multiplicacion4" to 0,
            "leccionNivel5Multiplicacion4" to 0,

            ////Division
            "leccionNivel0Division1" to 0,
            "leccionNivel1Division1" to 0,
            "leccionNivel2Division1" to 0,
            "leccionNivel3Division1" to 0,
            "leccionNivel4Division1" to 0,
            "leccionNivel5Division1" to 0,

            ////Division
            "leccionNivel0Division2" to 0,
            "leccionNivel1Division2" to 0,
            "leccionNivel2Division2" to 0,
            "leccionNivel3Division2" to 0,
            "leccionNivel4Division2" to 0,
            "leccionNivel5Division2" to 0,

            ////Division
            "leccionNivel0Division3" to 0,
            "leccionNivel1Division3" to 0,
            "leccionNivel2Division3" to 0,
            "leccionNivel3Division3" to 0,
            "leccionNivel4Division3" to 0,
            "leccionNivel5Division3" to 0,

            ////Division
            "leccionNivel0Division4" to 0,
            "leccionNivel1Division4" to 0,
            "leccionNivel2Division4" to 0,
            "leccionNivel3Division4" to 0,
            "leccionNivel4Division4" to 0,
            "leccionNivel5Division4" to 0,











        "numeroLogins" to 1))

        val homeIntent:Intent = Intent (this,MenuAppPrincipal::class.java).apply {
            putExtra("email", email)
            putExtra("provider", provider.name)
        }
        startActivity(homeIntent)




    }










    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {


        callbackManager.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)


        //si la respuesta de la activity corresponde con la autentificacion de google
        if(requestCode == GOOGLE_SIGN_IN){
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)

            try{
                val account = task.getResult(ApiException::class.java)

                if(account != null){

                    val credential = GoogleAuthProvider.getCredential(account.idToken, null)

                    FirebaseAuth.getInstance().signInWithCredential(credential).addOnCompleteListener{
                        if(it.isSuccessful){
                            registro(account.email ?: "", ProviderType.GOOGLE)
                            showHome(account.email ?: "", ProviderType.GOOGLE)
                        }else{
                            showAlert()
                        }

                    }

                }

            }catch (e: ApiException){
                showAlert()
            }

        }

    }












    private fun registro(email: String, provider: ProviderType) {

        db.collection("user").document(email).set(
            hashMapOf(
                "email" to email,
                "nsuma1" to 1,
                "nsuma2" to 0,
                "nsuma3" to 0,
                "nsuma4" to 0,
                "nresta1" to 0,
                "nresta2" to 0,
                "nresta3" to 0,
                "nresta4" to 0,
                "nmulti1" to 0,
                "nmulti2" to 0,
                "nmulti3" to 0,
                "nmulti4" to 0,
                "ndivi1" to 0,
                "ndivi2" to 0,
                "ndivi3" to 0,
                "ndivi4" to 0,

                //suma
                "leccionNivel0Suma1" to 0,
                "leccionNivel1Suma1" to 1,
                "leccionNivel2Suma1" to 0,
                "leccionNivel3Suma1" to 0,
                "leccionNivel4Suma1" to 0,
                "leccionNivel5Suma1" to 0,

                "leccionNivel0Suma2" to 0,
                "leccionNivel1Suma2" to 0,
                "leccionNivel2Suma2" to 0,
                "leccionNivel3Suma2" to 0,
                "leccionNivel4Suma2" to 0,
                "leccionNivel5Suma2" to 0,

                "leccionNivel0Suma3" to 0,
                "leccionNivel1Suma3" to 0,
                "leccionNivel2Suma3" to 0,
                "leccionNivel3Suma3" to 0,
                "leccionNivel4Suma3" to 0,
                "leccionNivel5Suma3" to 0,

                "leccionNivel0Suma4" to 0,
                "leccionNivel1Suma4" to 0,
                "leccionNivel2Suma4" to 0,
                "leccionNivel3Suma4" to 0,
                "leccionNivel4Suma4" to 0,
                "leccionNivel5Suma4" to 0,


                //Resta
                "leccionNivel0Resta1" to 0,
                "leccionNivel1Resta1" to 0,
                "leccionNivel2Resta1" to 0,
                "leccionNivel3Resta1" to 0,
                "leccionNivel4Resta1" to 0,
                "leccionNivel5Resta1" to 0,

                "leccionNivel0Resta2" to 0,
                "leccionNivel1Resta2" to 0,
                "leccionNivel2Resta2" to 0,
                "leccionNivel3Resta2" to 0,
                "leccionNivel4Resta2" to 0,
                "leccionNivel5Resta2" to 0,

                "leccionNivel0Resta3" to 0,
                "leccionNivel1Resta3" to 0,
                "leccionNivel2Resta3" to 0,
                "leccionNivel3Resta3" to 0,
                "leccionNivel4Resta3" to 0,
                "leccionNivel5Resta3" to 0,

                "leccionNivel0Resta4" to 0,
                "leccionNivel1Resta4" to 0,
                "leccionNivel2Resta4" to 0,
                "leccionNivel3Resta4" to 0,
                "leccionNivel4Resta4" to 0,
                "leccionNivel5Resta4" to 0,

                //multiplicacion
                "leccionNivel0Multiplicacion1" to 0,
                "leccionNivel1Multiplicacion1" to 0,
                "leccionNivel2Multiplicacion1" to 0,
                "leccionNivel3Multiplicacion1" to 0,
                "leccionNivel4Multiplicacion1" to 0,
                "leccionNivel5Multiplicacion1" to 0,

                "leccionNivel0Multiplicacion2" to 0,
                "leccionNivel1Multiplicacion2" to 0,
                "leccionNivel2Multiplicacion2" to 0,
                "leccionNivel3Multiplicacion2" to 0,
                "leccionNivel4Multiplicacion2" to 0,
                "leccionNivel5Multiplicacion2" to 0,

                "leccionNivel0Multiplicacion3" to 0,
                "leccionNivel1Multiplicacion3" to 0,
                "leccionNivel2Multiplicacion3" to 0,
                "leccionNivel3Multiplicacion3" to 0,
                "leccionNivel4Multiplicacion3" to 0,
                "leccionNivel5Multiplicacion3" to 0,

                "leccionNivel0Multiplicacion4" to 0,
                "leccionNivel1Multiplicacion4" to 0,
                "leccionNivel2Multiplicacion4" to 0,
                "leccionNivel3Multiplicacion4" to 0,
                "leccionNivel4Multiplicacion4" to 0,
                "leccionNivel5Multiplicacion4" to 0,

                ////Division
                "leccionNivel0Division1" to 0,
                "leccionNivel1Division1" to 0,
                "leccionNivel2Division1" to 0,
                "leccionNivel3Division1" to 0,
                "leccionNivel4Division1" to 0,
                "leccionNivel5Division1" to 0,

                ////Division
                "leccionNivel0Division2" to 0,
                "leccionNivel1Division2" to 0,
                "leccionNivel2Division2" to 0,
                "leccionNivel3Division2" to 0,
                "leccionNivel4Division2" to 0,
                "leccionNivel5Division2" to 0,

                ////Division
                "leccionNivel0Division3" to 0,
                "leccionNivel1Division3" to 0,
                "leccionNivel2Division3" to 0,
                "leccionNivel3Division3" to 0,
                "leccionNivel4Division3" to 0,
                "leccionNivel5Division3" to 0,

                ////Division
                "leccionNivel0Division4" to 0,
                "leccionNivel1Division4" to 0,
                "leccionNivel2Division4" to 0,
                "leccionNivel3Division4" to 0,
                "leccionNivel4Division4" to 0,
                "leccionNivel5Division4" to 0,


                "numeroLogins" to 1
            )
        )

    }


















































}
