// What is traits?

trait Box {
  // - traits are abstract
  // - can have def/val signatures only == Java Interface
  // - may have implemintations         == Mixin
}

class Control() {}

val control = new Control()
/** Control = Control@9e00bf3 */

val nope = new Box
/** trait Box is abstract; cannot be instantiated */

val anon = new {}  
/** AnyRef = $anon$1@5b177a64 */

val yes = new {} with Box 
/** Box = $anon$1@2b4235b3 */


// Actually we're getting an instance of anon class mixed in with a trait

trait UsefulBox {
  val x: Int
}

val yes2 = new UsefulBox {
  val x = 134
}
/** UsefulBox = $anon$1@3255c9e3  <------ */