package GoF.StructuralPatterns.Decorator;

public class ConcreteDecoratorC extends Decorator{

    public ConcreteDecoratorC(Component component){
        super(component);
    }

    @Override
    public void doOperation(){
        System.err.println("do operation component C");
        super.doOperation();
    }

    @Override
    public void newOperation(){
        System.err.println("new operation component C");
        super.newOperation();
    }
}