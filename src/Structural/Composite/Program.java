package Structural.Composite;

public class Program {
    public static void main(String[] args) {
        Suitcase cardiganOne = new Cardigan();
        Suitcase cardiganTwo = new Cardigan();
        Suitcase shoesOne = new Shoes();

        Suitcase trousersOne = new Trousers();
        Suitcase shoesTwo = new Shoes();

        Composite compositeOne = new Composite();
        compositeOne.addComponent(cardiganOne);
        compositeOne.addComponent(shoesOne);
        compositeOne.addComponent(cardiganTwo);

        Composite compositeTwo = new Composite();
        compositeTwo.addComponent(trousersOne);
        compositeTwo.addComponent(shoesTwo);

        Composite compositeThree = new Composite();
        compositeThree.addComponent(compositeOne);
        compositeThree.addComponent(compositeTwo);

        compositeThree.things();
    }
}
