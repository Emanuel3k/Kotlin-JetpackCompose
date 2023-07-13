package main.exercisesKotlinBasics

/* Os smartphones modernos têm um recurso integrado que monitora o tempo de uso, ou seja, o tempo que você passa no smartphone por dia.

Neste exercício, você vai implementar uma função que compara o tempo em minutos gasto no smartphone no dia atual com o tempo gasto no dia anterior. A função aceita dois parâmetros inteiros e retorna um valor booleano.

O primeiro parâmetro contém o número de minutos que você gastou no dia atual e o segundo contém o número de minutos gastos no dia anterior. A função vai retornar um valor true se você tiver passado mais tempo no smartphone no dia atual em comparação com o dia anterior. Caso contrário, ela retorna um valor false.

Por exemplo, se você chamou a função com os argumentos nomeados abaixo:

    timeSpentToday = 300 e timeSpentYesterday = 250, a função retorna um valor true.
    timeSpentToday = 300 e timeSpentYesterday = 300, a função retorna um valor false.
    timeSpentToday = 200 e timeSpentYesterday = 220, a função retorna um valor false.

Dica: o operador de comparação > retorna true se o valor antes do operador for maior que o valor após o operador.
Caso contrário, ela retorna um valor false. */

fun main() {
    var timeSpentToday = 300
    var timeSpentYesterday = 250
    println(compare(timeSpentToday, timeSpentYesterday))

    timeSpentToday = 300
    timeSpentYesterday = 300
    println(compare(timeSpentToday, timeSpentYesterday))

    timeSpentToday = 200
    timeSpentYesterday = 220
    println(compare(timeSpentToday, timeSpentYesterday))


}

fun compare(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}