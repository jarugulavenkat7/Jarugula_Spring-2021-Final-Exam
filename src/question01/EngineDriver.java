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
public class EngineDriver {

    public static void main(String[] args) {
        System.out.println("Question:1 By Venkat Sai Jarugula");
        PetrolEngine petrolEngine = new PetrolEngine(200, 300, 400, 500, 600, 700, 200);
        System.out.println(petrolEngine);
        DieselEngine dieselEngine = new DieselEngine(200, 300, 400, 500, 600, 700);
        System.out.println(dieselEngine);

    }
}
