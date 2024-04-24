package GoF.StructuralPatterns.Facade;

public class ConcreteFacade implements Facade{
    private ConcreteComponentA componentA;
    private ConcreteComponentB componentB;

    public ConcreteFacade(){
        this.componentA = new ConcreteComponentA();
        this.componentB = new ConcreteComponentB();
    }

    public void startDoit(){
        this.componentA.doit();
        this.componentB.doit();
    }
}