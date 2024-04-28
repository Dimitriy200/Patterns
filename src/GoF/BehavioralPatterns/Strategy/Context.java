package GoF.BehavioralPatterns.Strategy;

public class Context {
    private Strategy strategy;

    public Context(){}

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int strategyMethod(int info) {
        return strategy.strategyMethod(info);
    }
}