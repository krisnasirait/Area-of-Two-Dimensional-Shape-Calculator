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


    fun pilProcessing(pilihan: Int){
        when(pilihan){
            1 -> Rectangle().rectangleProcessing()
            2 -> Circle().circleProcessing()
            3 -> Square().squareProcessing()
            4 -> Triangle().triangleProcessing()
            5 -> Trapezium().trapeziumProcessing()
        }
    }

}

fun main(){
    val twoDimensionalShape = TwoDimensionalShape()
    twoDimensionalShape.pilProcessing(twoDimensionalShape.mainMenu())
}