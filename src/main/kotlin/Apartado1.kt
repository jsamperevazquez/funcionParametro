/**
 *
 * Creado por @autor: angel
 *       El  05 de jun. de 2021.
 *   Clase con open para poder extender con parámetro Int en constructor que es tamana del Array
 */

open class Apartado1(var tamano: Int) {

    /**
     * Objeto Singleton donde recibe tamano
     */
    companion object Singleton : Apartado1(11) {
        /**
         * contador para la tabla
         */
        var contador = 0

        /**
         *  variable tipo Array del tamaño pasado por el constructor y los elementos la tabla de multiplicar del 7
         */
        val miArray = Array(tamano) { it * 7 }.forEach {

            println(" 7x$contador=" + it)
            contador++
        }
    }
}