package GoF.StructuralPatterns.Adapter.AdapterInheritance;


public class Client {
    public static void main(String args[]){
        Target target = new Adapter();

        Object ob = target.someMethod();
    }
}