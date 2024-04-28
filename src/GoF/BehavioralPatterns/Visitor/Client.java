package GoF.BehavioralPatterns.Visitor;

public class Client {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA(100);
        Element elementB = new ConcreteElementB(200);
        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();

        elementA.accept(visitorA);
        elementB.accept(visitorB);

        System.out.println("element A -> " + elementA.getInfo());
        System.out.println("element A -> " + elementB.getInfo());
    }
}