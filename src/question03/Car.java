/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Car extends Vehicle{
    int numberOfSeats = 4;

    public Car(double speed, double fuelCapacity) {
        super(speed, fuelCapacity);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return super.toString()+"\nnumberOfSeats=" + numberOfSeats ;
    }
    
    
}
