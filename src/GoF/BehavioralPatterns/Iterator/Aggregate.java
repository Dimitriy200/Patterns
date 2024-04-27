package GoF.BehavioralPatterns.Iterator;

public interface Aggregate<T> {
    public Iterator<T> createIterator(); 
}