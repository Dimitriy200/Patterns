package GoF.GenerativePatterns.AbstractFactory;


public class ProductA1 implements AbstractProductA {
    
    @Override
    public void interact(AbstractProductB b){
        System.out.println(this.getClass().getName());
    }
}