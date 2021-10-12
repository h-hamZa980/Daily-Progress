package com.company;

public class Main {

    public static void main(String[] args) {

        // Static Polymorphism
    var object = new SimpleCalculator();
        System.out.println(object.add(2,5));
        System.out.println(object.add(1,2,3));
        // other exAMPLE

        var product= new MultiplyFun();
        System.out.println(product.Multiply(2,5));
        System.out.println(product.Multiply(3.3,5.8));

        // Dynamic Polymorphism
       ABC a = new XYZ();
       a.myMethod();

       // Example 2
        Parent human1 = new Child1();
        Parent human2 = new Child2();
        human1.printMessage();
        human2.printMessage();
        
    }
}
