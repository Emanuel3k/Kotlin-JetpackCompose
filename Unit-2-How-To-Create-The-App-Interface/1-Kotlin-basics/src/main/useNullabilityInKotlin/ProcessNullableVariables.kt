package main.useNullabilityInKotlin

/* O Elvis ?: é um operador que pode ser usado com o operador de chamada segura ?.. Com o operador Elvis ?:, é possível adicionar um valor padrão quando o operador de chamada segura ?. retornar null. Ele é parecido com uma expressão if/else, mas é mais idiomático.

Se a variável não for null, a expressão antes do operador Elvis ?: vai ser executada. Se a variável for null, a
expressão depois do operador Elvis ?: vai ser executada. */

fun main() {
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}
