package academy.learnprogramming.challenge3

fun main(args: Array<String>) {

//    for(i in 5..5000 step 5){
//        println(i)
//    }
//
//    for(i in -500..0){
//        println(i)
//    }
//
//    var total:Int
//
//    var last = 1
//    var secondToLast = 0
//
//    println(secondToLast)
//    println(last)
//
//
//    for(i in 1..13){
//
//        total = last + secondToLast
//        println(total)
//        secondToLast = last
//        last = total
//
//    }

//    iloop@ for (i in 1..5){
//        println(i)
//        if (i == 2){
//            break
//        }
//        for (j in 11..20) {
//            println(j)
//            for (k in 100 downTo 90){
//                println(k)
//                if (k == 98) {
//                    continue@iloop
//                }
//            }
//        }
//
//    }

    val num = 100
    val dnum = when {
        num < 100 -> -200.2
        num > 100 -> 4444.44
        else -> 0.0
    }

    println(dnum)


}