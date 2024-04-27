package GoF.BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Type> types = new ArrayList<>();

        types.add(new Type(1));
        types.add(new Type(2));
        types.add(new Type(3));

        ConcreteAggregate aggregate = new ConcreteAggregate(types);
        Iterator<Type> iterator = aggregate.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " " + iterator.next().getItem());
        }
    }
}