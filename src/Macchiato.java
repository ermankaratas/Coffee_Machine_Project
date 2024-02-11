public class Macchiato extends BaseCoffee {
    public Macchiato() {
        setSize(CoffeeSizes.Undefined);
        setCold(false);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Macchiato";
    }
}
