import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******       WELCOME        *******");
        System.out.println("******* Our Coffee varieties *******");
        System.out.println(
                "        1. Americano\n" +
                        "        2. Espresso\n" +
                        "        3. Cappuccino\n" +
                        "        4. Latte\n" +
                        "        5. Mocha\n" +
                        "        6. Macchiato\n" +
                        "        7. Affogato\n" +
                        "        8. Iced Coffee (Cold Brew)\n" +
                        "        9. Frappuccino (Cold Coffee)\n" +
                        "        10. Irish Coffee\n");
        System.out.print("Please enter the menu number of your selected coffee= ");
        int choice = scanner.nextInt();
        prepareCoffee(choice);

    }
    private static void prepareCoffee(int choice){
        Scanner scanner = new Scanner(System.in);

        BaseCoffee coffee;

        switch (choice) {
            case 1:
                coffee = new Americano();
                break;
            case 2:
                coffee = new Espresso();
                break;
            case 3:
                coffee = new Cappuccino();
                break;
            case 4:
                coffee = new Latte();
                break;
            case 5:
                coffee = new Mocha();
                break;
            case 6:
                coffee = new Macchiato();
                break;
            case 7:
                coffee = new Affogato();
                break;
            case 8:
                coffee = new IcedCoffee();
                break;
            case 9:
                coffee = new Frappuccino();
                break;
            case 10:
                coffee = new IrishCoffee();
                break;
            default:
                System.out.println("Invalid selection. Please press a valid button!");
                return;
        }
        if (coffee.isCold())
            System.out.println("The best way to cool off on a hot summer day... Excellent decision!");
        System.out.println(
                            " SIZES\n" +
                            "1. Small\n" +
                            "2. Medium\n" +
                            "3. Large\n" +
                            "4. XLarge\n" );
        System.out.print("Please choose the size of your coffee = ");
        int sizeChoice = scanner.nextInt();
        CoffeeSizes size = CoffeeSizes.values()[sizeChoice];
        coffee.setSize(size);

        System.out.println(coffee.getSize() + " " + coffee.getName() + " is preparing...");

        System.out.println("Would you like to add milk to your coffe " + coffee.getName() +"? (YES/NO)");
        String milkChoice = scanner.next();
        if(milkChoice.equalsIgnoreCase("YES")){
            coffee.addMilk();
            System.out.println("Milk is adding to your " + coffee.getName());
        } else
            System.out.println("Your " + coffee.getName() + " is preparing without milk...");

        System.out.println("Would you like to add sugar to your coffe " + coffee.getName() +"? (YES/NO)");
        String sugarChoice = scanner.next();
        if(sugarChoice.equalsIgnoreCase("YES")){
            System.out.print("How many sugar do you want? Enter=");
            int sugarAmount = scanner.nextInt();
            coffee.addSugar(sugarAmount);
        } else
            System.out.println("Your " + coffee.getName() + " is preparing without sugar...");

        System.out.println(coffee.getSummary());
    }

}
