package GoF.StructuralPatterns.Bridge;

public class ConcreteImplementerA implements Implementer {
    
    @Override
    public void operation(){
        System.err.println("operation A");
    }
}