/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class FruitDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

        System.out.println(fruit.getClass());
        System.out.println("Is fruit instanceof Fruit? " + (fruit instanceof Fruit));
        System.out.println("Is fruit instanceof Orange? " + (fruit instanceof Orange));
        System.out.println("Is fruit instanceof Apple? " + (fruit instanceof Apple));
        System.out.println("Is fruit instanceof GoldenDelicious? " + (fruit instanceof GoldenDelicious));
        System.out.println("Is fruit instanceof McIntosh? " + (fruit instanceof McIntosh));
        System.out.println("Is orange instanceof Orange? " + (orange instanceof Orange));
        System.out.println("Is orange instanceof Fruit? " + (orange instanceof Fruit));
        //System.out.println("Is orange instanceof Apple? "+(orange instanceof Apple));

        //fruit.makeAppleCider();
        // orange.makeAppleCider();
        orange.makeOrangeJuice();

        //fruit.makeOrangeJuice();
        //  Orange p1 = new Apple() ;
        //  McIntosh p2= new Apple() ;
        // Apple p3 = new McIntosh() ;
    }

}
