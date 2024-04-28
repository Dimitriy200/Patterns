package GoF.BehavioralPatterns.TemplateMethod;

public class Client {
    public static void main(String[] args) {
        SomeClass someClassA = new ConcreteSomeClassA();
        SomeClass someClassB = new ConcreteSomeClassB();

        someClassA.someMethod();
        someClassB.someMethod();
    }
}