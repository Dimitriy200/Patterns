package GoF.StructuralPatterns.Flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        int i = 1;
        Flyweight flyweight = factory.getFlyweight(i);
        flyweight.printCharacter();
    }
}