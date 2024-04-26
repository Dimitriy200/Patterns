package GoF.BehavioralPatterns.Command;

public class Client_Old {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command commandA = new ConcreteCommandA(receiver);
        Command commandB = new ConcreteCommandB(receiver);

        Invoker invoker = new Invoker();
        invoker.register("Command A", commandA);
        invoker.register("Command B", commandB);

        invoker.execute("Command A");
        invoker.execute("Command B");
    }
}