package src.main;

public class BuyCoffee {
    public static void buyCoffee(String type, int water, int milk, int beans, int cups, int money) {
        boolean enoughResources = EnoughResources.enoughResources(type, water, milk, beans, cups);

        switch (type) {
            case "1" -> { // espresso
                if (enoughResources) {
                    water -= 250;
                    beans -= 16;
                    cups -= 1;
                    money += 4;
                }
            }
            case "2" -> { // latte
                if (enoughResources) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups -= 1;
                    money += 7;
                }
            }
            case "3" -> { // cappuccino
                if (enoughResources) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                }
            }
            default -> System.out.println("Unknown coffee type");
        }
    }
}

