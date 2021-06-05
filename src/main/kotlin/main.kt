import kotlin.random.Random

fun main(args: Array<String>) {

    /**
     * número de valores del array y Random entres valores solicitados
     */
    val valores = Apartado2(10){
        Random.nextInt(50,250)
    }
    Apartado3().numerosPares(valores.miArray)
}