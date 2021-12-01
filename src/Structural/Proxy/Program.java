package Structural.Proxy;

public class Program {
    public static void main(String[] args) {

        Video videoReal = new RealVideo("C:/videos/collections.mp4");
        videoReal.display();

        System.out.println();

        Video videoProxy = new ProxyVideo("C:/videos/collections.mp4");
        videoProxy.display();
    }
}
