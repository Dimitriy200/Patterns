package GoF.StructuralPatterns.Facade;

public class ConcreteComponentA implements Component{
    @Override
    public void doit(){
        System.err.println("do it A");
    }
}