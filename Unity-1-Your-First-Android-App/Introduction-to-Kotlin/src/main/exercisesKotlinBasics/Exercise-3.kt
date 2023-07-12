package main.exercisesKotlinBasics

/* Este programa informa os usuários sobre a próxima promoção de um determinado item. Ele tem um modelo de string, que depende da variável discountPercentage para o desconto percentual e da variável item para o item à venda. No entanto, há erros de compilação no código.

fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

    Você consegue descobrir e corrigir a causa dos erros?
    Você consegue determinar a saída desse programa antes de executar o código no Playground Kotlin?

Dica: é possível atribuir novamente um valor a uma variável somente leitura?

Após a correção dos erros, o programa vai ser compilado sem erros e gerar esta saída:

Sale - Up to 20% discount on Google Chromecast! Hurry up! */

fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}