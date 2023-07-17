package main.exercisesKotlinBasics

/* Neste exercício, você vai criar um programa que executa operações matemáticas básicas e mostra a resposta.
Etapa 1

A função main() contém um erro de compilação:

fun main() {
    val firstNumber = 10
    val secondNumber = 5

    println("$firstNumber + $secondNumber = $result")
}

    Você pode corrigir o erro para que o programa mostre este resultado?

10 + 5 = 15

Etapa 2

O código funciona, mas a lógica para adicionar dois números está localizada na variável resultante, tornando o código menos flexível à reutilização. Em vez disso, é possível extrair a operação de adição para uma função add() para que o código seja reutilizável. Para fazer isso, atualize o código para que fique como o mostrado abaixo. O código agora introduz uma nova variável val chamada thirdNumber e mostra o resultado dessa nova variável com firstNumber.

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line

    Você pode definir a função add() para que o programa gere essa saída?

10 + 5 = 15
10 + 8 = 18

Etapa 3

Agora você tem uma função reutilizável para adicionar dois números.

    É possível implementar a função subtract() da mesma forma que a função add()? Modifique a função main() também
    para usar a função subtract() para verificar se ela funciona como esperado.

Dica: pense na diferença entre adição, subtração e outras operações matemáticas. Comece a trabalhar no código da solução a partir disso. */


/*------------------------------------------------------------------------------------------------------------*/

/* Etapa 1
fun main() {
    val firstNumber = 10
    val secondNumber = 5

     println("$firstNumber + $secondNumber = $result")
} */

/*------------------------------------------------------------------------------------------------------------*/

/*Etapa 2*/
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    var result = add(firstNumber, secondNumber)
    var anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    result = subtract(firstNumber, secondNumber)
    anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

// Define add() function below this line

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}