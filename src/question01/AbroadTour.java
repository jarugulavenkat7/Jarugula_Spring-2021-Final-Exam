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
public class AbroadTour extends Tour implements TourExpenseCalculator {

    private static final double tax = 18.0;
    private static final double discount = 0.10;
    private static final double extraLaguageCostPerKg = 200;
    private int numberOfLaguage;

    public AbroadTour(String placeBeingVisited, int numberOfTourists, int numberOfDays, double travelCostPerDay, double foodExpenseePerDay, double accomodationExpensePerDay, int numberOfLaguage) {
        super(placeBeingVisited, numberOfTourists, numberOfDays, travelCostPerDay, foodExpenseePerDay, accomodationExpensePerDay);
        this.numberOfLaguage = numberOfLaguage;
    }

    @Override
    public double foodExpenseCalculator() {
        double foodExpense = this.getFoodExpensePerDay() * this.getNumberOfTourists() * this.getNumberOfDays();
        if (this.getNumberOfTourists() > 4) {
            foodExpense = foodExpense - (foodExpense * discount);
        }
        return foodExpense;
    }

    @Override
    public double accomodationExpenseCalculator() {
        double accomodationExpense = this.getAccomodationExpensePerDay() * this.getNumberOfTourists() * this.getNumberOfDays();
        if (this.getNumberOfDays() > 10) {
            accomodationExpense = accomodationExpense - (accomodationExpense * discount);
        }
        return accomodationExpense;
    }

    @Override
    public double travelExpenseCalculator() {
        double travelExpense = this.getTravelCostPerDay() * this.getNumberOfTourists() * this.getNumberOfDays();
        if (this.getNumberOfTourists() > 4) {
            travelExpense = travelExpense - (travelExpense * discount);
        }
        return travelExpense;
    }

    @Override
    public double totalExpenseCalculator() {
        double totalExpense = this.travelExpenseCalculator() + this.accomodationExpenseCalculator() + this.foodExpenseCalculator();
        if (numberOfLaguage > 3) {
            totalExpense = (this.travelExpenseCalculator() + this.accomodationExpenseCalculator() + this.foodExpenseCalculator()) + (numberOfLaguage - 3) * extraLaguageCostPerKg;
        }
        return totalExpense;
    }

    @Override
    public String toString() {

        return "\n******************Expenses for " + this.getPlaceBeingVisited() + " Tour *********************"
                + super.toString()
                + "\nTotal food expense          : " + this.foodExpenseCalculator()
                + "\nTotal travel expense        : " + this.travelExpenseCalculator()
                + "\nTotal accomodation expense  : " + this.accomodationExpenseCalculator()
                + "\n*************************************************************"
                + "\nTotal Expense               : " + this.totalExpenseCalculator()
                + "\n*************************************************************";
    }

}
