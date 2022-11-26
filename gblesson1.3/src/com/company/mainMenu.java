package com.company;

import java.util.Scanner;

public class mainMenu {
    Scanner menuPoint = new Scanner(System.in);

    public void mainMenu(){
        calculation calc = new calculation();
        System.out.println("Select operation: \n 1) + \n 2) - \n 3) * \n 4) /");
        int selection = menuPoint.nextInt();
        double result=0;
        switch (selection) {
            case (1): {
                result = calc.addition();
                break;
            }
            case (2): {
                result = calc.subtraction();
                break;
            }
            case (3): {
                result = calc.multiplication();
                break;
            }
            case (4): {
                result = calc.division();
                break;
            }
        }
        System.out.println("Result: "+ result);


    }
}
