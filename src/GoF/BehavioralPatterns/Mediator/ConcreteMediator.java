package GoF.BehavioralPatterns.Mediator;

public class ConcreteMediator extends Mediator{
    private ConcreteColleagueA concreteColleagueA;
    private ConcreteColleagueB concreteColleagueB;

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA){
        this.concreteColleagueA = concreteColleagueA;
    }
    
    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB){
        this.concreteColleagueB = concreteColleagueB;
    }

    @Override
    public void someMethod(String message, Colleague colleague){
        if (colleague.equals(this.concreteColleagueA)){
            concreteColleagueB.someMethod(message);
        }else{
            concreteColleagueA.someMethod(message);
        }
    }
}