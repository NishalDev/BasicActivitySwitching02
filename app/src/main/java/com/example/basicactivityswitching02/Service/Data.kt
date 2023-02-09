package com.example.basicactivityswitching02.Service

import com.example.basicactivityswitching02.Model.First
import com.example.basicactivityswitching02.Model.Second

object Data {
    val first = listOf(
        First("Mite"),
        First("Mite"),
        First("Mite"),
        First("Mite")
    )
    val second = listOf(
        Second("CS"),
        Second("CS"),
        Second("CS"),
        Second("CS")
    )
    val third = listOf(
        Second("CS"),
        Second("CS"),
        Second("CS"),
        Second("CS")
    )

    fun getSecond(first: String?): List<Second>
    {
        return when(first) {
            "Mite" -> second
            else -> third
        }
    }

}