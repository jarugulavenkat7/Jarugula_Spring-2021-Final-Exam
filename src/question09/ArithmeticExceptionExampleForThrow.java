/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class ArithmeticExceptionExampleForThrow {

    
    public static void main(String[] args) {
        System.out.println("Question:9 By Venkat Sai Jarugula");
        Scanner scan= new Scanner(System.in);
        System.out.println("Input : ");
        System.out.print("Enter value of a :");
        int a=scan.nextInt();
        System.out.print("Enter value of b :");
        int b=scan.nextInt();
        System.out.println("Ouput : ");
        try{
            if(b==0){
                throw  new ArithmeticException("Denominator cannot be zero.Please check the input");
            }
        int result=a/b;
        System.out.println("Result : "+result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}
