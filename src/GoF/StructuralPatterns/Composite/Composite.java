package GoF.StructuralPatterns.Composite;

import java.util.List;
import java.util.ArrayList;

public class Composite implements Component{
    private List<Component> components = new ArrayList<Component>();

    @Override
    public void print(){
        System.out.println("print Composite");
    }

    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component){
        components.remove(component);
    }
}