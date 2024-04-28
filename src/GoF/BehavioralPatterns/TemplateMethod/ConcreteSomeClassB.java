package GoF.BehavioralPatterns.TemplateMethod;

public class ConcreteSomeClassB implements SomeClass{
    @Override
    public void someMethod(){
        System.out.println("Concrete SomeClass B -> someMethod");
    }
}