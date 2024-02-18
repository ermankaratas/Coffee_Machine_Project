package com.ermankaratas.coffeemachine;

public class Mocha extends BaseCoffee {
    public Mocha() {
        setSize(CoffeeSizes.Undefined);
        setCold(false);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Mocha";
    }
}
