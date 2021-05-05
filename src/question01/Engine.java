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
public abstract class Engine {

    private double engineBlockCost;
    private double pistonCost;
    private double crankShaftCost;
    private double camShaftCost;
    private double valveCost;

    public Engine(double engineBlockCost, double pistonCost, double crankShaftCost, double camShaftCost, double valveCost) {
        this.engineBlockCost = engineBlockCost;
        this.pistonCost = pistonCost;
        this.crankShaftCost = crankShaftCost;
        this.camShaftCost = camShaftCost;
        this.valveCost = valveCost;
    }

    public double getEngineBlockCost() {
        return engineBlockCost;
    }

    public double getPistonCost() {
        return pistonCost;
    }

    public double getCrankShaftCost() {
        return crankShaftCost;
    }

    public double getCamShaftCost() {
        return camShaftCost;
    }

    public double getValveCost() {
        return valveCost;
    }

    public abstract double calculateEngineCost();

    @Override
    public String toString() {
        return "\nEngineBlock Cost    : " + engineBlockCost
                + "\nPistonCost          : " + pistonCost
                + "\nCrankShaft Cost     : " + crankShaftCost
                + "\nCamShaft Cost       : " + camShaftCost
                + "\nValve Cost          : " + valveCost;
    }

}
