package Structural.Proxy;

public class ProxyVideo implements Video {

    String file;
    RealVideo realVideo;

    public ProxyVideo(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (realVideo == null) {
            realVideo = new RealVideo(file);
        }
        realVideo.display();
    }
}
