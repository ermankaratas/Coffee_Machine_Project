package com.ermankaratas.coffeemachine;

public class IrishCoffee extends BaseCoffee {
    public IrishCoffee() {
        setSize(CoffeeSizes.Undefined);
        setCold(false);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Irish Coffee";
    }
}
