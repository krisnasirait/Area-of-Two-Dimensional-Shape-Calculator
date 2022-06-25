class Trapezium {
    //area of trapezium
    fun trapeziumProcessing(){
        val trapezium = Trapezium()

        print("Input base top\t\t: ")
        val baseTop = readLine()!!.toDouble()

        print("Input base bottom\t: ")
        val baseBottom = readLine()!!.toDouble()

        print("Input height\t: ")
        val height = readLine()!!.toDouble()

        println("Area of trapezium\t: " + trapezium.areaTrapezium(baseTop, baseBottom, height))
    }

    fun areaTrapezium(baseTop: Double, baseBottom: Double, height: Double): Double{
        return (baseTop + baseBottom) / 2 * height
    }
}