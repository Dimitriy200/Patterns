package FactoryMethod;


public class ConcreteProductA implements Product{
    
    @Override
    public void build(){
        System.out.println("build Pr A");
    }
}