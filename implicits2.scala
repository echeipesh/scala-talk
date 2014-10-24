// 2. Implicit conversion

// We only care about the types FromType -> ToType
implicit def intToString(x: Int): String = s"The number: $x"

// Once again, only one can be found
//implicit def intToAnotherString(x: Int): String = s"Some: $x"

def report(msg: String) = println(s"I found: $msg")


// "I'm given Int, but need String, can I find conversion?"
report(5)

