package com.homework.daniel;

import java.util.Scanner;

public class Factorial {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter number to calculates it's factorial :" );
        print();
    }
    static int factorial(int x){
        int sum = 1;
        for (int i = 1; i <= x; i++) {
            sum *= i;
        }
        return sum;
        }

    static void print(){
        System.out.println(factorial(SCANNER.nextInt()));
    }


}


