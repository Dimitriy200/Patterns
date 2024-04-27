package GoF.BehavioralPatterns.Mediator;

public class ConcreteColleagueB extends Colleague{
    public ConcreteColleagueB(Mediator mediator){
        super(mediator);
    }

    @Override
    public void someMethod(String message){
        System.out.println("Concrete Colleague B --> someMethodB");
    }
}