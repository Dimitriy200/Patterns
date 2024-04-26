package GoF.GenerativePatterns.FactoryMethod;


public class ConcreteProductB implements Product{

    @Override
    public void build(){
        System.out.println("build Pr B");
    }
}