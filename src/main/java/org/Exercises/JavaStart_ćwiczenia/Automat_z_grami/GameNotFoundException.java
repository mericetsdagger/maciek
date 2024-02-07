package org.Exercises.JavaStart_ćwiczenia.Automat_z_grami;

public class GameNotFoundException extends RuntimeException{
    public GameNotFoundException(String gameTitle) {
        super("Game not found" + gameTitle);
    }
}
