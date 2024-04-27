package GoF.BehavioralPatterns.Mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(concreteMediator);

        concreteMediator.setConcreteColleagueA(concreteColleagueA);
        concreteMediator.setConcreteColleagueB(concreteColleagueB);

        concreteColleagueA.send("ConcreteColleagueA.send");
        concreteColleagueB.send("ConcreteColleagueA.send");
    }    
}