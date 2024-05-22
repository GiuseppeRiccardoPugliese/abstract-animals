package org.exercise;

public class RegnoAnimale {
    public static void main(String[] args) {
        //Creo le istanze dei miei animali
        Animale cane = new Cane();
        Animale passerotto = new Passerotto();
        Animale delfino = new Delfino();
        Animale aquila = new Aquila();

        //Utilizzo i metodi per l'istanza cane
        cane.dormi();
        cane.verso();
        cane.mangia();

        //Utilizzo i metodi per l'istanza passerotto
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();

        //Utilizzo i metodi per l'istanza delfino
        delfino.dormi();
        delfino.verso();
        delfino.mangia();

        //Utilizzo i metodi per l'istanza aquila
        aquila.dormi();
        aquila.verso();
        aquila.mangia();
    }
}
