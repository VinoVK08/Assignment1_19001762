//19001762
object Q3_totalCost extends App{
  val coverPrice = 24.95;
  val discount = 40.0/100.0;
  val noOfCopies = 60;
  def CoverCost(coverPrice:Double,discount:Double,noOfCopies:Int):Double=(coverPrice-coverPrice*discount)*noOfCopies;
  val c1 = 3;//shipping cost for  first 50 copies
  val c2 = 75.0/100.0;//shipping cost for each  copy in additional coppies
  def shippingCost(c1:Int,c2:Double,noOfCopies:Int):Double={
    if(noOfCopies<=50) {
      noOfCopies*c1;
    }
    else {
      c1 + (noOfCopies-50)*c2;
    }
    }

   val totalCost = CoverCost(coverPrice,discount,noOfCopies)+shippingCost(c1,c2,noOfCopies)
  println("The total cost is " + totalCost);

}
