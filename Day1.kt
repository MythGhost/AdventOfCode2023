import java.io.File

fun main() {
    /**
     * Day 1
     */
    val input = File("C:\\Users\\Deshawn\\Documents\\AdventOfCode2023\\Day1Input.txt")

    val listExample = listOf("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet")
    var calibrationValues = mutableListOf<Int>()
    //input.readLines()

    for (line in input.readLines()) {

        val firstDigit = line.first { letter ->
            letter.isDigit()
        }

        val lastDigit = line.findLast { letter ->
            letter.isDigit()
        }

        var calibrationValue = firstDigit.plus(lastDigit.toString())

        calibrationValues.add(Integer.parseInt(calibrationValue))
    }

    val sum = calibrationValues.sum()
    println("Ergebnis: $sum")





}