package AbstractFactory;


public class ProductB1 implements AbstractProductB{
    
    @Override
    public void interact(AbstractProductA a){
        System.out.println(this.getClass().getName());
    }
}