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
public class CricketPlayer extends Player {

    private int numberOfRunsScored;
    private int numberOfWicketsTaken;

    public CricketPlayer(String name, int age, double height, String role, int numberOfRunsScored, int numberOfWicketsTaken) {
        super(name, age, height, role);
        this.numberOfRunsScored = numberOfRunsScored;
        this.numberOfWicketsTaken = numberOfWicketsTaken;
    }

    public int getNumberOfRunsScored() {
        return numberOfRunsScored;
    }

    public int getNumberOfWicketsTaken() {
        return numberOfWicketsTaken;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNumber Of Runs Scored=" + numberOfRunsScored
                + "\nNumber Of Wickets Taken=" + numberOfWicketsTaken;
    }

}
