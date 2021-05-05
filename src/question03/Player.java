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
public class Player {

    private String name;
    private int age;
    private double height;
    private String role;

    public Player(String name, int age, double height, String role) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "\n****************************"
                + "\n*******Player Details*******"
                + "\n****************************"
                + "\nname=" + name
                + "\nage=" + age
                + "\nrole=" + role
                + "\nheight=" + height;
    }

}
