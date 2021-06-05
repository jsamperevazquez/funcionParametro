import kotlin.random.Random

fun main(args: Array<String>) {

    /**
     * número de valores del array y Random entres valores solicitados
     */
    val valores = Apartado2(10) {
        Random.nextInt(50, 250)
    }

    /**
     * Contador para mostrar números Array
     */
    var contador = 1
    valores.miArray.forEach {
        println("$contador---->$it")
        contador++
    }

    Apartado3().numerosPares(valores.miArray)
}