package FactoryMethod;


public class ConcreteCreatorB extends Creator{

    @Override
    protected Product createProduct(){
        return new ConcreteProductB();
    }
}