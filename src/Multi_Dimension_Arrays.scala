/**
  * Created by rkrovvidi on 4/3/19.
  */

import Array._

object Multi_Dimension_Arrays {
  def main(args: Array[String]) {
    var myMatrix = ofDim[Int](3,3)

    // build a matrix
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // Print two dimensional array
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }


    var threeDimMatrix = Array.ofDim[Int](3,3,3)

    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        for ( k <- 0 to 2) {
          threeDimMatrix(i)(j)(k) = k;
        }
      }

    }

    println(threeDimMatrix.toList.toString);

    println(threeDimMatrix.toList.toStream);


    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        for ( k <- 0 to 2) {
          print(" " + threeDimMatrix(i)(j)(k));
        }
      }
      println();
    }

  }
}