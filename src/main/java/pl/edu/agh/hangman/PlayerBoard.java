package pl.edu.agh.hangman;

import java.util.Scanner;

public class PlayerBoard {

    public String giveMeLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź literę: ");
        String letter = scanner.next();
        System.out.println("Wprowadzona litera: " + letter);
        return letter;
    }
}
