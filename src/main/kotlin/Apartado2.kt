/**
 *
 * Creado por @autor: angel
 *       El  05 de jun. de 2021.
 *   Clase  para pasar tamano del array y una función que rellena el mismo
 */

open class Apartado2(var tamano: Int, rellenoArray: (Int) -> Int) {
    /**
     * orden de los números
     */
    var orden = 1

    /**
     * Array con tamano y función que rellena
     */
    var miArray = IntArray(
        tamano,
        rellenoArray
    ).forEach {
        println("$orden ---> $it")
        orden++
    }
}