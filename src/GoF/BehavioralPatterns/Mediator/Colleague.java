package GoF.BehavioralPatterns.Mediator;

public abstract class Colleague {
    Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public void send(String message){
        this.mediator.someMethod(message, this);
    }
    
    public abstract void someMethod(String message);
}