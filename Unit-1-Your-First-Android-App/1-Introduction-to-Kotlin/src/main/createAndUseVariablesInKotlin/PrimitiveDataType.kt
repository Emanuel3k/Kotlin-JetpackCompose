package main.createAndUseVariablesInKotlin

/* Tipo de dado de Kotlin

Qual dado pode conter

Exemplos de valores literais

String - Texto

"Add contact"
"Search"
"Sign in"

Int - Número inteiro

32
1293490
-59281

Double - Número decimal

2.0
501.0292
-31723.99999

Float - Número decimal, que é menos preciso que um Double e tem f ou F no fim do número.

5.0f
-1630.209f
1.2940278F

Boolean - true ou false. Use esse tipo de dado quando houver apenas dois valores possíveis. true e false são palavras-chave em Kotlin.

true
false */

fun main() {
    var inteiro: Int = 10
    var texto: String = "Hi"
    var decimal: Double = 150.70
    var boleano: Boolean = false

    println(inteiro)
    println(texto)
    println(decimal)
    println(boleano)
}