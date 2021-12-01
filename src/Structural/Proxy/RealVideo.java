package Structural.Proxy;

public class RealVideo implements Video{

    String file;

    public RealVideo(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Загрузка " + file);
    }
    @Override
    public void display() {
        System.out.println("Просмотр " + file);
    }
}
