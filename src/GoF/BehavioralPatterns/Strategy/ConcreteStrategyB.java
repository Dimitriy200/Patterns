package GoF.BehavioralPatterns.Strategy;

public class ConcreteStrategyB implements Strategy{
    @Override
    public int strategyMethod(int info) {
        System.out.println("Concrete Strategy B -> strategyMethod -100");
        return info - 100;
    }
}