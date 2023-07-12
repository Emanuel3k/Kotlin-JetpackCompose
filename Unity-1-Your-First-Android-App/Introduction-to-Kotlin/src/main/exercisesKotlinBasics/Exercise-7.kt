package main.exercisesKotlinBasics

/* O Gmail tem um recurso que envia uma notificação ao usuário sempre que uma tentativa de login é feita em um novo dispositivo.

Neste exercício, você vai criar um programa que mostra uma mensagem aos usuários com este modelo:

There's a new sign-in request on operatingSystem for your Google Account emailId.

É necessário implementar uma função que aceite parâmetros operatingSystem e emailId, construa e retorne a mensagem no formato fornecido.

Por exemplo, se a função foi chamada com "Chrome OS" para o operatingSystem e "sample@gmail.com" para o emailId, ela vai retornar esta string:

There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.

Etapa 1

    É possível implementar a função displayAlertMessage() nesse programa para que ele mostre o resultado abaixo?

fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.

    Seu programa mostra este resultado?

There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.

Etapa 2

Muito bem! Você mostrou a mensagem. No entanto, em alguns casos, você vai perceber que não é possível determinar o sistema operacional do usuário. Nessas situações, é preciso especificar o nome do sistema operacional como Unknown OS. É possível otimizar ainda mais o código para que não seja necessário transmitir o argumento Unknown OS sempre que a função for chamada.

    Você consegue encontrar uma maneira de otimizar o código com essas informações para que ele gere a saída abaixo?

There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com.

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com.

    Para mostrar a mensagem acima, substitua a implementação da função main() por esta:

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
} */

/*------------------------------------------------------------------------------------------------------------*/

/* Etapa 1

fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.

fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}*/

/*------------------------------------------------------------------------------------------------------------*/

/* Etapa 2

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String? = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}*/
