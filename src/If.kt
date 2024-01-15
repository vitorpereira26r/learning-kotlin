fun main(){
    val n1 = 10;
    val n2 = 20;

    // true
    if(n1 > n2 && n1 != 0 || n2 < 30){
        println(true);
    }
    else {
        println(false);
    }

    // false
    if(n1 > n2 && (n1 != 0 || n2 < 30)){
        println(true);
    }
    else if(n2 < 80 && n1 != 0){
        println(false);
    }
    else {
        println("nothing")
    }

    val n3 = 1;
    val n4 = 2;

    val result = if (n3 >= n4) "$n3 - $n4 = ${(n3 - n4)}" else "$n3 + $n4 = ${(n3 + n4)}";

    println(result);
}