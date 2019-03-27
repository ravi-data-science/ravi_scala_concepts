/**
  * Created by rkrovvidi on 3/24/19.
  */
object Vector_Concept extends App{

  val vec = scala.collection.immutable.Vector.empty

  val vec2 = vec :+ 1 :+ 2

  val vec3 = 100 +: vec2

  println(vec3(0))

  val vec4 = Vector (1,2,3,4)

println(vec4.toList)


  val vec_string = Vector ("india","china")

  val vec_string_1 = vec_string :+ "us"

  println(vec_string_1)

  val vec_string_2 = Vector ("asia","africa")

  vec_string_1 ++ vec_string_2


}


