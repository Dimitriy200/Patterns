package GoF.BehavioralPatterns.Strategy;

public class ConcreteStrategyA implements Strategy{
    @Override
    public int strategyMethod(int info) {
        System.out.println("Concrete Strategy A -> strategyMethod +100");
        return info + 100;
    }
}