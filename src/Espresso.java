public class Espresso extends BaseCoffee {
    public Espresso() {
        setSize(CoffeeSizes.Undefined);
        setCold(false);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Espresso";
    }
}
