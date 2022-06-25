class Square {

    //area of square
    fun squareProcessing(){
        val square = Square()

        print("Input side\t: ")
        val side = readLine()!!.toDouble()

        println("Area of square\t: " + square.areaSquare(side))
    }

    fun areaSquare(side: Double?): Double{
        return side?.times(side) ?: 0.0
    }
}