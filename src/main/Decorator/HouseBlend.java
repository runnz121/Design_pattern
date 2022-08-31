package main.Decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "블렌드커피";
    }

    public double cost() {
        return 2.99;
    }
}
