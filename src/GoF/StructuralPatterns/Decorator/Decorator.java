package GoF.StructuralPatterns.Decorator;

public abstract class Decorator implements Component{
    Component component;

    Decorator(Component component){
        this.component = component;
    }

    @Override
    public void doOperation(){
        this.component.doOperation();
    }

    public void newOperation(){
        System.err.println("new operation");
    }
}