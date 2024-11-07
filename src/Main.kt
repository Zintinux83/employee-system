
fun main(args: Array<String>){
    val employees_List = arrayOf(
        Designer(),
        Manager(),
        Developer(),
        Developer(),
        Developer()
    )

    for (item in employees_List){
        item.work()
        item.details()
        item.calculateAnnualBonus()
        item.evaluatePerformance()

        if (item is Evaluable) {
            println("Evaluate ***********")
            item.evaluatePerformance()
        }
    }
}