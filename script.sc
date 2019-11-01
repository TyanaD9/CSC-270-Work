import scala.io.Source

:load utilities.sc

val myLines: Vector[String] = loadFile("text/The_Evolution_of_Fashion.txt")
println(myLines.size)
