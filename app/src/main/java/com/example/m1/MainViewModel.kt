package com.example.m1

import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
 var sum:Int=3
    fun add(){
         sum++
    }

//    companion object {
//        fun add() {
//            sum= a+b
//        }
//    }

}