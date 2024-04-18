package GoF.StructuralPatterns.Adapter.AdapterInheritance;


public class Adaptee {
    public Object getSOmePole(){
        System.err.println("getting Some Pole");
        
        return new Object();
    };
}