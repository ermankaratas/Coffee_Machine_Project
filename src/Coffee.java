public interface Coffee {
    String getName();
    boolean isCold();
    CoffeeSizes getSize();
    void addMilk();
    void addSugar(int amount);
    String getSummary();
}
