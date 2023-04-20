fun main() {
sumOfEvenNumbers(listOf(32,12,4,16,7))
    sortStringsAlphabetically(listOf("manual","alphabet","mandatory"))
    secondHighestNumber(listOf(21,5,33,65,9))
}
//Write a function that takes in a list of integers and returns the sum of all even numbers in the list.

fun sumOfEvenNumbers(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}

//Write a function that takes in a list of strings
//and returns a new list with all the strings sorted in alphabetical order.
fun sortStringsAlphabetically(strings: List<String>): List<String> {
    return strings.sorted()
}

//Write a function that takes in a list of integers and returns the second highest number in the list.
//kotlin
fun secondHighestNumber(numbers: List<Int>): Int? {
    if (numbers.size < 2) {
        return null
    }
    val sortedNumbers = numbers.sortedDescending()
    return sortedNumbers[1]
}


