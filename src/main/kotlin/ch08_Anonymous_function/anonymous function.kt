package ch08_Anonymous_function

fun main(args:Array<String>){
    /**
     *
     * 익명 함수?
     * 익명 함수란 말 그대로 이름이 없는 함수를 뜻한다.
     * 익명 함수를 통해 임시적으로 사용할 간단한 함수를 구성하여 쉽게 사용할 수 있다.
     *
     * 익명 함수의 형태는
     * fun (x:Int,y:Int) : Int = x+y와 같이 구성하며
     * 위에서 말한것과 같이 이름이 없다. 하지만 우리가 여기서 느껴지는 점중 하나인
     * lambda 식과 유사하지 않은가??
     *
     * lambda 식을 참고해보자.
     *
     * val add : (Int,Int -> Int) = {x , y -> x + y} 이다.
     *
     * 그럼 우리는 위 익명 함수와 람다가 매우 유사하다는 것을 알 수 있다.
     *
     * 두개의 차이는 뭘 까?
     *
     * 바로 흐름 제어이다. 람다는 따로 라벨 표기법을 사용하여 흐름을 제어 해야하지만
     * 익명 함수는 return , break, continue와 같이 흐름 제어문을 쉽게 사용할 수 있다.
     *
     *
     * */

    /**
     *
     * inline 함수?
     *
     * lnline 함수는 함수가 호출되는 곳에 내용을 모두 복사하는 것이다.
     * 즉, 함수를 분기 없이 처리 하고 성능이 증가한다.
     *
     * 좀 더 쉽게 말하자면 함수 하나가 호출 되면 호출 -> 함수 -> 리턴 이 과정이
     * 호출과 복사 실행 순으로 함수에서 다시 호출로 돌아오는 분기가 없어진다.
     *
     *
     * */



    add(3,{a -> println("a : $a")} )
    // inline의 성능을 위해 람다식 형태로 구성

    val sub = fun (x:Int , y:Int) : Int = x-y
    println(sub(2,1))
    //익명 함수를 사용하여 변수에 함수를 적용한 형태

}


inline fun add(a: Int, out: (Int)->Unit):Unit{
    out(a)
}

// inline 함수는 람다식 형태로 선언해야 올바른 성능을 낼 수 있다.

