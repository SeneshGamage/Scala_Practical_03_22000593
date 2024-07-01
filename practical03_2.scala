object LongerStrings{
def filterLongStrings(strings: List[String]): List[String] = {
  strings.filter(_.length > 5)
}

def main(args: Array[String]): Unit = {
  print("Enter the number of strings: ")
  val stringNum = scala.io.StdIn.readInt()

  var inputStrings: List[String] = Nil // Initialize an empty list

  for (i <- 1 to stringNum) {
    println(s"Enter string No. $i:")
    val input = scala.io.StdIn.readLine()
    inputStrings = input :: inputStrings // Add input to the list
  }

  val filteredStrings = filterLongStrings(inputStrings)
  println("Filtered strings longer than 5 characters:")
  filteredStrings.foreach(println)
}

}