package GoF.StructuralPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Decorator decorator = new ConcreteDecoratorC(new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent())));

        decorator.doOperation();
        decorator.newOperation();
    }
}