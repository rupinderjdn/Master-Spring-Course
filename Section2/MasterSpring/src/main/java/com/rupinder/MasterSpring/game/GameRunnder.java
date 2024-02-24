package com.rupinder.MasterSpring.game;

public class GameRunnder {
    MarioGame game;
    public GameRunnder(MarioGame game) {
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
