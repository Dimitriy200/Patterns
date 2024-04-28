package GoF.BehavioralPatterns.State;

public class ConcreteStateB implements State{
    @Override
    public void doAction(Context context) {
        System.err.println("Concrete State B -> doAction");
        context.setState(this);
    }

    public String doString(){
        return "Concrete State B -> doString";
    }
}