package com.rupinder.MasterSpring;

import com.rupinder.MasterSpring.game.GameRunnder;
import com.rupinder.MasterSpring.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        GameRunnder gameRunnder = new GameRunnder(marioGame);
        gameRunnder.run();
    }
}
