package GoF.StructuralPatterns.Adapter.AdapterInheritance;


public class Adapter extends Adaptee implements Target{

    public Object someMethod() {
        System.err.println("some Method");

        return getSOmePole();
    }
}