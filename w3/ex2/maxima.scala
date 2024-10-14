object LocalMaxima {
  def findLocalMaxima(arr: Array[Int]): List[Int] = {
    val size = arr.length

    if (size < 2) return List()

    var maxima = List[Int]()

    // Check first element
    if (arr(0) > arr(1)) maxima = maxima :+ arr(0)

    // Check middle elements
    for (i <- 1 until size - 1) {
      if (arr(i) > arr(i - 1) && arr(i) > arr(i + 1)) {
        maxima = maxima :+ arr(i)
      }
    }

    // Check last element
    if (arr(size - 1) > arr(size - 2)) maxima = maxima :+ arr(size - 1)

    maxima
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(2, 5, 7, 8, 4, 3, 5, 9, 4, 6, 8)
    println(findLocalMaxima(arr).mkString(", "))
  }
}
