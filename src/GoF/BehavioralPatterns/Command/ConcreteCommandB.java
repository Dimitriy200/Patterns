package GoF.BehavioralPatterns.Command;

public class ConcreteCommandB implements Command{
    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.some_method_2();;
    }
}