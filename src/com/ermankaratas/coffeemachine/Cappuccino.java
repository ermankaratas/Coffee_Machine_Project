package com.ermankaratas.coffeemachine;

public class Cappuccino extends BaseCoffee {
    public Cappuccino() {
        setSize(CoffeeSizes.Undefined);
        setCold(false);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Cappuccino";
    }
}
