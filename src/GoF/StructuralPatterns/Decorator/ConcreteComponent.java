package GoF.StructuralPatterns.Decorator;

public class ConcreteComponent implements Component{
    
    @Override
    public void doOperation(){
        System.err.println("do Operation");
    }
}