package SRP

object foodservice {
  def orderbooked(item:String, name:String): Unit ={
    println("The order of "+item+" placed to "+name+" ");
  }

  def main(args: Array[String]): Unit = {
    val order = new Order(12,"pizza");
    val customer = new Customer(123,"Niket","Noida");
    foodservice.orderbooked(order.item,customer.name);
  }

}
