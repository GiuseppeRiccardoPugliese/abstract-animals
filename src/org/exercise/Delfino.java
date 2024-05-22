package org.exercise;

public class Delfino extends  Animale implements INuotante{

    @Override
    public void verso() {
        System.out.println("Frigge");
    }

    @Override
    public void mangia() {
        System.out.println("Pesce");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
