package org.exercise.bonus;

public class Creator {

    public static Device create(String type) throws IllegalArgumentException{
        if (type.equalsIgnoreCase("lettore dvd")) {
            return new DVDPlayer();
        } else if (type.equalsIgnoreCase("playstation")) {
            return new PlayStation();
        }else {
            throw new IllegalArgumentException("Tipo di dispositivo non valido");
        }
    }

}
