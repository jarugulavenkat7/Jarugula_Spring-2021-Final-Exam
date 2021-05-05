/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class ArrayDriver {

    public static void main(String[] args) {
        System.out.println("Question:07 By Venkat Sai Jarugula");
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        System.out.print("Enter index : ");
        int inputIndex = scanner.nextInt();
        System.out.println("");
        if (inputIndex < array.length) {
            System.out.println("Output : ");
            System.out.println("Random integer at index " + inputIndex + " is : " + array[inputIndex]);
        } else {
            System.out.println("Output : ");
            System.out.println("Out of Bounds");
        }
    }

}
