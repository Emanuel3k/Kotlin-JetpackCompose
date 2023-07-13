package main.exercisesKotlinBasics

/* Este programa mostra o salário total que um funcionário recebe no mês. O salário total é dividido em duas partes: a variável baseSalary, que o funcionário recebe todos os meses, e a variável bonusAmount, que é um bônus adicional concedido ao funcionário.

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

    Você consegue descobrir a saída desse código antes de o executar no Playground Kotlin? 6000
    Quando você executa o código no Playground Kotlin, ele gera a saída esperada? Não, pois eram duas strings */

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}