package com.ermankaratas.coffeemachine;

public class IcedCoffee extends BaseCoffee {
    public IcedCoffee() {
        setSize(CoffeeSizes.Undefined);
        setCold(true);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Iced Coffee";
    }
}
