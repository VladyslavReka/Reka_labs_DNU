/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author vreka
 */
public class Lab03 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


        Factorial fact = new Factorial();
        System.out.printf("Enter number for calculations factorial: ");
        int f  = scanner.nextInt();
        int r1 = fact.recursionExecute(1, 1, f);
        System.out.println("Factorial recursive n: " + f);
        System.out.println("Factorial recursive execute: " + r1);

        int r2 = fact.cycleExecute(f);
        System.out.println("Factorial cycle n: " + f);
        System.out.println("Factorial cycle execute: " + r2);
        assert r1 == r2 : "different values";

        
        Fibonacci fib = new Fibonacci();
        System.out.printf("Enter number for calculations fibonacci: ");
        int n = scanner.nextInt();
        r1 = fib.recursionExecute(0, 1, 0, n);
        System.out.println("Fibonacci recursive n: " + n);
        System.out.println("Fibonacci recursive execute: " + r1);

        r2 = fib.cycleExecute(n);
        System.out.println("Fibonacci cycle n: " + n);
        System.out.println("Fibonacci cycle execute: " + r2);
        assert r1 == r2 : "different values";

        System.out.printf("Enter number for calculations sum digits: ");
        int number = scanner.nextInt();
        DigitsSum digitSum = new DigitsSum();
        r1 = digitSum.execute(number);
        System.out.println("Digits sum number: " + number);
        System.out.println("Digits sum recursive execute: " + r1);

        System.out.println("Enter two digits number for calculations sum of numbers without plus:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Sum sum = new Sum();
        r1 = sum.execute(x,y);
        System.out.println("Sum without arithmetic operations x: " + x + ", y: " + y);
        System.out.println("Sum without arithmetic operations execute: " + r1);

    }
}