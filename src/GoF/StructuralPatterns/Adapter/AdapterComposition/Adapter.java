package GoF.StructuralPatterns.Adapter.AdapterComposition;


public class Adapter implements Target{
    
    Adaptee adaptee = new Adaptee();

    @Override
    public Object someMethod(){
        System.err.println("some method");

        return adaptee.getSOmePole();
    }
}