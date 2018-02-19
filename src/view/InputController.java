package view;

import java.util.Scanner;

public class InputController {

    public String getStringInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String  input = scanner.next();
        return input;
    }

    public int getIntInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int  input = scanner.nextInt();
        return input;
    }
}
