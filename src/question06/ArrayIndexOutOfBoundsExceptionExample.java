/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
         System.out.println("Question:6 By Venkat Sai Jarugula");
        int a[]={21,34,56,78,90};
         Scanner scan= new Scanner(System.in);
         try{
             System.out.println("Enter index value to view the element : ");
             int index=scan.nextInt();
             System.out.println("Output : ");
             System.out.println("The value at index "+index+" is :"+a[index]); 
         }
         catch(ArrayIndexOutOfBoundsException e){     
             System.out.println("Entered index is more than the index range.");
         }
    }
    
}
