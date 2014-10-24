// "Third" type, Implicit classes
// "Method Extension" pattern

case class Box(x: Int)

implicit class doubleBox(box: Box) {
  def double = Box(box.x * y)
}

// - Actually
// class boxWithDouble(box: Box) {
//  def double = Box(box.x *2)
// }
// implicit def doubleBoxDef(box: Box) = new boxWithDoube(box)

val box = Box(100)

// "You're tryring to use Box as something that has a "double", ok ...
val double: Int = box.double



// - look at the conflict, compiler explains
// - ONLY looks at method name, not return type, not params