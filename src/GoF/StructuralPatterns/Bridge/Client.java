package GoF.StructuralPatterns.Bridge;

public class Client {
    public static void main(String args[]){
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementerA());
        abstraction.someFunv();
    }
}