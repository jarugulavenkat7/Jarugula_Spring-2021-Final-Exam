/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class MultipleExceptionsExample {

    public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
        System.out.println("Question:08 By Venkat Sai Jarugula");
        try {
            Scanner sc = new Scanner(new File("input1.txt"));
            String name = sc.nextLine();
            System.out.print("Length of name :");
            System.out.println(name.length());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

}
