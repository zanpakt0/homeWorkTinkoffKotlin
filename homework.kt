import kotlin.emptyArray

class HomeWork {
    fun resolveTaskOne(number: String?): String {
        return if (number!!.toDoubleOrNull() != null) {
            "Вы ввели число: $number"
        } else {
            "Это не число"
        }
    }

    fun resolveTaskTwo(number: String?): String {
        return if ((number!!.length == 3) and (number.toIntOrNull() != null)) {
            number.reversed()
        } else {
            "Вы ввели не трехзначное число"
        }
    }

    fun resolveTaskThree(countMonth: String?): String {
        return when (countMonth!!.toIntOrNull()) {
            1, 2, 12 -> "Зима"
            3, 4, 5 -> "Весна"
            6, 7, 8 -> "Лето"
            9, 10, 11 -> "Осень"
            else -> "Вы ввели не номер месяца"
        }
    }

    fun resolveTaskFour(message: String?): String {
        val arrayOfData = message!!.split(" ")
        var negativeArray = emptyArray<String>()
        var positiveArray = emptyArray<String>()
        for (elementOfArray in arrayOfData) {
            when (elementOfArray.toDoubleOrNull()) {
                null -> return "Вы ввели не число"
                else -> {
                    if (elementOfArray.toDoubleOrNull()!! < 0) {
                        negativeArray += elementOfArray
                    } else {
                        positiveArray += elementOfArray
                    }
                }
            }
        }
        val resultArray = negativeArray + positiveArray
        return resultArray.joinToString(" ")
    }

    fun resolveTaskFive(number: String?): String {
        var convertedNumber = number!!.toInt()
        var div = 1000
        var arrayOfRanks = emptyArray<Int>()
        var rest: Int
        var resultString = ""
        for (i in 1..4) {
            rest = convertedNumber / div
            arrayOfRanks = arrayOfRanks.plus(rest)
            convertedNumber -= rest * div
            div /= 10
        }
        if(arrayOfRanks[0] == 1){
            resultString += "Одна тысяча "
        }
        when (arrayOfRanks[1]) {
            1 -> resultString += "сто "
            2 -> resultString += "двести "
            3 -> resultString += "триста "
            4 -> resultString += "четыреста "
            5 -> resultString += "пятьсот "
            6 -> resultString += "шестьсот "
            7 -> resultString += "семьсот "
            8 -> resultString += "восемьсот "
            9 -> resultString += "девятьсот "
        }
        if(arrayOfRanks[2] == 1){
            when(arrayOfRanks[3]){
                0 -> resultString += "десять "
                1 -> resultString += "одиннадцать "
                2 -> resultString += "двенадцать "
                3 -> resultString += "тринадцать "
                4 -> resultString += "четырнадцать "
                5 -> resultString += "пятнадцать  "
                6 -> resultString += "шестнадцать "
                7 -> resultString += "семнадцать "
                8 -> resultString += "восемнадцать "
                9 -> resultString += "девятнадцать "
            }
        }else{
            when(arrayOfRanks[2]){
                2 -> resultString += "двадцать "
                3 -> resultString += "тридцать "
                4 -> resultString += "сорок "
                5 -> resultString += "пятьдесят "
                6 -> resultString += "шестьдесят "
                7 -> resultString += "семьдесят "
                8 -> resultString += "восемьдесят "
                9 -> resultString += "девяносто "
            }
            when(arrayOfRanks[3]){
                1 -> resultString += "один "
                2 -> resultString += "два "
                3 -> resultString += "три "
                4 -> resultString += "четыре "
                5 -> resultString += "пять "
                6 -> resultString += "шесть "
                7 -> resultString += "семь "
                8 -> resultString += "восемь "
                9 -> resultString += "девять "
            }
        }
        return resultString
    }
}


fun main() {
    val myHomeWork = HomeWork()
    var message = readLine()
    println(myHomeWork.resolveTaskOne(message))
    message = readLine()
    println(myHomeWork.resolveTaskTwo(message))
    message = readLine()
    println(myHomeWork.resolveTaskThree(message))
    message = readLine()
    println(myHomeWork.resolveTaskFour(message))
    message = readLine()
    println(myHomeWork.resolveTaskFive(message))
}