class Circle {
    //area of circle
    fun circleProcessing(){
        val circle = Circle()

        print("Input radius\t: ")
        val radius = readLine()!!.toDouble()

        println("Area of circle\t: " + circle.areaCircle(radius))

    }

    fun areaCircle(radius: Double?): Double{

        val phi = 3.14

        return phi * radius!! * radius
    }
}