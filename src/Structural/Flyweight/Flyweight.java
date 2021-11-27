package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {

    private static final Map<String, Character> characters = new HashMap<>();


    public Character getCharacter(String type) {
        Character character = characters.get(type);

        if (character == null) {
            switch (type) {
                case "terrorist":
                    System.out.println("Terrorists attack... ");
                    character = new Terrorist();
                    break;
                case "counter-terrorist":
                    System.out.println("Counter-terrorist attack...");
                    character = new CounterTerrorist();
                    break;
            }
            characters.put(type, character);
        }
        return character;
    }
}
