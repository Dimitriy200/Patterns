package GoF.StructuralPatterns.Decorator;

public class ConcreteDecoratorA extends Decorator{
    
    public ConcreteDecoratorA(Component component){
        super(component);
    }

    @Override
    public void doOperation(){
        System.err.println("do operation component A");
        super.doOperation();
    }

    @Override
    public void newOperation(){
        System.err.println("new operation component A");
        super.newOperation();
    }
}