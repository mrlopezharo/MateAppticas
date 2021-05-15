package com.example.mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_ejercicio_terminado.*
import kotlin.random.Random

class EjercicioTerminado : AppCompatActivity() {


    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_terminado)




        var bundle = intent.extras
        var aciertos = bundle?.getInt("aciertosEnLeccion")
        var errores = bundle?.getInt("errores")
        var tipoOperacion = bundle?.getInt("tipoOperacion")
        var email = bundle?.getString("email")
        var provider = bundle?.getString("provider")
        var nivelejercicio = bundle?.getInt("nivelejercicio")
        var buttonSelect = bundle?.getInt("buttonSelect")


        btnPracticaTerminada.setOnClickListener {


            var resultado= Intent(this, resultados::class.java)

            var numEjercicio = Random.nextInt(1, 5)




            print("ESTE ES EL NIVEL DE LA LECCION : $nivelejercicio !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")



            if (email != null) {
                db.collection("user").document(email).get().addOnSuccessListener {


                    //traer variables desde la base de datos en tiempo real.
                    var nsuma1prueba = it.getLong("nsuma1")?.toInt()!!//suma
                    var nsuma2prueba = it.getLong("nsuma2")?.toInt()!!
                    var nsuma3prueba = it.getLong("nsuma3")?.toInt()!!
                    var nsuma4prueba = it.getLong("nsuma4")?.toInt()!!

                    var nresta1prueba = it.getLong("nresta1")?.toInt()!!//resta
                    var nresta2prueba = it.getLong("nresta2")?.toInt()!!
                    var nresta3prueba = it.getLong("nresta3")?.toInt()!!
                    var nresta4prueba = it.getLong("nresta4")?.toInt()!!

                    var nmulti1prueba = it.getLong("nmulti1")?.toInt()!!//multiplicacion
                    var nmulti2prueba = it.getLong("nmulti2")?.toInt()!!
                    var nmulti3prueba = it.getLong("nmulti3")?.toInt()!!
                    var nmulti4prueba = it.getLong("nmulti4")?.toInt()!!

                    var ndivi1prueba = it.getLong("ndivi1")?.toInt()!!//division
                    var ndivi2prueba = it.getLong("ndivi2")?.toInt()!!
                    var ndivi3prueba = it.getLong("ndivi3")?.toInt()!!
                    var ndivi4prueba = it.getLong("ndivi4")?.toInt()!!

                    //suma
                    var leccionNivel0Suma1 = it.getLong("leccionNivel0Suma1")?.toInt()!!//suma
                    var leccionNivel1Suma1 = it.getLong("leccionNivel1Suma1")?.toInt()!!//suma
                    var leccionNivel2Suma1 = it.getLong("leccionNivel2Suma1")?.toInt()!!//suma
                    var leccionNivel3Suma1 = it.getLong("leccionNivel3Suma1")?.toInt()!!//suma
                    var leccionNivel4Suma1 = it.getLong("leccionNivel4Suma1")?.toInt()!!//suma
                    var leccionNivel5Suma1 = it.getLong("leccionNivel5Suma1")?.toInt()!!//suma

                    var leccionNivel0Suma2 = it.getLong("leccionNivel0Suma2")?.toInt()!!//suma
                    var leccionNivel1Suma2 = it.getLong("leccionNivel1Suma2")?.toInt()!!//suma
                    var leccionNivel2Suma2 = it.getLong("leccionNivel2Suma2")?.toInt()!!//suma
                    var leccionNivel3Suma2 = it.getLong("leccionNivel3Suma2")?.toInt()!!//suma
                    var leccionNivel4Suma2 = it.getLong("leccionNivel4Suma2")?.toInt()!!//suma
                    var leccionNivel5Suma2 = it.getLong("leccionNivel5Suma2")?.toInt()!!//suma

                    var leccionNivel0Suma3 = it.getLong("leccionNivel0Suma3")?.toInt()!!//suma
                    var leccionNivel1Suma3 = it.getLong("leccionNivel1Suma3")?.toInt()!!//suma
                    var leccionNivel2Suma3 = it.getLong("leccionNivel2Suma3")?.toInt()!!//suma
                    var leccionNivel3Suma3 = it.getLong("leccionNivel3Suma3")?.toInt()!!//suma
                    var leccionNivel4Suma3 = it.getLong("leccionNivel4Suma3")?.toInt()!!//suma
                    var leccionNivel5Suma3 = it.getLong("leccionNivel5Suma3")?.toInt()!!//suma

                    var leccionNivel0Suma4 = it.getLong("leccionNivel0Suma4")?.toInt()!!//suma
                    var leccionNivel1Suma4 = it.getLong("leccionNivel1Suma4")?.toInt()!!//suma
                    var leccionNivel2Suma4 = it.getLong("leccionNivel2Suma4")?.toInt()!!//suma
                    var leccionNivel3Suma4 = it.getLong("leccionNivel3Suma4")?.toInt()!!//suma
                    var leccionNivel4Suma4 = it.getLong("leccionNivel4Suma4")?.toInt()!!//suma
                    var leccionNivel5Suma4 = it.getLong("leccionNivel5Suma4")?.toInt()!!//suma
                    
                    //Resta
                    var leccionNivel0Resta1 = it.getLong("leccionNivel0Resta1")?.toInt()!!//Resta
                    var leccionNivel1Resta1 = it.getLong("leccionNivel1Resta1")?.toInt()!!//Resta
                    var leccionNivel2Resta1 = it.getLong("leccionNivel2Resta1")?.toInt()!!//Resta
                    var leccionNivel3Resta1 = it.getLong("leccionNivel3Resta1")?.toInt()!!//Resta
                    var leccionNivel4Resta1 = it.getLong("leccionNivel4Resta1")?.toInt()!!//Resta
                    var leccionNivel5Resta1 = it.getLong("leccionNivel5Resta1")?.toInt()!!//Resta

                    var leccionNivel0Resta2 = it.getLong("leccionNivel0Resta2")?.toInt()!!//Resta
                    var leccionNivel1Resta2 = it.getLong("leccionNivel1Resta2")?.toInt()!!//Resta
                    var leccionNivel2Resta2 = it.getLong("leccionNivel2Resta2")?.toInt()!!//Resta
                    var leccionNivel3Resta2 = it.getLong("leccionNivel3Resta2")?.toInt()!!//Resta
                    var leccionNivel4Resta2 = it.getLong("leccionNivel4Resta2")?.toInt()!!//Resta
                    var leccionNivel5Resta2 = it.getLong("leccionNivel5Resta2")?.toInt()!!//Resta

                    var leccionNivel0Resta3 = it.getLong("leccionNivel0Resta3")?.toInt()!!//Resta
                    var leccionNivel1Resta3 = it.getLong("leccionNivel1Resta3")?.toInt()!!//Resta
                    var leccionNivel2Resta3 = it.getLong("leccionNivel2Resta3")?.toInt()!!//Resta
                    var leccionNivel3Resta3 = it.getLong("leccionNivel3Resta3")?.toInt()!!//Resta
                    var leccionNivel4Resta3 = it.getLong("leccionNivel4Resta3")?.toInt()!!//Resta
                    var leccionNivel5Resta3 = it.getLong("leccionNivel5Resta3")?.toInt()!!//Resta

                    var leccionNivel0Resta4 = it.getLong("leccionNivel0Resta4")?.toInt()!!//Resta
                    var leccionNivel1Resta4 = it.getLong("leccionNivel1Resta4")?.toInt()!!//Resta
                    var leccionNivel2Resta4 = it.getLong("leccionNivel2Resta4")?.toInt()!!//Resta
                    var leccionNivel3Resta4 = it.getLong("leccionNivel3Resta4")?.toInt()!!//Resta
                    var leccionNivel4Resta4 = it.getLong("leccionNivel4Resta4")?.toInt()!!//Resta
                    var leccionNivel5Resta4 = it.getLong("leccionNivel5Resta4")?.toInt()!!//Resta



                    //Multiplicacion
                    var leccionNivel0Multiplicacion1 = it.getLong("leccionNivel0Multiplicacion1")?.toInt()!!//Multiplicacion
                    var leccionNivel1Multiplicacion1 = it.getLong("leccionNivel1Multiplicacion1")?.toInt()!!//Multiplicacion
                    var leccionNivel2Multiplicacion1 = it.getLong("leccionNivel2Multiplicacion1")?.toInt()!!//Multiplicacion
                    var leccionNivel3Multiplicacion1 = it.getLong("leccionNivel3Multiplicacion1")?.toInt()!!//Multiplicacion
                    var leccionNivel4Multiplicacion1 = it.getLong("leccionNivel4Multiplicacion1")?.toInt()!!//Multiplicacion
                    var leccionNivel5Multiplicacion1 = it.getLong("leccionNivel5Multiplicacion1")?.toInt()!!//Multiplicacion

                    var leccionNivel0Multiplicacion2 = it.getLong("leccionNivel0Multiplicacion2")?.toInt()!!//Multiplicacion
                    var leccionNivel1Multiplicacion2 = it.getLong("leccionNivel1Multiplicacion2")?.toInt()!!//Multiplicacion
                    var leccionNivel2Multiplicacion2 = it.getLong("leccionNivel2Multiplicacion2")?.toInt()!!//Multiplicacion
                    var leccionNivel3Multiplicacion2 = it.getLong("leccionNivel3Multiplicacion2")?.toInt()!!//Multiplicacion
                    var leccionNivel4Multiplicacion2 = it.getLong("leccionNivel4Multiplicacion2")?.toInt()!!//Multiplicacion
                    var leccionNivel5Multiplicacion2 = it.getLong("leccionNivel5Multiplicacion2")?.toInt()!!//Multiplicacion

                    var leccionNivel0Multiplicacion3 = it.getLong("leccionNivel0Multiplicacion3")?.toInt()!!//Multiplicacion
                    var leccionNivel1Multiplicacion3 = it.getLong("leccionNivel1Multiplicacion3")?.toInt()!!//Multiplicacion
                    var leccionNivel2Multiplicacion3 = it.getLong("leccionNivel2Multiplicacion3")?.toInt()!!//Multiplicacion
                    var leccionNivel3Multiplicacion3 = it.getLong("leccionNivel3Multiplicacion3")?.toInt()!!//Multiplicacion
                    var leccionNivel4Multiplicacion3 = it.getLong("leccionNivel4Multiplicacion3")?.toInt()!!//Multiplicacion
                    var leccionNivel5Multiplicacion3 = it.getLong("leccionNivel5Multiplicacion3")?.toInt()!!//Multiplicacion

                    var leccionNivel0Multiplicacion4 = it.getLong("leccionNivel0Multiplicacion4")?.toInt()!!//Multiplicacion
                    var leccionNivel1Multiplicacion4 = it.getLong("leccionNivel1Multiplicacion4")?.toInt()!!//Multiplicacion
                    var leccionNivel2Multiplicacion4 = it.getLong("leccionNivel2Multiplicacion4")?.toInt()!!//Multiplicacion
                    var leccionNivel3Multiplicacion4 = it.getLong("leccionNivel3Multiplicacion4")?.toInt()!!//Multiplicacion
                    var leccionNivel4Multiplicacion4 = it.getLong("leccionNivel4Multiplicacion4")?.toInt()!!//Multiplicacion
                    var leccionNivel5Multiplicacion4 = it.getLong("leccionNivel5Multiplicacion4")?.toInt()!!//Multiplicacion



                    //Division
                    var leccionNivel0Division1 = it.getLong("leccionNivel0Division1")?.toInt()!!//Division
                    var leccionNivel1Division1 = it.getLong("leccionNivel1Division1")?.toInt()!!//Division
                    var leccionNivel2Division1 = it.getLong("leccionNivel2Division1")?.toInt()!!//Division
                    var leccionNivel3Division1 = it.getLong("leccionNivel3Division1")?.toInt()!!//Division
                    var leccionNivel4Division1 = it.getLong("leccionNivel4Division1")?.toInt()!!//Division
                    var leccionNivel5Division1 = it.getLong("leccionNivel5Division1")?.toInt()!!//Division

                    var leccionNivel0Division2 = it.getLong("leccionNivel0Division2")?.toInt()!!//Division
                    var leccionNivel1Division2 = it.getLong("leccionNivel1Division2")?.toInt()!!//Division
                    var leccionNivel2Division2 = it.getLong("leccionNivel2Division2")?.toInt()!!//Division
                    var leccionNivel3Division2 = it.getLong("leccionNivel3Division2")?.toInt()!!//Division
                    var leccionNivel4Division2 = it.getLong("leccionNivel4Division2")?.toInt()!!//Division
                    var leccionNivel5Division2 = it.getLong("leccionNivel5Division2")?.toInt()!!//Division

                    var leccionNivel0Division3 = it.getLong("leccionNivel0Division3")?.toInt()!!//Division
                    var leccionNivel1Division3 = it.getLong("leccionNivel1Division3")?.toInt()!!//Division
                    var leccionNivel2Division3 = it.getLong("leccionNivel2Division3")?.toInt()!!//Division
                    var leccionNivel3Division3 = it.getLong("leccionNivel3Division3")?.toInt()!!//Division
                    var leccionNivel4Division3 = it.getLong("leccionNivel4Division3")?.toInt()!!//Division
                    var leccionNivel5Division3 = it.getLong("leccionNivel5Division3")?.toInt()!!//Division

                    var leccionNivel0Division4 = it.getLong("leccionNivel0Division4")?.toInt()!!//Division
                    var leccionNivel1Division4 = it.getLong("leccionNivel1Division4")?.toInt()!!//Division
                    var leccionNivel2Division4 = it.getLong("leccionNivel2Division4")?.toInt()!!//Division
                    var leccionNivel3Division4 = it.getLong("leccionNivel3Division4")?.toInt()!!//Division
                    var leccionNivel4Division4 = it.getLong("leccionNivel4Division4")?.toInt()!!//Division
                    var leccionNivel5Division4 = it.getLong("leccionNivel5Division4")?.toInt()!!//Division








                    //depende del botton
                    when(buttonSelect)
                    {
                        //sumas
                        1 ->{//suma1
                            when(nsuma1prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Suma1<10){
                                        leccionNivel1Suma1++
                                    }
                                    if(leccionNivel1Suma1==10){
                                        if(nsuma1prueba==1){
                                            nsuma1prueba++
                                            leccionNivel2Suma1=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Suma1<10){
                                        leccionNivel2Suma1++
                                    }
                                    if(leccionNivel2Suma1==10){
                                        if(nsuma1prueba==2){
                                            nsuma1prueba++
                                            leccionNivel3Suma1=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Suma1<10){
                                        leccionNivel3Suma1++
                                    }
                                    if(leccionNivel3Suma1==10){
                                        if(nsuma1prueba==3){
                                            nsuma1prueba++
                                            leccionNivel4Suma1=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Suma1<10){
                                        leccionNivel4Suma1++
                                    }
                                    if(leccionNivel4Suma1==10){
                                        if(nsuma1prueba==4){
                                            nsuma1prueba++
                                            leccionNivel5Suma1=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Suma1<10){
                                        leccionNivel5Suma1++
                                    }
                                    if(leccionNivel5Suma1==10){
                                        if(nsuma2prueba==0){
                                            nsuma2prueba++
                                            leccionNivel1Suma2++
                                        }
                                    }
                                }
                            }

                        }
                        2 ->{//suma2
                            when(nsuma2prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Suma2<10){
                                        leccionNivel1Suma2++
                                    }
                                    if(leccionNivel1Suma2==10){
                                        if(nsuma2prueba==1){
                                            nsuma2prueba++
                                            leccionNivel2Suma2=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Suma2<10){
                                        leccionNivel2Suma2++
                                    }
                                    if(leccionNivel2Suma2==10){
                                        if(nsuma2prueba==2){
                                            nsuma2prueba++
                                            leccionNivel3Suma2=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Suma2<10){
                                        leccionNivel3Suma2++
                                    }
                                    if(leccionNivel3Suma2==10){
                                        if(nsuma2prueba==3){
                                            nsuma2prueba++
                                            leccionNivel4Suma2=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Suma2<10){
                                        leccionNivel4Suma2++
                                    }
                                    if(leccionNivel4Suma2==10){
                                        if(nsuma2prueba==4){
                                            nsuma2prueba++
                                            leccionNivel5Suma2=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Suma2<10){
                                        leccionNivel5Suma2++
                                    }
                                    if(leccionNivel5Suma2==10){
                                        if(nsuma3prueba==0){
                                            nsuma3prueba++
                                            leccionNivel1Suma3++
                                        }
                                    }
                                }
                            }

                        }
                        3 ->{//suma3
                            when(nsuma3prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Suma3<10){
                                        leccionNivel1Suma3++
                                    }
                                    if(leccionNivel1Suma3==10){
                                        if(nsuma3prueba==1){
                                            nsuma3prueba++
                                            leccionNivel2Suma3=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Suma3<10){
                                        leccionNivel2Suma3++
                                    }
                                    if(leccionNivel2Suma3==10){
                                        if(nsuma3prueba==2){
                                            nsuma3prueba++
                                            leccionNivel3Suma3=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Suma3<10){
                                        leccionNivel3Suma3++
                                    }
                                    if(leccionNivel3Suma3==10){
                                        if(nsuma3prueba==3){
                                            nsuma3prueba++
                                            leccionNivel4Suma3=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Suma3<10){
                                        leccionNivel4Suma3++
                                    }
                                    if(leccionNivel4Suma3==10){
                                        if(nsuma3prueba==4){
                                            nsuma3prueba++
                                            leccionNivel5Suma3=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Suma3<10){
                                        leccionNivel5Suma3++
                                    }
                                    if(leccionNivel5Suma3==10){
                                        if(nsuma4prueba==0){
                                            nsuma4prueba++
                                            leccionNivel1Suma4++
                                        }
                                    }
                                }
                            }
                        }
                        4 ->{//suma4
                            when(nsuma4prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Suma4<10){
                                        leccionNivel1Suma4++
                                    }
                                    if(leccionNivel1Suma4==10){
                                        if(nsuma4prueba==1){
                                            nsuma4prueba++
                                            leccionNivel2Suma4=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Suma4<10){
                                        leccionNivel2Suma4++
                                    }
                                    if(leccionNivel2Suma4==10){
                                        if(nsuma4prueba==2){
                                            nsuma4prueba++
                                            leccionNivel3Suma4=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Suma4<10){
                                        leccionNivel3Suma4++
                                    }
                                    if(leccionNivel3Suma4==10){
                                        if(nsuma4prueba==3){
                                            nsuma4prueba++
                                            leccionNivel4Suma4=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Suma4<10){
                                        leccionNivel4Suma4++
                                    }
                                    if(leccionNivel4Suma4==10){
                                        if(nsuma4prueba==4){
                                            nsuma4prueba++
                                            leccionNivel5Suma4=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Suma4<10){
                                        leccionNivel5Suma4++
                                    }
                                    if(leccionNivel5Suma4==10){
                                        if(nresta1prueba==0){
                                            nresta1prueba++
                                            leccionNivel1Resta1++
                                        }
                                    }
                                }
                            }

                        }
                        5->{//restas
                            when(nresta1prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Resta1<10){
                                        leccionNivel1Resta1++
                                    }
                                    if(leccionNivel1Resta1==10){
                                        if(nresta1prueba==1){
                                            nresta1prueba++
                                            leccionNivel2Resta1=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Resta1<10){
                                        leccionNivel2Resta1++
                                    }
                                    if(leccionNivel2Resta1==10){
                                        if(nresta1prueba==2){
                                            nresta1prueba++
                                            leccionNivel3Resta1=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Resta1<10){
                                        leccionNivel3Resta1++
                                    }
                                    if(leccionNivel3Resta1==10){
                                        if(nresta1prueba==3){
                                            nresta1prueba++
                                            leccionNivel4Resta1=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Resta1<10){
                                        leccionNivel4Resta1++
                                    }
                                    if(leccionNivel4Resta1==10){
                                        if(nresta1prueba==4){
                                            nresta1prueba++
                                            leccionNivel5Resta1=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Resta1<10){
                                        leccionNivel5Resta1++
                                    }
                                    if(leccionNivel5Resta1==10){
                                        if(nresta2prueba==0){
                                            nresta2prueba++
                                            leccionNivel1Resta2++
                                        }
                                    }
                                }
                            }
                        }

                        6->{



                            when(nresta2prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Resta2<10){
                                        leccionNivel1Resta2++
                                    }
                                    if(leccionNivel1Resta2==10){
                                        if(nresta2prueba==1){
                                            nresta2prueba++
                                            leccionNivel2Resta2=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Resta2<10){
                                        leccionNivel2Resta2++
                                    }
                                    if(leccionNivel2Resta2==10){
                                        if(nresta2prueba==2){
                                            nresta2prueba++
                                            leccionNivel3Resta2=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Resta2<10){
                                        leccionNivel3Resta2++
                                    }
                                    if(leccionNivel3Resta2==10){
                                        if(nresta2prueba==3){
                                            nresta2prueba++
                                            leccionNivel4Resta2=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Resta2<10){
                                        leccionNivel4Resta2++
                                    }
                                    if(leccionNivel4Resta2==10){
                                        if(nresta2prueba==4){
                                            nresta2prueba++
                                            leccionNivel5Resta2=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Resta2<10){
                                        leccionNivel5Resta2++
                                    }
                                    if(leccionNivel5Resta2==10){
                                        if(nresta3prueba==0){
                                            nresta3prueba++
                                            leccionNivel1Resta3++
                                        }
                                    }
                                }
                            }
                        }

                        7->{//botton resta 3
                            when(nresta3prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Resta3<10){
                                        leccionNivel1Resta3++
                                    }
                                    if(leccionNivel1Resta3==10){
                                        if(nresta3prueba==1){
                                            nresta3prueba++
                                            leccionNivel2Resta3=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Resta3<10){
                                        leccionNivel2Resta3++
                                    }
                                    if(leccionNivel2Resta3==10){
                                        if(nresta3prueba==2){
                                            nresta3prueba++
                                            leccionNivel3Resta3=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Resta3<10){
                                        leccionNivel3Resta3++
                                    }
                                    if(leccionNivel3Resta3==10){
                                        if(nresta3prueba==3){
                                            nresta3prueba++
                                            leccionNivel4Resta3=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Resta3<10){
                                        leccionNivel4Resta3++
                                    }
                                    if(leccionNivel4Resta3==10){
                                        if(nresta3prueba==4){
                                            nresta3prueba++
                                            leccionNivel5Resta3=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Resta3<10){
                                        leccionNivel5Resta3++
                                    }
                                    if(leccionNivel5Resta3==10){
                                        if(nresta4prueba==0){
                                            nresta4prueba++
                                            leccionNivel1Resta4++
                                        }
                                    }
                                }
                            }
                        }


                        8->{


                            when(nresta4prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Resta4<10){
                                        leccionNivel1Resta4++
                                    }
                                    if(leccionNivel1Resta4==10){
                                        if(nresta4prueba==1){
                                            nresta4prueba++
                                            leccionNivel2Resta4=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Resta4<10){
                                        leccionNivel2Resta4++
                                    }
                                    if(leccionNivel2Resta4==10){
                                        if(nresta4prueba==2){
                                            nresta4prueba++
                                            leccionNivel3Resta4=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Resta4<10){
                                        leccionNivel3Resta4++
                                    }
                                    if(leccionNivel3Resta4==10){
                                        if(nresta4prueba==3){
                                            nresta4prueba++
                                            leccionNivel4Resta4=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Resta4<10){
                                        leccionNivel4Resta4++
                                    }
                                    if(leccionNivel4Resta4==10){
                                        if(nresta4prueba==4){
                                            nresta4prueba++
                                            leccionNivel5Resta4=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Resta4<10){
                                        leccionNivel5Resta4++
                                    }
                                    if(leccionNivel5Resta4==10){
                                        if(nmulti1prueba==0){
                                            nmulti1prueba++
                                            leccionNivel1Multiplicacion1++
                                        }
                                    }
                                }
                            }


                        }


                        9->{//multiplicacion

                            when(nmulti1prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Multiplicacion1<10){
                                        leccionNivel1Multiplicacion1++
                                    }
                                    if(leccionNivel1Multiplicacion1==10){
                                        if(nmulti1prueba==1){
                                            nmulti1prueba++
                                            leccionNivel2Multiplicacion1=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Multiplicacion1<10){
                                        leccionNivel2Multiplicacion1++
                                    }
                                    if(leccionNivel2Multiplicacion1==10){
                                        if(nmulti1prueba==2){
                                            nmulti1prueba++
                                            leccionNivel3Multiplicacion1=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Multiplicacion1<10){
                                        leccionNivel3Multiplicacion1++
                                    }
                                    if(leccionNivel3Multiplicacion1==10){
                                        if(nmulti1prueba==3){
                                            nmulti1prueba++
                                            leccionNivel4Multiplicacion1=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Multiplicacion1<10){
                                        leccionNivel4Multiplicacion1++
                                    }
                                    if(leccionNivel4Multiplicacion1==10){
                                        if(nmulti1prueba==4){
                                            nmulti1prueba++
                                            leccionNivel5Multiplicacion1=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Multiplicacion1<10){
                                        leccionNivel5Multiplicacion1++
                                    }
                                    if(leccionNivel5Multiplicacion1==10){
                                        if(nmulti2prueba==0){
                                            nmulti2prueba++
                                            leccionNivel1Multiplicacion2++
                                        }
                                    }
                                }
                            }

                        }

                        10->{
                            when(nmulti2prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Multiplicacion2<10){
                                        leccionNivel1Multiplicacion2++
                                    }
                                    if(leccionNivel1Multiplicacion2==10){
                                        if(nmulti2prueba==1){
                                            nmulti2prueba++
                                            leccionNivel2Multiplicacion2=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Multiplicacion2<10){
                                        leccionNivel2Multiplicacion2++
                                    }
                                    if(leccionNivel2Multiplicacion2==10){
                                        if(nmulti2prueba==2){
                                            nmulti2prueba++
                                            leccionNivel3Multiplicacion2=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Multiplicacion2<10){
                                        leccionNivel3Multiplicacion2++
                                    }
                                    if(leccionNivel3Multiplicacion2==10){
                                        if(nmulti2prueba==3){
                                            nmulti2prueba++
                                            leccionNivel4Multiplicacion2=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Multiplicacion2<10){
                                        leccionNivel4Multiplicacion2++
                                    }
                                    if(leccionNivel4Multiplicacion2==10){
                                        if(nmulti2prueba==4){
                                            nmulti2prueba++
                                            leccionNivel5Multiplicacion2=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Multiplicacion2<10){
                                        leccionNivel5Multiplicacion2++
                                    }
                                    if(leccionNivel5Multiplicacion2==10){
                                        if(nmulti3prueba==0){
                                            nmulti3prueba++
                                            leccionNivel1Multiplicacion3++
                                        }
                                    }
                                }
                            }

                        }
                        11->{
                            when(nmulti3prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Multiplicacion3<10){
                                        leccionNivel1Multiplicacion3++
                                    }
                                    if(leccionNivel1Multiplicacion3==10){
                                        if(nmulti3prueba==1){
                                            nmulti3prueba++
                                            leccionNivel2Multiplicacion3=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Multiplicacion3<10){
                                        leccionNivel2Multiplicacion3++
                                    }
                                    if(leccionNivel2Multiplicacion3==10){
                                        if(nmulti3prueba==2){
                                            nmulti3prueba++
                                            leccionNivel3Multiplicacion3=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Multiplicacion3<10){
                                        leccionNivel3Multiplicacion3++
                                    }
                                    if(leccionNivel3Multiplicacion3==10){
                                        if(nmulti3prueba==3){
                                            nmulti3prueba++
                                            leccionNivel4Multiplicacion3=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Multiplicacion3<10){
                                        leccionNivel4Multiplicacion3++
                                    }
                                    if(leccionNivel4Multiplicacion3==10){
                                        if(nmulti3prueba==4){
                                            nmulti3prueba++
                                            leccionNivel5Multiplicacion3=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Multiplicacion3<10){
                                        leccionNivel5Multiplicacion3++
                                    }
                                    if(leccionNivel5Multiplicacion3==10){
                                        if(nmulti4prueba==0){
                                            nmulti4prueba++
                                            leccionNivel1Multiplicacion4++
                                        }
                                    }
                                }
                            }



                        }
                        12->{
                            when(nmulti4prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Multiplicacion4<10){
                                        leccionNivel1Multiplicacion4++
                                    }
                                    if(leccionNivel1Multiplicacion4==10){
                                        if(nmulti4prueba==1){
                                            nmulti4prueba++
                                            leccionNivel2Multiplicacion4=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Multiplicacion4<10){
                                        leccionNivel2Multiplicacion4++
                                    }
                                    if(leccionNivel2Multiplicacion4==10){
                                        if(nmulti4prueba==2){
                                            nmulti4prueba++
                                            leccionNivel3Multiplicacion4=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Multiplicacion4<10){
                                        leccionNivel3Multiplicacion4++
                                    }
                                    if(leccionNivel3Multiplicacion4==10){
                                        if(nmulti4prueba==3){
                                            nmulti4prueba++
                                            leccionNivel4Multiplicacion4=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Multiplicacion4<10){
                                        leccionNivel4Multiplicacion4++
                                    }
                                    if(leccionNivel4Multiplicacion4==10){
                                        if(nmulti4prueba==4){
                                            nmulti4prueba++
                                            leccionNivel5Multiplicacion4=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Multiplicacion4<10){
                                        leccionNivel5Multiplicacion4++
                                    }
                                    if(leccionNivel5Multiplicacion4==10){
                                        if(ndivi1prueba==0){
                                            ndivi1prueba++
                                            leccionNivel1Division1++
                                        }
                                    }
                                }
                            }

                        }


                        13->{//division

                            when(ndivi1prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Division1<10){
                                        leccionNivel1Division1++
                                    }
                                    if(leccionNivel1Division1==10){
                                        if(ndivi1prueba==1){
                                            ndivi1prueba++
                                            leccionNivel2Division1=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Division1<10){
                                        leccionNivel2Division1++
                                    }
                                    if(leccionNivel2Division1==10){
                                        if(ndivi1prueba==2){
                                            ndivi1prueba++
                                            leccionNivel3Division1=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Division1<10){
                                        leccionNivel3Division1++
                                    }
                                    if(leccionNivel3Division1==10){
                                        if(ndivi1prueba==3){
                                            ndivi1prueba++
                                            leccionNivel4Division1=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Division1<10){
                                        leccionNivel4Division1++
                                    }
                                    if(leccionNivel4Division1==10){
                                        if(ndivi1prueba==4){
                                            ndivi1prueba++
                                            leccionNivel5Division1=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Division1<10){
                                        leccionNivel5Division1++
                                    }
                                    if(leccionNivel5Division1==10){
                                        if(ndivi2prueba==0){
                                            ndivi2prueba++
                                            leccionNivel1Division2++
                                        }
                                    }
                                }
                            }


                        }
                        14->{

                            when(ndivi2prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Division2<10){
                                        leccionNivel1Division2++
                                    }
                                    if(leccionNivel1Division2==10){
                                        if(ndivi2prueba==1){
                                            ndivi2prueba++
                                            leccionNivel2Division2=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Division2<10){
                                        leccionNivel2Division2++
                                    }
                                    if(leccionNivel2Division2==10){
                                        if(ndivi2prueba==2){
                                            ndivi2prueba++
                                            leccionNivel3Division2=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Division2<10){
                                        leccionNivel3Division2++
                                    }
                                    if(leccionNivel3Division2==10){
                                        if(ndivi2prueba==3){
                                            ndivi2prueba++
                                            leccionNivel4Division2=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Division2<10){
                                        leccionNivel4Division2++
                                    }
                                    if(leccionNivel4Division2==10){
                                        if(ndivi2prueba==4){
                                            ndivi2prueba++
                                            leccionNivel5Division2=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Division2<10){
                                        leccionNivel5Division2++
                                    }
                                    if(leccionNivel5Division2==10){
                                        if(ndivi3prueba==0){
                                            ndivi3prueba++
                                            leccionNivel1Division3++
                                        }
                                    }
                                }
                            }


                        }
                        15->{

                            when(ndivi3prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Division3<10){
                                        leccionNivel1Division3++
                                    }
                                    if(leccionNivel1Division3==10){
                                        if(ndivi3prueba==1){
                                            ndivi3prueba++
                                            leccionNivel2Division3=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Division3<10){
                                        leccionNivel2Division3++
                                    }
                                    if(leccionNivel2Division3==10){
                                        if(ndivi3prueba==2){
                                            ndivi3prueba++
                                            leccionNivel3Division3=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Division3<10){
                                        leccionNivel3Division3++
                                    }
                                    if(leccionNivel3Division3==10){
                                        if(ndivi3prueba==3){
                                            ndivi3prueba++
                                            leccionNivel4Division3=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Division3<10){
                                        leccionNivel4Division3++
                                    }
                                    if(leccionNivel4Division3==10){
                                        if(ndivi3prueba==4){
                                            ndivi3prueba++
                                            leccionNivel5Division3=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Division3<10){
                                        leccionNivel5Division3++
                                    }
                                    if(leccionNivel5Division3==10){
                                        if(ndivi4prueba==0){
                                            ndivi4prueba++
                                            leccionNivel1Division4++
                                        }
                                    }
                                }
                            }


                        }
                        16->{

                            when(ndivi4prueba){
                                1->{//nivel 1
                                    if(leccionNivel1Division4<10){
                                        leccionNivel1Division4++
                                    }
                                    if(leccionNivel1Division4==10){
                                        if(ndivi4prueba==1){
                                            ndivi4prueba++
                                            leccionNivel2Division4=1
                                        }
                                    }
                                }

                                2->{//nivel 2
                                    if(leccionNivel2Division4<10){
                                        leccionNivel2Division4++
                                    }
                                    if(leccionNivel2Division4==10){
                                        if(ndivi4prueba==2){
                                            ndivi4prueba++
                                            leccionNivel3Division4=1
                                        }
                                    }
                                }

                                3->{//nivel 3
                                    if(leccionNivel3Division4<10){
                                        leccionNivel3Division4++
                                    }
                                    if(leccionNivel3Division4==10){
                                        if(ndivi4prueba==3){
                                            ndivi4prueba++
                                            leccionNivel4Division4=1
                                        }
                                    }
                                }
                                4->{//nivel 4
                                    if(leccionNivel4Division4<10){
                                        leccionNivel4Division4++
                                    }
                                    if(leccionNivel4Division4==10){
                                        if(ndivi4prueba==4){
                                            ndivi4prueba++
                                            leccionNivel5Division4=1
                                        }
                                    }
                                }
                                5->{//nivel 5
                                    if(leccionNivel5Division4<10){
                                        leccionNivel5Division4++
                                    }
                                    if(leccionNivel5Division4==10){

                                    }
                                }
                            }



                        }
























                    }































                    if (email != null) {
                        db.collection("user").document(email).set(
                            hashMapOf(
                                "email" to email,
                                "nsuma1" to nsuma1prueba,
                                "nsuma2" to nsuma2prueba,
                                "nsuma3" to nsuma3prueba,
                                "nsuma4" to nsuma4prueba,
                                "nresta1" to nresta1prueba,
                                "nresta2" to nresta2prueba,
                                "nresta3" to nresta3prueba,
                                "nresta4" to nresta4prueba,
                                "nmulti1" to nmulti1prueba,
                                "nmulti2" to nmulti2prueba,
                                "nmulti3" to nmulti3prueba,
                                "nmulti4" to nmulti4prueba,
                                "ndivi1" to ndivi1prueba,
                                "ndivi2" to ndivi2prueba,
                                "ndivi3" to ndivi3prueba,
                                "ndivi4" to ndivi4prueba,
                                //suma
                                "leccionNivel0Suma1" to leccionNivel0Suma1,
                                "leccionNivel1Suma1" to leccionNivel1Suma1,
                                "leccionNivel2Suma1" to leccionNivel2Suma1,
                                "leccionNivel3Suma1" to leccionNivel3Suma1,
                                "leccionNivel4Suma1" to leccionNivel4Suma1,
                                "leccionNivel5Suma1" to leccionNivel5Suma1,

                                "leccionNivel0Suma2" to leccionNivel0Suma2,
                                "leccionNivel1Suma2" to leccionNivel1Suma2,
                                "leccionNivel2Suma2" to leccionNivel2Suma2,
                                "leccionNivel3Suma2" to leccionNivel3Suma2,
                                "leccionNivel4Suma2" to leccionNivel4Suma2,
                                "leccionNivel5Suma2" to leccionNivel5Suma2,

                                "leccionNivel0Suma3" to leccionNivel0Suma3,
                                "leccionNivel1Suma3" to leccionNivel1Suma3,
                                "leccionNivel2Suma3" to leccionNivel2Suma3,
                                "leccionNivel3Suma3" to leccionNivel3Suma3,
                                "leccionNivel4Suma3" to leccionNivel4Suma3,
                                "leccionNivel5Suma3" to leccionNivel5Suma3,

                                "leccionNivel0Suma4" to leccionNivel0Suma4,
                                "leccionNivel1Suma4" to leccionNivel1Suma4,
                                "leccionNivel2Suma4" to leccionNivel2Suma4,
                                "leccionNivel3Suma4" to leccionNivel3Suma4,
                                "leccionNivel4Suma4" to leccionNivel4Suma4,
                                "leccionNivel5Suma4" to leccionNivel5Suma4,

                                //resta
                                "leccionNivel0Resta1" to leccionNivel0Resta1,
                                "leccionNivel1Resta1" to leccionNivel1Resta1,
                                "leccionNivel2Resta1" to leccionNivel2Resta1,
                                "leccionNivel3Resta1" to leccionNivel3Resta1,
                                "leccionNivel4Resta1" to leccionNivel4Resta1,
                                "leccionNivel5Resta1" to leccionNivel5Resta1,

                                "leccionNivel0Resta2" to leccionNivel0Resta2,
                                "leccionNivel1Resta2" to leccionNivel1Resta2,
                                "leccionNivel2Resta2" to leccionNivel2Resta2,
                                "leccionNivel3Resta2" to leccionNivel3Resta2,
                                "leccionNivel4Resta2" to leccionNivel4Resta2,
                                "leccionNivel5Resta2" to leccionNivel5Resta2,

                                "leccionNivel0Resta3" to leccionNivel0Resta3,
                                "leccionNivel1Resta3" to leccionNivel1Resta3,
                                "leccionNivel2Resta3" to leccionNivel2Resta3,
                                "leccionNivel3Resta3" to leccionNivel3Resta3,
                                "leccionNivel4Resta3" to leccionNivel4Resta3,
                                "leccionNivel5Resta3" to leccionNivel5Resta3,

                                "leccionNivel0Resta4" to leccionNivel0Resta4,
                                "leccionNivel1Resta4" to leccionNivel1Resta4,
                                "leccionNivel2Resta4" to leccionNivel2Resta4,
                                "leccionNivel3Resta4" to leccionNivel3Resta4,
                                "leccionNivel4Resta4" to leccionNivel4Resta4,
                                "leccionNivel5Resta4" to leccionNivel5Resta4,

                                //Multipliaccion
                                "leccionNivel0Multiplicacion1" to leccionNivel0Multiplicacion1,
                                "leccionNivel1Multiplicacion1" to leccionNivel1Multiplicacion1,
                                "leccionNivel2Multiplicacion1" to leccionNivel2Multiplicacion1,
                                "leccionNivel3Multiplicacion1" to leccionNivel3Multiplicacion1,
                                "leccionNivel4Multiplicacion1" to leccionNivel4Multiplicacion1,
                                "leccionNivel5Multiplicacion1" to leccionNivel5Multiplicacion1,

                                "leccionNivel0Multiplicacion2" to leccionNivel0Multiplicacion2,
                                "leccionNivel1Multiplicacion2" to leccionNivel1Multiplicacion2,
                                "leccionNivel2Multiplicacion2" to leccionNivel2Multiplicacion2,
                                "leccionNivel3Multiplicacion2" to leccionNivel3Multiplicacion2,
                                "leccionNivel4Multiplicacion2" to leccionNivel4Multiplicacion2,
                                "leccionNivel5Multiplicacion2" to leccionNivel5Multiplicacion2,

                                "leccionNivel0Multiplicacion3" to leccionNivel0Multiplicacion3,
                                "leccionNivel1Multiplicacion3" to leccionNivel1Multiplicacion3,
                                "leccionNivel2Multiplicacion3" to leccionNivel2Multiplicacion3,
                                "leccionNivel3Multiplicacion3" to leccionNivel3Multiplicacion3,
                                "leccionNivel4Multiplicacion3" to leccionNivel4Multiplicacion3,
                                "leccionNivel5Multiplicacion3" to leccionNivel5Multiplicacion3,

                                "leccionNivel0Multiplicacion4" to leccionNivel0Multiplicacion4,
                                "leccionNivel1Multiplicacion4" to leccionNivel1Multiplicacion4,
                                "leccionNivel2Multiplicacion4" to leccionNivel2Multiplicacion4,
                                "leccionNivel3Multiplicacion4" to leccionNivel3Multiplicacion4,
                                "leccionNivel4Multiplicacion4" to leccionNivel4Multiplicacion4,
                                "leccionNivel5Multiplicacion4" to leccionNivel5Multiplicacion4,

                                //Division
                                "leccionNivel0Division1" to leccionNivel0Division1,
                                "leccionNivel1Division1" to leccionNivel1Division1,
                                "leccionNivel2Division1" to leccionNivel2Division1,
                                "leccionNivel3Division1" to leccionNivel3Division1,
                                "leccionNivel4Division1" to leccionNivel4Division1,
                                "leccionNivel5Division1" to leccionNivel5Division1,

                                "leccionNivel0Division2" to leccionNivel0Division2,
                                "leccionNivel1Division2" to leccionNivel1Division2,
                                "leccionNivel2Division2" to leccionNivel2Division2,
                                "leccionNivel3Division2" to leccionNivel3Division2,
                                "leccionNivel4Division2" to leccionNivel4Division2,
                                "leccionNivel5Division2" to leccionNivel5Division2,

                                "leccionNivel0Division3" to leccionNivel0Division3,
                                "leccionNivel1Division3" to leccionNivel1Division3,
                                "leccionNivel2Division3" to leccionNivel2Division3,
                                "leccionNivel3Division3" to leccionNivel3Division3,
                                "leccionNivel4Division3" to leccionNivel4Division3,
                                "leccionNivel5Division3" to leccionNivel5Division3,

                                "leccionNivel0Division4" to leccionNivel0Division4,
                                "leccionNivel1Division4" to leccionNivel1Division4,
                                "leccionNivel2Division4" to leccionNivel2Division4,
                                "leccionNivel3Division4" to leccionNivel3Division4,
                                "leccionNivel4Division4" to leccionNivel4Division4,
                                "leccionNivel5Division4" to leccionNivel5Division4,













                                "leccionNivelResta1" to 0,
                                "leccionNivelResta2" to 0,
                                "leccionNivelResta3" to 0,
                                "leccionNivelResta4" to 0,
                                "leccionNivelMultiplicacion1" to 0,
                                "leccionNivelMultiplicacion2" to 0,
                                "leccionNivelMultiplicacion3" to 0,
                                "leccionNivelMultiplicacion4" to 0,
                                "leccionNivelDivision1" to 0,
                                "leccionNivelDivision2" to 0,
                                "leccionNivelDivision3" to 0,
                                "leccionNivelDivision4" to 0,
                                "numeroLogins" to 1))








                    }
                }
            }

            val b :Bundle = Bundle()
            b.putString("email", email)
            b.putString("provider", provider)















            finish()
            resultado.putExtras(b)
            startActivity(resultado)



        }










    }
}
