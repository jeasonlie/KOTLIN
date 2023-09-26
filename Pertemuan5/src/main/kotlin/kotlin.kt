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

    val rangesStep3 = 1.rangeTo(10) step 3
    rangesStep3.forEach {
        println("Angka $it")
    }
    rangesStep3.forEach {value->
        println("Angka $value")
    }

    //Ekspresi When

    //Contoh 1
    val number = 10
    when(number){
        0 -> println("Zero")
        else -> println("Non-Zero")
    }

    //Contoh 2
    when(number){
        10 -> println("It's a ten!")
    }

    //Contoh 3
    val string = "Dog"
    when(string){
        "Cat", "Dog" -> println("Animal is a house pet")
        else -> println("Animal is not a house pet")
    }

    //Contoh 4
    val numberName = when(number){
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> {
            println("Unknwon Number")
            "unknown"
        }
    }
    println(numberName)

    //Contoh lanjutan When
    val hourOfDay = 12
    val timeOfDay = when(hourOfDay){
        0,1,2,3,4,5 -> "Early Morning"
        6,7,8,9,10,11 -> "Morning"
        12,13,14,15,16 -> "Afternoon"
        17,18,19 -> "Evening"
        20,21,22,23 -> "Late evening"
        else -> "INVALID HOUR"
    }
    println(timeOfDay)
}