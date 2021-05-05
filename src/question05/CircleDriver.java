/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class CircleDriver {

    public static void main(String[] args) {
        System.out.println("Question:05 By Venkat Sai Jarugula");
        ComparableCircle circle1 = new ComparableCircle(6);
        ComparableCircle circle2 = new ComparableCircle(5);
        System.out.println("circle1 details :");
        System.out.println(circle1.toString());
        System.out.println("circle2 details :");
        System.out.println(circle2.toString());
        System.out.println("*****************************");
        if (circle1.compareTo(circle2) == 1) {
            System.out.println("Circle 1 has larger area");
        } else {
            System.out.println("Circle 2 has larger area");
        }
    }

}
