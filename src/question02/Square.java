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
public class Square extends GeometricObject implements Colorable {

    private double lengthOfSide;

    public Square(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public double getArea() {
        return lengthOfSide * lengthOfSide;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Length Of Side=" + lengthOfSide + "  Area of a square=" + getArea();
    }

}
