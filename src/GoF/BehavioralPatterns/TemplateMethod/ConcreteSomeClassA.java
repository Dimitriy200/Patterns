package GoF.BehavioralPatterns.TemplateMethod;

public class ConcreteSomeClassA implements SomeClass{
    @Override
    public void someMethod(){
        System.out.println("Concrete SomeClass A -> someMethod");
    }
}