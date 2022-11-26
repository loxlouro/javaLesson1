package com.company;

import com.sun.jndi.toolkit.ctx.StringHeadTail;

import java.util.Scanner;

public class calculation {
    Scanner numberInput = new Scanner(System.in);

    public double addition(){
        double a = theNumber();
        double b = theNumber();
        return a+b;
    }

    public double subtraction(){
        double a = theNumber();
        double b = theNumber();
        return a-b;
    }

    public double multiplication(){
        double a = theNumber();
        double b = theNumber();
        return a*b;
    }

    public double division(){
        double a = theNumber();
        double b = theNumber();
        return a/b;
    }

    private double theNumber(){
        System.out.println("Enter number: ");
        return numberInput.nextDouble();
    }
}
