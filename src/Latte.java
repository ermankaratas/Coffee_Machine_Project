public class Latte extends BaseCoffee {
    public Latte() {
        setSize(CoffeeSizes.Undefined);
        setCold(false);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Latte";
    }
}
