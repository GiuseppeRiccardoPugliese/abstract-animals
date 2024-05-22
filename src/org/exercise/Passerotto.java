package org.exercise;

public class Passerotto extends Animale implements IVolante {
    @Override
    public void verso() {
        System.out.println("Chip");
    }

    @Override
    public void mangia() {
        System.out.println("Semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
