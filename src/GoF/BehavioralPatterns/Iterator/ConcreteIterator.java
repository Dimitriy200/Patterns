package GoF.BehavioralPatterns.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ConcreteIterator implements Iterator<Type>{
    private int currentIndex = 0;
    private List<Type> listTypes;

    public ConcreteIterator(List<Type> listTypes){
        this.listTypes = listTypes;
    }
    
    @Override
    public boolean hasNext(){
        return currentIndex < listTypes.size();
    }
    @Override
    public Type next(){
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return listTypes.get(currentIndex++);
    }
}