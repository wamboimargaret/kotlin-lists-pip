fun main() {

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

