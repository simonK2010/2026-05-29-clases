package org.example.app
class Fecha (private val dia: Int, 
private val mes: String, 
private val anio: Int){
override fun toString(): String{
return "Fecha(dia=${dia}, mes=${mes}, anio=${anio})"
    }	
}
