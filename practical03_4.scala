object SumofIntegers {
  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number of integers: ")
    val integerNum = scala.io.StdIn.readInt()

    var inputIntegers: List[Int] = Nil // Initialize an empty list

    for (i <- 1 to integerNum) {
      println(s"Enter No. $i:")
      val input = scala.io.StdIn.readInt()
      inputIntegers = input :: inputIntegers // Add input to the list
    }

    val result = sumOfEvenNumbers(inputIntegers)
    println(s"Sum of even numbers: $result")
  }
}
