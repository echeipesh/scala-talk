// Working with trait types


trait A
trait B
class SubA extends A
class SubB extends B


def doWork(a: A) = {println("Jobs Done ...")}

// normal inheritance, SubA can be viewed as A
doWork(new SubA())


class Something
// we can mix it in on the spot, cool
doWork(new Something with A)

// we can define constraints selectivly
def doMoreWork(item: Something with B) = ???