class TwoDimensionalShape {
   fun mainMenu(): Int{
       println("================================")
       println("TWO-DIMENSIONAL-SHAPE-CALCULATOR")
       println("================================")
       println("1. Rectangle \n2. Circle \n3. Square \n4. Triangle \n5. Trapezium")
       print("Pilihan : ")

       val pilihan = readLine()?.toInt() ?: 0

       return pilihan
   }

    //area of rectangle
    fun rectangleProcessing(){
        val rectangle = Rectangle()

        print("Input length\t: ")
        var length = readLine()!!.toDouble()
        print("Input width\t\t: ")
        var width = readLine()!!.toDouble()

        println("Area of rectangle\t: " + rectangle.areaRectangle(length, width))
    }

    //area of square
    fun squareProcessing(){
        val square = Square()

        print("Input side\t: ")
        var side = readLine()!!.toDouble()

        println("Area of square\t: " + square.areaSquare(side))
    }

    //area of circle
    fun circleProcessing(){
        val circle = Circle()

        print("Input radius\t: ")
        var radius = readLine()!!.toDouble()

        println("Area of circle\t: " + circle.areaCircle(radius))

    }

    //area of trapezium
    fun trapeziumProcessing(){
        val trapezium = Trapezium()

        print("Input base top\t\t: ")
        var baseTop = readLine()!!.toDouble()

        print("Input base bottom\t: ")
        var baseBottom = readLine()!!.toDouble()

        print("Input height\t: ")
        var height = readLine()!!.toDouble()

        println("Area of trapezium\t: " + trapezium.areaTrapezium(baseTop, baseBottom, height))
    }

    //area of triangle
    fun triangleProcessing(){
        val triangle = Triangle()

        print("Input base\t: ")
        var base = readLine()!!.toDouble()

        print("Input height\t: ")
        var height = readLine()!!.toDouble()

        println("Area of triangle\t: " + triangle.areaTriangle(base, height))
    }

    fun pilProcessing(pilihan: Int){
        when(pilihan){
            1 -> rectangleProcessing()
            2 -> circleProcessing()
            3 -> squareProcessing()
            4 -> triangleProcessing()
            5 -> trapeziumProcessing()
        }
    }

}

fun main(){
    val twoDimensionalShape = TwoDimensionalShape()
    twoDimensionalShape.pilProcessing(twoDimensionalShape.mainMenu())
}