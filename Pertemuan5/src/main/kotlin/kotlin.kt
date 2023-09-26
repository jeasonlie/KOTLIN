fun main(){
    var sum = 0
    for (i in 1 downTo 1 step 2){
        sum += i
    }
    println(sum)

    //label statements -> continue
    sum = 0
    for (row in 0 until 8){
        if (row %2 == 0){
            continue
        }
        for (column in 0 until 8){
            sum += row * column
        }
    }
    println(sum)

    sum = 0
    rowLoop@ for (row in 0 until 8){
        columLoop@ for (column in 0 until 8){
            if(row == column){
                continue@rowLoop
            }
            sum += row * column
        }
    }
    println(sum)

}