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
public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Circle otherCircle) {
        return Double.compare(this.calculateArea(), otherCircle.calculateArea());

    }

}
