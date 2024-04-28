package GoF.BehavioralPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        int a;
        int b;
        int info = 100;
        
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        a = context.strategyMethod(info);
        context.setStrategy(new ConcreteStrategyB());
        b = context.strategyMethod(info);
        
        System.out.println("a = " + a +
                            " b = " + b);
    }
}