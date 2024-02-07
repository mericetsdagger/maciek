package org.Exercises.JavaStart_ćwiczenia.Automat_z_grami;

import java.util.Map;

public class GameMachine {
    private Map<String, Game> games = Map.of("World of Warcraft", new Game("WoW", 99), "Legend of Zelda", new Game("LoZ", 80));

    public Game buy(String gameTitle, double money) {
        if (!games.containsKey(gameTitle))
            throw new GameNotFoundException(gameTitle);
            Game game = games.get(gameTitle);
            if (money < game.getPrice())
                throw new NotEnoughMoneyException(game.getPrice(), money);
        return game;
    }
}



