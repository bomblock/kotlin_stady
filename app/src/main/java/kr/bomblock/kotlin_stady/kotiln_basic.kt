package kr.bomblock.kotlin_stady

import java.lang.IllegalArgumentException


fun main() {
    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Maxspeed is ${myCar.maxSpeed}")

}

class Car(){
    // todo : 변수를 사용하면 항상 초기화를 해줘야 한다. 하지만 init 을 사용 하면 자동으로 초기화 예정을 의미한다.
    // todo 지금 init 을 하는 것이 아닌 함수가 나오면 init을 사용 하겠다는 말입니다.
    lateinit var owner : String

    val myBrand: String ="BMW"
        get() {
        return field.toLowerCase()
        }

    var maxSpeed: Int =250
        get() = field
        set(value){
            field = if(value > 0 ) value else throw IllegalArgumentException("Maxspeed cannot be less than 0")
        }

    init {
        this.owner = "Frank"
    }
}