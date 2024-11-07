interface Evaluable{
    fun evaluatePerformance(){
        println("Anyone was evaluated")
    }
}
abstract class Employee: Evaluable{ //
    abstract val name: String
    abstract val salary: Double

    abstract fun work()
    abstract fun calculateAnnualBonus()

    open fun details(){
        println("Details about the Employees")
    }
}

class Manager: Employee( ){
    override val name = "managerName"
    override val salary = 2500.0

    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus() {
        var annualBonus = (salary * 1.2)
        println("The annual bonus is "+annualBonus)
    }

    override fun details(){
        println("The name of this Employee is $name and these salary is $salary")
    }
}

class Developer: Employee(){
    override val name = "developerName"
    override val salary = 2000.0

    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus() {
        var annualBonus = (salary * 1.1)
        println("The annual bonus is "+annualBonus)
    }

    override fun evaluatePerformance(){
        println("Developer was evaluated")
    }

    override fun details(){
        println("The name of this Employee is $name and these salary is $salary")
    }
}

class Designer: Employee(){
    override val name = "designerName"
    override val salary = 2250.0

    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus() {
        var annualBonus = (salary * 1.15)
        println("The annual bonus is "+annualBonus)
    }

    override fun evaluatePerformance(){
        println("Designer was evaluated")
    }

    override fun details(){
        println("The name of this Employee is $name and these salary is $salary")
    }
}

