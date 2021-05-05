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
public class FootBallPlayer extends Player {

    private int numberOfMatchesPlayed;
    private int numberOfGoals;

    public FootBallPlayer(String name, int age, double height, String role, int numberOfMatchesPlayed, int numberOfGoals) {
        super(name, age, height, role);
        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfMatchesPlayed() {
        return numberOfMatchesPlayed;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nnumberOfMatchesPlayed=" + numberOfMatchesPlayed
                + "\nnumberOfGoals=" + numberOfGoals;
    }

}
