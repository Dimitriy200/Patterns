package Prototype;


public class ConcretePrototypeB implements Prototype{
    
    @Override
    public Prototype clone(){
        ConcretePrototypeB concretePrototypeB = new ConcretePrototypeB();

        return concretePrototypeB;
    }
}