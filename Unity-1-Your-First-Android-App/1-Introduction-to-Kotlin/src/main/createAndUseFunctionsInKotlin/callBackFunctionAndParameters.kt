package main.createAndUseFunctionsInKotlin

/* Unit or Void */

fun birthdayGreetingUnit(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

/* String */

/* It is possible to specify a default argument to omit the argument when calling a function. */
fun birthdayGreetingString(name: String? = null, age: Int): String {
    val nameGreeting = "Happy Birthday, $name"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    println(birthdayGreetingString("Gelado", age = 20))
}