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
public class Vehicle {

    private double speed;
    private double fuelCapacity;

    public Vehicle(double speed, double fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public double getSpeed() {
        return speed;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "speed=" + speed + ", fuelCapacity=" + fuelCapacity + '}';
    }

}
