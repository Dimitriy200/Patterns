package Prototype;


public class ConcretePrototypeA implements Prototype{
    
    @Override
    public Prototype clone(){
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();

        return concretePrototypeA;
    }
}