package GoF.StructuralPatterns.Adapter.AdapterComposition;


public class Adaptee {
    public Object getSOmePole(){
        System.err.println("getting Some Pole");
        
        return new Object();
    };
}