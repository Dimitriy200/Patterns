package GoF.BehavioralPatterns.State;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStateA concreteStateA = new ConcreteStateA();
        ConcreteStateB concreteStateB = new ConcreteStateB();

        concreteStateA.doAction(context);
        System.out.println(context.getState().toString());

        concreteStateB.doAction(context);
        System.out.println(context.getState().toString());
    }
}