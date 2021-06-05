/**
 *
 * Creado por @autor: angel
 *       El  06 de jun. de 2021.
 *   Clase para función miembro que recibe urray y filtra solo los números impares
 **/

class Apartado3 {
    fun numerosPares(arrayNumeros:IntArray){
        println(arrayNumeros.filter {
            it % 2 != 0
        })
    }
}