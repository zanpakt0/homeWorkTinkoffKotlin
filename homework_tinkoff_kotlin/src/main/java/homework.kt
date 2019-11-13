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
}