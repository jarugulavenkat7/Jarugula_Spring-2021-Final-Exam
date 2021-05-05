/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println("Question:10 By Venkat Sai Jarugula");
        Scanner scan = new Scanner(System.in);
        System.out.println("Input : ");
        System.out.print("Enter the value of n : ");
        int n = scan.nextInt();
        int result = sumOfNaturalNumbers(n);
        System.out.println("");
        System.out.println("Output : ");
        System.out.println("Sum of first "+n+" natural numbers : "+result);
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n > 0) {
            return n + sumOfNaturalNumbers(n - 1);
        } else {
            return 0;
        }
    }

}
