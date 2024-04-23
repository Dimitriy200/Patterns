package GoF.StructuralPatterns.Decorator;

public class ConcreteDecoratorB extends Decorator{
    
    public ConcreteDecoratorB(Component component){
        super(component);
    }

    @Override
    public void doOperation(){
        System.err.println("do operation component B");
        super.doOperation();
    }

    @Override
    public void newOperation(){
        System.err.println("new operation component A");
    }
}