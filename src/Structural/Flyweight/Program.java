package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Flyweight flyweight = new Flyweight();

        List<Character> characterList = new ArrayList<>();
        characterList.add(flyweight.getCharacter("terrorist"));
        characterList.add(flyweight.getCharacter("terrorist"));
        characterList.add(flyweight.getCharacter("terrorist"));
        characterList.add(flyweight.getCharacter("terrorist"));
        characterList.add(flyweight.getCharacter("terrorist"));

        characterList.add(flyweight.getCharacter("counter-terrorist"));
        characterList.add(flyweight.getCharacter("counter-terrorist"));
        characterList.add(flyweight.getCharacter("counter-terrorist"));
        characterList.add(flyweight.getCharacter("counter-terrorist"));
        characterList.add(flyweight.getCharacter("counter-terrorist"));
        characterList.add(flyweight.getCharacter("counter-terrorist"));


        for(Character character : characterList) {
            character.shoot();
        }
    }
}
