package GoF.StructuralPatterns.Composite;

public class Client {
    public static void main(String args[]){

        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Leaf leaf4 = new Leaf();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite1.add(leaf1);
        composite1.add(leaf2);
        composite1.add(leaf3);

        composite2.add(leaf4);
        composite2.add(leaf1);

        composite3.add(leaf3);
    }
}