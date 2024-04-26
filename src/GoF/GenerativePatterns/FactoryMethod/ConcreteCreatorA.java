package GoF.GenerativePatterns.FactoryMethod;


public class ConcreteCreatorA extends Creator{

    @Override
    protected Product createProduct(){
        return new ConcreteProductA();
    }
}