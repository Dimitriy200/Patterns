package GoF.StructuralPatterns.Composite;

public class Leaf implements Component{
    @Override
    public void print(){
        System.out.println("print Leaf");
    }
}