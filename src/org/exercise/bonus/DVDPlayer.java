package org.exercise.bonus;

public class DVDPlayer implements Device{
    @Override
    public void play() {
        System.out.println("Sono un lettore DVD e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono un lettore DVD e sono in modalità stop");
    }
}
