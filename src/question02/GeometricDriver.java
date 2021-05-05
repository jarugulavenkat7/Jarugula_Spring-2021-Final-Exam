/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class GeometricDriver {

    public static void main(String[] args) {
        System.out.println("Question:02 By Venkat Sai Jarugula");
        GeometricObject[] geometricArray = new GeometricObject[5];
        geometricArray[0] = new Square(2);
        geometricArray[1] = new Square(3);
        geometricArray[2] = new Square(4);
        geometricArray[3] = new Square(5);
        geometricArray[4] = new Square(6);
        for (GeometricObject obj : geometricArray) {
            if (obj instanceof Colorable) {
                System.out.println(obj);
                ((Colorable) obj).howToColor();
            }
        }
    }
}
