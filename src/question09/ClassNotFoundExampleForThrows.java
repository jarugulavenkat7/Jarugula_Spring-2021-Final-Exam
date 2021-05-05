/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class ClassNotFoundExampleForThrows {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Question:6 By Venkat Sai Jarugula");
        try {
            Class c = Class.forName("question000.ArithmeticExceptionExample");
        } catch (Exception e) {
            System.out.println("Unable to load the Class.Please verify whether the class is present or not");
        }
    }

}
