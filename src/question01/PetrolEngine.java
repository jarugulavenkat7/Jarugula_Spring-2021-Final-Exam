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
public class PetrolEngine extends Engine {

    private double carburetorCost;
    private double sparkPlugCost;

    public PetrolEngine(double engineBlockCost, double pistonCost, double crankShaftCost, double camShaftCost, double valveCost, double carburetorCost, double sparkPlugCost) {
        super(engineBlockCost, pistonCost, crankShaftCost, camShaftCost, valveCost);
        this.carburetorCost = carburetorCost;
        this.sparkPlugCost = sparkPlugCost;
    }

    public double getCarburetorCost() {
        return carburetorCost;
    }

    public double getSparkPlugCost() {
        return sparkPlugCost;
    }

    @Override
    public double calculateEngineCost() {
        return this.getEngineBlockCost() + this.getPistonCost() + this.getCrankShaftCost() + this.getCamShaftCost() + this.getValveCost() + carburetorCost + sparkPlugCost;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCarburetor Cost     : " + carburetorCost
                + "\nSparkPlug Cost      : " + sparkPlugCost
                + "\n______________________________________"
                + "\nTotal Cost          : " + this.calculateEngineCost()
                + "\n______________________________________";
    }

}
