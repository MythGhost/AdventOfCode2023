import java.io.File

fun main() {
    /**
     * Day 1 part 2
     */
    val input = File("C:\\Users\\Deshawn\\Documents\\AdventOfCode2023\\Day1Input.txt")

    val listExample = listOf("two1nine", "eightwothree", "abcone2threexyz",
        "xtwone3four", "4nineeightseven2", "zoneight234", "7pqrstsixteen")

    val calibrationValues = mutableListOf<Int>()
    val numbers = mutableListOf("one", "two", "three", "four", "five", "six",
        "seven", "eight", "nine")

    var firstDigit = ""
    var lastDigit = ""


    var re2 = ""
    var re1 = ""

    //input.readLines()
    for (line in input.readLines()) {

        for (letter in line) {

            if(letter.isDigit()) {
                firstDigit = letter.toString()

            } else {
                re1 = re1.plus(letter)
                for (num in numbers) {
                    if (re1.contains(num)) {
                        //println(re)
                        re1 = num
                        when (num) {
                            "one" -> firstDigit = "1"
                            "two" -> firstDigit = "2"
                            "three" -> firstDigit = "3"
                            "four" -> firstDigit = "4"
                            "five" -> firstDigit = "5"
                            "six" -> firstDigit = "6"
                            "seven" -> firstDigit = "7"
                            "eight" -> firstDigit = "8"
                            "nine" -> firstDigit = "9"
                            else -> println("$re1 is no num")
                        }
                    }
                }
            }

            if (firstDigit != "") {
                re1 = ""
                println("First: $firstDigit")
                break
            }
        }


        //lastdigit
        for (i in line.length - 1 downTo 0) {

            if(line[i].isDigit()) {
                lastDigit = line[i].toString()

            } else {
                re2 = line[i].plus(re2)
                for (num in numbers) {
                    if (re2.contains(num)) {

                        re2 = num
                        when (num) {
                            "one" -> lastDigit = "1"
                            "two" -> lastDigit = "2"
                            "three" -> lastDigit = "3"
                            "four" -> lastDigit = "4"
                            "five" -> lastDigit = "5"
                            "six" -> lastDigit = "6"
                            "seven" -> lastDigit = "7"
                            "eight" -> lastDigit = "8"
                            "nine" -> lastDigit = "9"
                            else -> println("$re2 is no num")
                        }
                    }
                }
            }

            if (lastDigit != "") {
                re2 = ""
                println("Last: $lastDigit")
                break
            }
        }

        val calibrationValue = firstDigit.plus(lastDigit)
        firstDigit = ""
        lastDigit = ""
        println(calibrationValue)
        calibrationValues.add(Integer.parseInt(calibrationValue))
    }

    val sum = calibrationValues.sum()
    println("Ergebnis: $sum")
}