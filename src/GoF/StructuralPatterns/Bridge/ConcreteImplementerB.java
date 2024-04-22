package GoF.StructuralPatterns.Bridge;

public class ConcreteImplementerB implements Implementer{
    
    @Override
    public void operation(){
        System.err.println("operation B");
    }
}