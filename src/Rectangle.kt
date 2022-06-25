class Rectangle {
    //area of rectangle
    fun rectangleProcessing(){
        val rectangle = Rectangle()

        print("Input length\t: ")
        val length = readLine()!!.toInt()
        print("Input width\t\t: ")
        val width = readLine()!!.toInt()

        println("Area of rectangle\t: " + rectangle.areaRectangle(length, width))
    }

    fun areaRectangle(length: Int?, width: Int?): Int{
        return width?.let { length?.times(it) } ?: 0
    }
}