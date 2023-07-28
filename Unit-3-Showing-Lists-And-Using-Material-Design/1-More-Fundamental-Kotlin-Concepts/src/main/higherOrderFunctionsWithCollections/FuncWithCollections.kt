package main.higherOrderFunctionsWithCollections

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

val fullMenu = cookies.map {
    "${it.name} - $${it.price}"
}

/*val softBakedMenu = cookies.filter {
    it.softBaked
}*/

val groupedMenu = cookies.groupBy { it.softBaked }
val softBakedMenu = groupedMenu[true] ?: listOf()
val crunchyMenu = groupedMenu[false] ?: listOf()

val totalPrice = cookies.fold(0.0) { total, cookie ->
    total + cookie.price
}

val alphabeticalMenu = cookies.sortedBy {
    it.name
}


fun main() {
    // forEach() usa um único parâmetro de ação, que é uma função do tipo (T) -> Unit.

    /*cookies.forEach {
        println("Menu item: ${it.name}")
    }*/

    // A função map() permite transformar uma coleção em uma nova com o mesmo número de elementos.

    /*println("Full Menu:")
    fullMenu.forEach {
        println(it)
    }*/

    // A função filter() permite criar um subconjunto de itens de uma coleção.

    /*println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }*/

    // A função groupBy() pode ser usada para transformar uma lista em um mapa.

    /*println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println()
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }*/

    // A função fold() é usada para gerar um valor único de uma coleção.

    /*println("Total price: $${totalPrice}")*/

    // sortedBy() permite especificar uma lambda que retorna a propriedade que você quer classificar.

    /*println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }*/

}

/*
Resumo:
    É possível repetir cada elemento de uma coleção usando forEach().
    As expressões podem ser inseridas em strings.
    map() é usada para formatar os itens de uma coleção, geralmente como um conjunto de outro tipo de dados.
    filter() pode gerar um subconjunto de uma coleção.
    groupBy() divide uma coleção de acordo com o valor de retorno da função.
    fold() transforma uma coleção em um valor único.
    sortedBy() é usada para classificar uma coleção de acordo com a propriedade especificada
*/