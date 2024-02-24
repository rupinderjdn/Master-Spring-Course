package com.rupinder.MasterSpring;

import com.rupinder.MasterSpring.game.GameRunnder;
import com.rupinder.MasterSpring.game.MarioGame;
import com.rupinder.MasterSpring.game.SuperContra;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        SuperContra superContra = new SuperContra();
        GameRunnder gameRunnder = new GameRunnder(marioGame);
        gameRunnder.run();
        gameRunnder = new GameRunnder(superContra);
        gameRunnder.run();
    }
}
