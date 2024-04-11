package com.example.calculator

sealed class CalculatorActions{
    data class Number(val number: Int) : CalculatorActions()
    object Decimal : CalculatorActions()
    object Clear : CalculatorActions()
    object Delete : CalculatorActions()
    object Calculate : CalculatorActions()
    data class Operation(val operation : CalculatorOperation) : CalculatorActions()
}
