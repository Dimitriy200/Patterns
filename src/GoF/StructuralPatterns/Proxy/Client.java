package GoF.StructuralPatterns.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.doit();
    }
}