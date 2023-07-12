package main.exercisesKotlinBasics

/* Este programa mostra o número total de pessoas em uma festa. Ele inclui adultos e crianças. A variável numberOfAdults contém o número de adultos na festa, e a variável numberOfKids contém o número de crianças.

fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

Etapa 1

    Você consegue determinar a saída desse programa antes de executar o código no Playground Kotlin? "The total party
     size is: 2030"

Depois de determinar a saída, execute o código no Playground Kotlin e verifique se ela corresponde à que foi mostrada.

Dica: o que acontece quando você usa o operador + em duas strings?
Etapa 2

O código funciona e mostra alguns resultados, mas não o número total de pessoas participando.

    Você consegue encontrar e corrigir o problema no código para que ele gere este resultado?

The total party size is: 50 */

fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}