/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Question:08 By Venkat Sai Jarugula");
        Scanner scan = new Scanner(System.in);
        System.out.println("Input : ");
        System.out.print("Enter the age of alcohol buyer : ");
        int buyerAge = scan.nextInt();
        System.out.println("");

        if (buyerAge < 18) {
            System.out.println("Output : ");
            try {
                throw new NotEligibletoBuyAlcoholException("Not eligible to buy Alcohol");
            } catch (NotEligibletoBuyAlcoholException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Output : ");
            System.out.println("Eligible to buy Alcohol");
        }
    }

}
