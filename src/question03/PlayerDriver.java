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
public class PlayerDriver {

    public static void main(String[] args) {
        System.out.println("Question:3 By Venkat Sai Jarugula");
        Player player1 = new CricketPlayer("M.S.Dhoni", 39, 1.80, "WK-Batsman", 10773, 36);
        System.out.println(player1);
        Player player2 = new FootBallPlayer("Lionel Messi", 33, 1.70, "Forward", 705, 867);
        System.out.println(player2);
    }
}
