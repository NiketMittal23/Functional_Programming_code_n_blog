package LSP

class Veg extends Non_veg {

  override def item(): Unit = {
    val v = new Veg();
    println("YOU ORDERED VEG");
  }

}
