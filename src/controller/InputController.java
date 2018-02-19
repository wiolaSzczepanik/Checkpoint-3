package controller;

import java.util.Scanner;

public class InputController {

    public String getStringInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }
}