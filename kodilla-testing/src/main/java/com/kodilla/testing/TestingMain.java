package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        if(Calculator.add(5, 3) == 5 + 3){
            System.out.println("test add ok");
        }else{
            System.out.println("error add");
        }

        if(Calculator.subtract(5, 3) == 5 - 3){
            System.out.println("test subtract ok");
        }else{
            System.out.println("error subtract");
        }
    }
}
