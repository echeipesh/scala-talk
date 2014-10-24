// TypeClass: 
//   retroactive extension / retroactive "inheritance"
//   also "Context Bounds"


def sort1[K](list: List[K]): List[K] = ???

// Man, I really want to sort anything, 
//   but I don't even know what ANYTHING means!

// What I really need is some way to "grab"(parameter)
//   "something"(object) that can tell me something about K


trait MyOrdering[K] {
  /** Returns an integer whose sign communicates how x compares to y */
  def compare(x: K, y: K): Int
}

def sort2[K](list: List[K], ord: MyOrdering[K]): List[K] = ???


// Awesome, now if only I could get it without user giving it to me,
//   maybe from like some context, or scope or something.


def sort3[K](list: List[K])(implicit ord: MyOrdering[K]): List[K] = ???


// "Cool ... now what if I didn't want to type all those parames?"
//   -- Said someone somewhere ...


//Context Bound syntax
def sort4[K : MyOrdering](list: List[K]): List[K] = ???
