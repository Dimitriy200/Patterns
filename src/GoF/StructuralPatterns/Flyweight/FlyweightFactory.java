package GoF.StructuralPatterns.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<Integer, Flyweight> flyweights = new HashMap<>();
    
    public Flyweight getFlyweight(int key){
        Flyweight flyweight =this.flyweights.get(key);

        if(flyweight == null){
            switch (key) {
                case 1:{
                    flyweight = new ConcreteFlyweight();
                }
                    break;
                case 2:{
                    flyweight = new UnsharedConcreteFlyweight();
                }
                    break;
            }
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}