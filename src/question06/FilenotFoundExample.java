/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class FilenotFoundExample {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Question:6 By Venkat Sai Jarugula");
        File file = new File("c://sample.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Please check if the input file is in mentioned path or not");
        }

    }

}
