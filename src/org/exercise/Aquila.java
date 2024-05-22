package org.exercise;

public class Aquila extends Animale implements IVolante {
    @Override
    public void verso() {
        System.out.println("Screech");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
