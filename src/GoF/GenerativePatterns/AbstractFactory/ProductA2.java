package GoF.GenerativePatterns.AbstractFactory;


public class ProductA2 implements AbstractProductA {
    
    @Override
    public void interact(AbstractProductB b){
        System.out.println(this.getClass().getName());
    }
}