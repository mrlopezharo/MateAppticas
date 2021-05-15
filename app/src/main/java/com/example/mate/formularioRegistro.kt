package com.example.mate

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.facebook.login.LoginManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_formulario_registro.*


class formularioRegistro : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_registro)




        var bundle = intent.extras

        //PROVEDORES Y EMAIL POR MEDIO DE LOGIN
        val email:String? =bundle?.getString("email")
        val provider:String? =bundle?.getString("provider")































        btnSiguiente.setOnClickListener{

            //setup(email ?:"", provider ?:"")

            var ComenzarEjercicio = Intent(this, MenuAppPrincipal::class.java)

           /* putExtra("email", email)
            putExtra("provider", provider.name)

*/
            startActivity(ComenzarEjercicio)
        }


    }
}


