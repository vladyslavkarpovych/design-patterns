package Structural.Facade;

public class Facade {
    Power power = new Power();
    Steam steam = new Steam();
    CounterStrike counterStrike = new CounterStrike();

    void open() {
        power.on();
        steam.uploadGame();
        counterStrike.openGame(steam);
    }
}
