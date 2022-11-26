package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	int n = 0;
	System.out.println("Enter n: ");
    n = myScanner.nextInt();
    int summ=0;
    int fact=1;
    for (int i=0; i<=n;i++){
        summ+=i;
    }
    for (int i=1; i<=n; i++){
        fact*=i;
    }
    System.out.println("Triagular number for "+ n + " = " + summ + "\n" + "Factorian for " + n + " = " + fact);
    }
}
