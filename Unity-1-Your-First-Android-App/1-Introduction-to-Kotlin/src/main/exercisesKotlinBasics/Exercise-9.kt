package main.exercisesKotlinBasics

/* Este programa mostra a previsão do tempo para diferentes cidades. Ele inclui o nome da cidade, as temperaturas máximas e mínimas do dia e a chance de chuva.

fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()

    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()

    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}

Existem muitas semelhanças com o código que mostra o clima de cada cidade. Por exemplo, há frases que são repetidas várias vezes, como "City:" (cidade) e "Low temperature:" (temperatura baixa). Códigos semelhantes e repetidos apresentam risco de erros no programa. Em uma das cidades, você pode ter um erro de digitação ou esquecer um dos detalhes meteorológicos.

    É possível criar uma função que mostra os detalhes do clima para uma cidade a fim de reduzir a repetição na função main() e fazer o mesmo com as cidades restantes?
    É possível atualizar a função main(), chamar a função que você criou para cada cidade e transmitir os detalhes
    adequados do clima como argumentos? */

fun main() {

    var city = "Ankara"
    var lowTemp = 27
    var highTemp = 31
    var chanceRain = 82
    println(weatherForecast(city, lowTemp, highTemp, chanceRain))

    city = "Tokyo"
    lowTemp = 32
    highTemp = 36
    chanceRain = 10
    println(weatherForecast(city, lowTemp, highTemp, chanceRain))

    city = "Cape Town"
    lowTemp = 59
    highTemp = 64
    chanceRain = 2
    println(weatherForecast(city, lowTemp, highTemp, chanceRain))

    city = "Guatemala City"
    lowTemp = 50
    highTemp = 55
    chanceRain = 7
    println(weatherForecast(city, lowTemp, highTemp, chanceRain))
}

fun weatherForecast(city: String, lowTemp: Int, highTemp: Int, chanceRain: Int): String {
    return "City: $city\n" +
            "Low temperature: $lowTemp\n" +
            "High temperature: $highTemp\n" +
            "Chance Of rain: $chanceRain%\n"
}