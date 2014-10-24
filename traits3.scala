// We can inject some dependency
//  - when arguments aren't fancy enough

// --- Version One
trait Database {
  val connection = "url://production"
}

/** Service needs a database */
trait Service extends Database {

  def work: Unit = {
    println(s"Working with $connection")
  }
} 

val x = new Service {};
x.work









// --- Version Two

trait Service { self: Database => 
  // called self-type annotation
  // better name: construction requirements
  // "self" is abitrary name

  def work: Unit = {
    //val connection is referenced from Database trait
    println(s"Working with $connection")
  }
}






// --- Version Two 'a'
trait UserComponent {
  def getUsers: List[String] = List("me", "you", "everyone")
}

trait UserService { self: Database with UserComponent => 
  // self-types can be "lists"

  def work: Unit = {
    println(s"Working with $connection")
  }
}




