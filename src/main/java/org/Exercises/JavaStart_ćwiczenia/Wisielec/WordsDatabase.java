package org.Exercises.JavaStart_ćwiczenia.Wisielec;

import java.util.Random;

public class WordsDatabase {
    private Random random = new Random();

    private final String[] words = {"Orange", "Java", "Jedzenie"};


    public String getRandomWord() {
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}

