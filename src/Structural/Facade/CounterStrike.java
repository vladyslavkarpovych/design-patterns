package Structural.Facade;

public class CounterStrike {

    void openGame(Steam steam) {
        if(steam.hasGame()) {
            System.out.println("Происходит запуск игры.");
        } else {
            System.out.println("Игра не найдена.");
        }
    }
}
