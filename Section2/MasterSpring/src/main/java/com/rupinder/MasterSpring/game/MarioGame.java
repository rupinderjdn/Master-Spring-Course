package com.rupinder.MasterSpring.game;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("got into a hole");
    }
    public void left(){
        System.out.println("stop");
    }

    public void right(){
        System.out.println("Accelarate");
    }
}
