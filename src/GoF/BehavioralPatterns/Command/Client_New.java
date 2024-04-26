package GoF.BehavioralPatterns.Command;

public class Client_New {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command commandA = receiver :: some_method_1;
        Command commandB = receiver :: some_method_1;

        Invoker invoker = new Invoker();
        invoker.register("Command A", commandA);
        invoker.register("Command B", commandB);

        invoker.execute("Command A");
        invoker.execute("Command B");
    }
    
}
