package com.derekdileo;

import java.util.Scanner;

public class FibonacciCalculator {

    /**
     * Recursively computes and returns the value of the nth position of the Fibonacci sequence
     * @param n the position within the Fibonacci series to be computed
     * @return the value of the nth position of the Fibonacci series which has been computed
     * @author Derek DiLeo
     */
    public static int fibRecursive(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibRecursive(n - 1) + fibRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        // Welcome user and request the psotion to be computed
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci Calculator");
        System.out.print("\nPlease enter the position to be computed: ");
        int position = scanner.nextInt();

        // Compute the nth Fibonacci number
        int result = fibRecursive(position);

        // Print results using variables
        System.out.printf("\nThe %dth position of the Fibonacci sequence is %d", position, result);

    }
}
