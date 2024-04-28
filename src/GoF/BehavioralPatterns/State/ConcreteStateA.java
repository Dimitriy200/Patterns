package GoF.BehavioralPatterns.State;

public class ConcreteStateA implements State{

    @Override
    public void doAction(Context context) {
        System.err.println("Concrete State A -> doAction");
        context.setState(this);
    }

    public String doString(){
        return "Concrete State A -> doString";
    }
}