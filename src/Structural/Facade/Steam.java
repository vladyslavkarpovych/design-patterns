package Structural.Facade;

public class Steam {
    private boolean game = false;

    public boolean hasGame() {
        return game;
    }

    public void uploadGame() {
        game = true;
    }

    public void deleteGame() {
        game = false;
    }
}
