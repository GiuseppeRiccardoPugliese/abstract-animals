package org.exercise.bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tipo di dispositivo (Lettore DVD / PlayStation)");
        String deviceType = scanner.nextLine();
        
        Device device = Creator.create(deviceType);

        device.play(); //Metodo play()
        device.stop(); //Metodo stop()

        scanner.close();
    }
}
