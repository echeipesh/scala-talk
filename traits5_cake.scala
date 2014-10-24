// Each "Layer" represents some component that can be abstracted

// -- "abtracted" implies interface 
trait DatabaseComponent {
  def getDatabase: String
  def init()
}

// and multiple implemintations
trait ProductionDatabaseComponent extends DatabaseComponent {
  def getDatabase: String = "url://postgres/superimportant:5074"
}

trait TestingDatabaseComponent extends DatabaseComponent {
  def getDatabase: String = "url://derby/mockingaround"
}

// -- Layers can and will have a dependency on eachother
trait ReportingComponent{
  object reportinComponent {
    def makeReport: List[String]
  } 
}

trait AmericanReportingComponent extends ReportingComponent {
  def makeReport = List("USA", "USA", "USA")
}

// -- Baking the cake selects and binds the layers together

trait Application {self: DatabaseComponent with ReportingComponent =>

}

class ProductionApplication() extends 
  Application with 
  ProductionDatabaseComponent with 
  AmericanReportingComponent

class TestingApplication() extends 
  Application with 
  ProductionDatabaseComponent with 
  AmericanReportingComponent

// can also declare on the spot
val test = new Application with 
  TestingDatabaseComponent with 
  AmericanReportingComponent
