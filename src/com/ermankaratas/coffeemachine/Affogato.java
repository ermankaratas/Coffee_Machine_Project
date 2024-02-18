package com.ermankaratas.coffeemachine;

public class Affogato extends BaseCoffee {
    public Affogato() {
        setSize(CoffeeSizes.Undefined);
        setCold(false);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Affogato";
    }

}
