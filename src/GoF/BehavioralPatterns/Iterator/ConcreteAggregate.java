package GoF.BehavioralPatterns.Iterator;

import java.util.List;

public class ConcreteAggregate implements Aggregate<Type>{
    private List<Type> types;

    public ConcreteAggregate(List<Type> types){
        this.types = types;
    }
    
    @Override
    public Iterator<Type> createIterator(){
        return new ConcreteIterator(this.types);
    }
}