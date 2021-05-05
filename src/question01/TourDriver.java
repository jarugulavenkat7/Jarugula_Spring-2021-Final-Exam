/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class TourDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Question:1 By Venkat Sai Jarugula");
        AbroadTour abroadTour = new AbroadTour("Singapore", 4, 7, 300, 150, 30, 2);
        System.out.println(abroadTour);
        LocalTour localTour = new LocalTour("New York", 2, 3, 200, 70, 50);
        System.out.println(localTour);
    }

}
