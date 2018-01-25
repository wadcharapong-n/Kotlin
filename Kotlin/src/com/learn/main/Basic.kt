package com.learn.main

import java.util.*

val PI = 22/7f
//var listInt : IntArray = intArrayOf(10, 20, 30, 40, 50)
var listInt : IntArray = IntRange(10, 50).step(6).toList().toIntArray()

fun main(args: Array<String>) {
	println("hello world")
	printSum(1,2)
	cycleArea(10)
	Maximum(listInt)
	Minimum(listInt)
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun incrementX(x:Int) : Int {
	return x + 1 
}

fun cycleArea(r: Int) {
	var area = PI*r*r
	println("Area is $area")
}

fun Maximum(list: IntArray) {
	var max = list.get(0)
	for(data in list){
		if(data > max){
			max = data
		}
	}
	println("Maximum in list is  --> $max")
}

fun Minimum(list: IntArray) {
	var min = list.get(0)
	for(data in list){
		if(data < min){
			min = data
		}
	}
	println("Minimum in list is  --> $min")
}