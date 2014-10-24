First look in current scope
  Implicits defined in current scope
  Explicit imports
  Wildcard imports  

Now look at associated types in
  Companion objects of a type
  Implicit scope of an argument’s type (2.9.1)
  Implicit scope of type arguments (2.8.0)
  Outer objects for nested types
  Other dimensions



!!! Conflict only happens if more than one candidate per stage
  => "low priority" implicits === default implicits



!!! Implicit resolution happens at compile time.



--- Implicits commonly live in "package object"

package geotrellis
package object vector {

  implicit def tupleOfIntToPoint(t: (Double, Double)): Point =
    Point(t._1,t._2)

  implicit def tupleOfDoubleToPoint(t: (Int, Int)): Point =
    Point(t._1,t._2)

  ...
}

--- import geotrellis.vector._
  brings in the implicits