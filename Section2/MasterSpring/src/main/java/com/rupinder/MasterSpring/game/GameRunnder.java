package com.rupinder.MasterSpring.game;

public class GameRunnder {
    GamingConsole game;
    public GameRunnder(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
