//19001762
import math.Pi
object Q2_sphere extends App{
  def volume(r:Double):Double=4.0/3.0*(math.Pi)*math.pow(r,3);// r is radius of sphere
  println("Volume of sphere is " + volume(5));
}
