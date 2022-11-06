package org.kotlin.play

var choice: Int = 0
var fistOperand: Int = 0
var secondOperand: Int = 0

fun main(args: Array<String>) {

    do {
        println(
            "Welcome to Devil calculus 😈" +
                    "\n1- Add" +
                    "\n2- Minus" +
                    "\n3- Divide" +
                    "\n4- Multiply" +
                    "\n0- Quit"
        )
        choice = readln().toInt()

        when (choice) {
            1 -> {
                initOperands()
                println(
                    "making addition..." +
                            "\nThe result is : ${add(fistOperand, secondOperand)}"
                )
            }

            2 -> {
                initOperands()
                println(
                    "making substraction..." +
                            "\nThe result is : ${minus(fistOperand, secondOperand)}"
                )
            }

            3 -> {
                initOperands()
                println(
                    "making division..." +
                            "\nThe result is : ${divide(fistOperand, secondOperand)}"
                )
            }

            4 -> {
                initOperands()
                println(
                    "making multiplication..." +
                            "\nThe result is : ${multiply(fistOperand, secondOperand)}"
                )
            }

            0 -> println("quitting...\nBye")
            else -> println("Unknown! Please try again.")
        }
    } while (choice != 0)
}

fun add(a: Int, b: Int): Int = a + b

fun minus(fistOperand: Int, secondOperand: Int): Int = fistOperand - secondOperand

fun divide(fistOperand: Int, secondOperand: Int): Int = fistOperand / secondOperand

fun multiply(fistOperand: Int, secondOperand: Int): Int = fistOperand * secondOperand

fun initOperands() {
    println("Enter the first operand")
    fistOperand = readln().toInt()
    println("Enter the second operand")
    secondOperand = readln().toInt()
}
