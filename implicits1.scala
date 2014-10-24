// Only two* types of implicits 
//  * kinda three

// 1. implicit argument

def func(implicit x: Int) = x * 2



def func2(y: Int)(implicit x: Int) = {
  val z: Int = 4
  func(z)
}

implicit val theValue: Int = 5

func
func2(10)

// oh damn, we can only ask for things based on type
// but we can ask for more than one thing
def func3(y: Int)(implicit x: Int, z: Int) = y + x + z
func3(100)


