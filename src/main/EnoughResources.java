package src.main;

public class EnoughResources {
    public static boolean enoughResources(String type, int water, int milk, int beans, int cups) {
        boolean enoughResources = false;

        int waterLimit;
        int milkLimit;
        int beansLimit;

        switch (type) {
            case "1" -> { // espresso
                waterLimit = 250;
                milkLimit = 0;
                beansLimit = 16;
            }
            case "2" -> { // latte
                waterLimit = 350;
                milkLimit = 75;
                beansLimit = 20;
            }
            case "3" -> { // cappuccino
                waterLimit = 200;
                milkLimit = 100;
                beansLimit = 12;
            }
            default -> {
                return false;
            }
        }
        if (water < waterLimit) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < milkLimit) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < beansLimit) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            enoughResources = true;
            System.out.println("I have enough resources, making you a coffee!");
        }

        return enoughResources;
    }
}
