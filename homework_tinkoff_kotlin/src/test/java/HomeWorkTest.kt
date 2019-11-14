import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HomeWorkTest {
    private val myHomeWork = HomeWork()
    @Test
    fun tesResolveTaskOneWhenPositiveNumber() {
        assertEquals(myHomeWork.resolveTaskOne("123"), "Вы ввели число: 123", "Crash test when number is positive")
    }

    @Test
    fun testResolveTaskOneStartDigitEndAlpha() {
        assertEquals(myHomeWork.resolveTaskOne("1a"), "Это не число", "Crash test when message start digit end alpha")
    }

    @Test
    fun testResolveTaskOneStartAlphaEndDigit() {
        assertEquals(myHomeWork.resolveTaskOne("a1"), "Это не число", "Crash test when message start alpha end digit")
    }

    @Test
    fun testResolveTaskOneNotNumber() {
        assertEquals(myHomeWork.resolveTaskOne("aaa"), "Это не число", "Crash test when message is not number")
    }

    @Test
    fun testResolveTaskOneStartAlphaEndAlphaBetweenDigit() {
        assertEquals(myHomeWork.resolveTaskOne("a1a"), "Это не число", "Crash test when message start alpha end alpha and between digit")
    }

    @Test
    fun testResolveTaskOneStartDigitEndDigitBetweenAlpha() {
        assertEquals(myHomeWork.resolveTaskOne("1a1"), "Это не число", "Crash test when message start digit end digit and between alpha")
    }

    @Test
    fun testResolveTaskOneWhenPointerIsDot() {
        assertEquals(myHomeWork.resolveTaskOne("1.1"), "Вы ввели число: 1.1", "Crash test when digit with pointer dot")
    }

    @Test
    fun testResolveTaskOneWhenPointerIsComma() {
        assertEquals(myHomeWork.resolveTaskOne("1,1"), "Это не число", "Crash test when digit with pointer comma")
    }

    @Test
    fun testResolveTaskOneWithNegativeNumber() {
        assertEquals(myHomeWork.resolveTaskOne("-123"), "Вы ввели число: -123", "Crash test when number is negative")
    }

    @Test
    fun testResolveTaskOneZero() {
        assertEquals(myHomeWork.resolveTaskOne("0"), "Вы ввели число: 0", "Crash test when number is zero")
    }

    @Test
    fun testResolveTaskTwoWithThreeDigitNumber() {
        assertEquals(myHomeWork.resolveTaskTwo("123"), "321", "Crash test when number have 3 digit")
    }

    @Test
    fun testResolveTaskTwoWithTwoDigitNumber() {
        assertEquals(myHomeWork.resolveTaskTwo("12"), "Вы ввели не трехзначное число", "Crash test when number have 2 digit")
    }

    @Test
    fun testResolveTaskTwoWithFourDigitNumber() {
        assertEquals(myHomeWork.resolveTaskTwo("1234"), "Вы ввели не трехзначное число", "Crash test when number have 4 digit")
    }

    @Test
    fun testResolveTaskTwoWithOneHundred() {
        assertEquals(myHomeWork.resolveTaskTwo("100"), "001", "Crash test when number is 100")
    }

    @Test
    fun testResolveTaskTwoNotNumber() {
        assertEquals(myHomeWork.resolveTaskTwo("aaa"), "Вы ввели не трехзначное число", "Crash test when is not number")
    }

    @Test
    fun testResolveTaskTwoWhenMessageHaveThreeDigitNumberButHaveAlpha() {
        assertEquals(myHomeWork.resolveTaskTwo("a100a"), "Вы ввели не трехзначное число", "Crash test when message have alpha")
    }

    @Test
    fun testResolveTaskThreeWinter() {
        assertEquals(myHomeWork.resolveTaskThree("2"), "Зима", "Crash test when month is winter")
    }

    @Test
    fun testResolveTaskThreeSpring() {
        assertEquals(myHomeWork.resolveTaskThree("4"), "Весна", "Crash test when month is spring")
    }

    @Test
    fun testResolveTaskThreeSummer() {
        assertEquals(myHomeWork.resolveTaskThree("7"), "Лето", "Crash test when month is summer")
    }

    @Test
    fun testResolveTaskThreeThirteenth() {
        assertEquals(myHomeWork.resolveTaskThree("13"), "Вы ввели не номер месяца", "Crash test when month is 13")
    }

    @Test
    fun testResolveTaskThreeAutumn() {
        assertEquals(myHomeWork.resolveTaskThree("10"), "Осень", "Crash test when month is autumn")
    }

    @Test
    fun testResolveTaskThreeNotMonth() {
        assertEquals(myHomeWork.resolveTaskThree("10.1"), "Вы ввели не номер месяца", "Crash test when not month")
    }

    @Test
    fun testResolveTaskThreeAlphaMessage() {
        assertEquals(myHomeWork.resolveTaskThree("aaa"), "Вы ввели не номер месяца", "Crash test when alpha message")
    }

    @Test
    fun testResolveTaskThreeWhenMonthBetweenAlpha() {
        assertEquals(myHomeWork.resolveTaskThree("a1a"), "Вы ввели не номер месяца", "Crash test when month between alpha")
    }

    @Test
    fun testResolveTaskFourWhenStringHaveOnlyDigit() {
        assertEquals(myHomeWork.resolveTaskFour("1 1 -1"), "-1 1 1", "Crash test when message have only digit")
    }

    @Test
    fun testResolveTaskFourWhenStringHaveNotDigit() {
        assertEquals(myHomeWork.resolveTaskFour("a 1 a"), "Вы ввели не число", "Crash test when message have alpha")
    }

    @Test
    fun testResolveTaskFourWhenStringHaveOneDigit() {
        assertEquals(myHomeWork.resolveTaskFour("1"), "1", "Crash test when message have one digit")
    }

    @Test
    fun testResolveTaskFive1000() {
        assertEquals(myHomeWork.resolveTaskFive("1000"), "Одна тысяча ", "Crash test when message is 1000")
    }
    @Test
    fun testResolveTaskFive1() {
        assertEquals(myHomeWork.resolveTaskFive("1"), "один ", "Crash test when message is 1")
    }

    @Test
    fun testResolveTaskFive200() {
        assertEquals(myHomeWork.resolveTaskFive("200"), "двести ", "Crash test when message is 200")
    }
    @Test
    fun testResolveTaskFive30() {
        assertEquals(myHomeWork.resolveTaskFive("30"), "тридцать ", "Crash test when message is 30")
    }

    @Test
    fun testResolveTaskFive14() {
        assertEquals(myHomeWork.resolveTaskFive("14"), "четырнадцать ", "Crash test when message is 14")
    }

    @Test
    fun testResolveTaskFive567() {
        assertEquals(myHomeWork.resolveTaskFive("567"), "пятьсот шестьдесят семь ", "Crash test when message is 567")
    }

    @Test
    fun testResolveTaskFive819() {
        assertEquals(myHomeWork.resolveTaskFive("819"), "восемьсот девятнадцать ", "Crash test when message is 819")
    }
}