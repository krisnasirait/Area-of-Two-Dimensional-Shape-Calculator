class Triangle {
    //area of triangle
    fun triangleProcessing(){
        val triangle = Triangle()

        print("Input base\t: ")
        val base = readLine()!!.toDouble()

        print("Input height\t: ")
        val height = readLine()!!.toDouble()

        println("Area of triangle\t: " + triangle.areaTriangle(base, height))
    }

    fun areaTriangle(base: Double, height: Double): Double{
        return base * height / 2
    }
}