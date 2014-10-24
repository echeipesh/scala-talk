// Mixing traits together and Diamons


// Lets make a diamond
trait D { 
  def stuff: String 
  println("Building D")
}

trait B  extends D {
  def stuff: String = "D rules"
  println("Building B")
}

trait C extends D {
  def stuff: String = "No C"
  println("Building C")
}

class A1 extends B with C {
  println("Building A")
}
class A2 extends C with B {
  println("Building A")
}

println("A1 extends B with C:")
val it = new A1
println("----------")

println("A2 extends C with B:")
val it2 = new A2


/** 
Let A be a class with parents:
  A_n with ... with A_1. 
  The class linearization of L(C) is de􏰅fined as follows:

L(A) = {A} +⃗ L(A1) +⃗ ... +⃗ L(An)

Here +⃗ denotes concatenation where elements of the right
operand _replace_ identical elements of the left operand:

ex: 
  new A1
  A1 extends ((B extends D) with (C extends D))

  A +⃗ (C +⃗ D) +⃗ (B +⃗ D)
  A +⃗ C +⃗ B +⃗ D
  That's our dependency "tree", so we init it backwards
*/

// Point:   yeah, it's linearised
// Bonus:   will warn you have ambigious members
// Problem: It's ordred (ex: member references as in DB component)