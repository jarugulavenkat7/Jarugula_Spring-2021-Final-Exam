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
public class Tour {

    private String placeBeingVisited;
    private int numberOfTourists;
    private int numberOfDays;
    private double travelCostPerDay;
    private double foodExpensePerDay;
    private double accomodationExpensePerDay;

    public Tour(String placeBeingVisited, int numberOfTourists, int numberOfDays, double travelCostPerDay, double foodExpenseePerDay, double accomodationExpensePerDay) {
        this.placeBeingVisited = placeBeingVisited;
        this.numberOfTourists = numberOfTourists;
        this.numberOfDays = numberOfDays;
        this.travelCostPerDay = travelCostPerDay;
        this.foodExpensePerDay = foodExpenseePerDay;
        this.accomodationExpensePerDay = accomodationExpensePerDay;
    }

    public String getPlaceBeingVisited() {
        return placeBeingVisited;
    }

    public int getNumberOfTourists() {
        return numberOfTourists;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getTravelCostPerDay() {
        return travelCostPerDay;
    }

    public double getFoodExpensePerDay() {
        return foodExpensePerDay;
    }

    public double getAccomodationExpensePerDay() {
        return accomodationExpensePerDay;
    }

    @Override
    public String toString() {
        return "\nPlace being visited          :" + placeBeingVisited
                + "\nNumber of Tourists           :" + numberOfTourists
                + "\nNumber of Days               :" + numberOfDays
                + "\nTravel Cost Per Day          :" + travelCostPerDay
                + "\nFood Expense Per Day         :" + foodExpensePerDay
                + "\nAccomodation Expense Per Day :" + accomodationExpensePerDay;
    }

}
