package GoF.BehavioralPatterns.Mediator;

public class ConcreteColleagueA extends Colleague{
    
    public ConcreteColleagueA(Mediator mediator){
        super(mediator);
    }

    @Override
    public void someMethod(String message){
        System.out.println("Concrete Colleague A --> someMethodB");
    }
}