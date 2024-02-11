public abstract class BaseCoffee implements Coffee{
    private CoffeeSizes size;
    private boolean cold;
    private boolean milk;
    private int sugarAmount;

    public void addMilk(){
        setMilk(true);
    }
    public void addSugar(int sugarAmount){
        setSugarAmount(sugarAmount);
    }
    public String getSummary() {
        if (getSugarAmount() > 0 && isMilk())
            return getSize() + " " + getName() + " is prepared with milk and " + getSugarAmount() + " sugar.";
        else
        if (getSugarAmount() > 0 && !isMilk())
            return getSize() + " " + getName() + " is prepared without milk and " + getSugarAmount() + " sugar.";
        else
        if (getSugarAmount() == 0 && isMilk())
            return getSize() + " " + getName() + " is prepared with milk and without sugar.";
        else
            return getSize() + " " + getName() + " is prepared without milk and sugar.";
    }

    @Override
    public CoffeeSizes getSize() {
        return size;
    }

    public void setSize(CoffeeSizes size) {
        this.size = size;
    }

    @Override
    public boolean isCold() {
        return cold;
    }

    public void setCold(boolean cold) {
        this.cold = cold;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }
}
