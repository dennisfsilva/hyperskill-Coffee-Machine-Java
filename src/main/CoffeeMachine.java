package src.main;

import java.util.Scanner;

public class CoffeeMachine {
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;
    private static final Scanner scanner = new Scanner(System.in);

    public static void startMachine() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String command = scanner.next();
            System.out.println();

            switch (command) {
                case "buy" -> {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                            "back - to main menu: ");
                    String type = scanner.next();
                    if (!type.equals("back")) {
                        BuyCoffee.buyCoffee(type, water, milk, beans, cups, money);
                    }
                }
                case "fill" -> FillMachine.fillMachine(water, milk, beans, cups);
                case "take" -> TakeMoney.takeMoney(money);
                case "remaining" -> PrintResources.printResources(water, milk, beans, cups, money);
                case "exit" -> {
                    return;
                }
                default -> System.out.println("Unknown command");
            }
            System.out.println();
        }
    }
}