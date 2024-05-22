package org.exercise;

import java.util.jar.Manifest;

public class RegnoAnimale {
    public static void main(String[] args) {
        //Creo le istanze dei miei animali
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Delfino delfino = new Delfino();
        Aquila aquila = new Aquila();

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

        System.out.println("*************************************\n Step 2: ");

        //Chiamata dei metodi volare/nuotare
        faiNuotare(delfino);
        faiVolare(passerotto);
        faiVolare(aquila);
    }
    //Metodo per far volare un animale che puo' volare
    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    // Metodo per far nuotare un animale che può nuotare
    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }
}
