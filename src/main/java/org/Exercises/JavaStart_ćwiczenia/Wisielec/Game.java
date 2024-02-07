package org.Exercises.JavaStart_ćwiczenia.Wisielec;

import java.util.Scanner;

public class Game {
    private static final int NEXT_GAME = 1;
    private static final int END_GAME = 2;

    private WordsDatabase data = new WordsDatabase();
    private Scanner scanner = new Scanner(System.in);

    public void mainLoop() {
        int option = NEXT_GAME;
        while (option != END_GAME) {
            play();
            showOptions();
            option = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("GoodBye!");
    }
    private void showOptions() {
        System.out.println(NEXT_GAME + "Graj dalej");
        System.out.println(END_GAME + "Koniec gry");
    }
    private void play() {
        Hangman hangman = new Hangman(data.getRandomWord());
        do {
            System.out.print("Hasło do zgadnięcia: ");
            String guessWordDisplay = hangman.getGuessWordDisplay();
            System.out.println(guessWordDisplay);
            System.out.println("Podaj literę: ");
            String letter = scanner.nextLine();
            char userGuess = letter.charAt(0);
            hangman.checkLetter(userGuess);
        } while(!hangman.userLost() && !hangman.userWon());
        System.out.println();
        if(hangman.userLost()) {
            System.out.println("Przegrałeś!");
        } else if (hangman.userWon()) {
            System.out.println("Wygrałeś!");

        }
        else System.out.printf("Hasło: %s\n\n", hangman.getGuessWord());
    }
}
