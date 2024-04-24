package GoF.StructuralPatterns.Facade;

public class ConcreteComponentB implements Component{
    @Override
    public void doit(){
        System.err.println("do it B");
    }
}