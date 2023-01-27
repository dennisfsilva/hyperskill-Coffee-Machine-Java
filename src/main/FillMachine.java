package src.main;

import java.util.Scanner;

public class FillMachine {
    private static final Scanner scanner = new Scanner(System.in);

    public static void fillMachine(int water, int milk, int beans, int cups) {
        System.out.print("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.print("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        beans += scanner.nextInt();
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        cups += scanner.nextInt();
    }
}
