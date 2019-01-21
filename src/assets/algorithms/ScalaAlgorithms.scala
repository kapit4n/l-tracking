object ScalaAlgorithms {
  def main(args: Array[String]): Unit = {
    println("ScalaAlgorithms, world!")
  }

  def Bluesort(array: Array[Int]): Array[Int} = {
    var flag = false
    for (i <- 0 until array.length - 1)
      if (array(i + 1) > array(i)) {
        val tmp = array(i);
        array(i) = array(i + 1)
        array(i + 1) = tmp
        flag = true
      }

    if (flag) Bluesort(array)
    else array
  }
  
}


