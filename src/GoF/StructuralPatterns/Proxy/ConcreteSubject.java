package GoF.StructuralPatterns.Proxy;

public class ConcreteSubject implements Subject{
    @Override
    public void doit(){
        System.out.println("do it");
    }
}