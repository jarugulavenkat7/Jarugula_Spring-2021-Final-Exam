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
public class DieselEngine extends Engine {

    private double fuelInjectorCost;

    public DieselEngine(double engineBlockCost, double pistonCost, double crankShaftCost, double camShaftCost, double valveCost, double fuelInjectorCost) {
        super(engineBlockCost, pistonCost, crankShaftCost, camShaftCost, valveCost);
        this.fuelInjectorCost = fuelInjectorCost;
    }

    public double getFuelInjectorCost() {
        return fuelInjectorCost;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nFuel Injector Cost  : " + fuelInjectorCost
                + "\n______________________________________"
                + "\nTotal Cost          : " + this.calculateEngineCost()
                + "\n______________________________________";
    }

    @Override
    public double calculateEngineCost() {
        return this.getEngineBlockCost() + this.getPistonCost() + this.getCrankShaftCost() + this.getCamShaftCost() + this.getValveCost() + fuelInjectorCost;
    }

}
