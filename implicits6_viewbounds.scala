// ContextBounds, T can be treated/viewed as K

// If TypeClass mean, T can be used as if it has "these" properties.

// ViewBounds mean, T can be directly converted into K

def getIndex[T, CC](seq: CC, value: T)(implicit conv: CC => Seq[T]) = 
  seq.indexOf(value)

getIndex("abc", 'a')


def getIndexAlt[T, CC <% Seq[T]](seq: CC, value: T) = 
  seq.indexOf(value)

getIndex("abc", 'b')
