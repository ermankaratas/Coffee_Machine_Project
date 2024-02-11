public class Frappuccino extends BaseCoffee {
    public Frappuccino() {
        setSize(CoffeeSizes.Undefined);
        setCold(true);
        setSugarAmount(0);
        setMilk(false);
    }

    @Override
    public String getName() {
        return "Frappuccino";
    }
}
