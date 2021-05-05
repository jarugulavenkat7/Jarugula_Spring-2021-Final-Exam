/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class ShoeDriver {

    public static void main(String[] args) {
        System.out.println("Question:11 By Venkat Sai Jarugula");
        Shoe shoe1 = new Shoe("Batawee", 9);
        Shoe shoe2 = new Shoe("Bata", 9);
        System.out.println("******* shoe1 compared with shoe2 using .equals *******");
        System.out.println(shoe1.equals(shoe2));
    }
}
