package OCP

object foodservice {
  def orderbooked(item:String, name:String, category:String): Unit ={
    println("Category= "+category);
    println("The order of "+item+" placed to "+name+" ");
  }

  def main(args: Array[String]): Unit = {
    val order = new Order(12,"pizza");
    val customer = new Customer(123,"Niket","Noida");
    val category = new category(13,"Burger","VEG")
    foodservice.orderbooked(order.item,customer.name,category.category);
  }

}
