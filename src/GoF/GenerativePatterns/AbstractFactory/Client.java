package GoF.GenerativePatterns.AbstractFactory;


public class Client{
    
    private AbstractProductA productA; 
    private AbstractProductB productB; 


    Client(AbstractFactory a){
        productA = a.createProductA();
        productB = a.createProductB();
    }

    public void execute(){
        productB.interact(productA);
    }
}