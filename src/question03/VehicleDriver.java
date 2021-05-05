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
public class VehicleDriver {

    public static void main(String[] args) {

        Car car1 = new Car(120, 20);
        Vehicle vehicle = car1;
        Car car2 = (Car) vehicle;
    }

}
