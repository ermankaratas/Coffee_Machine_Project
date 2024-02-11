public class Americano extends BaseCoffee {
    public Americano() {
        setSize(CoffeeSizes.Undefined);
        setCold(false);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Americano";
    }
}
