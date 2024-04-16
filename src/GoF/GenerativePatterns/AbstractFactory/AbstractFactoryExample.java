

public class AbstractFactoryExample{
    
    public static void main(String[] args){

        AbstractFactory factory1 = new ConcreteFactory1();
        Client client = new Client(factory1);
        
        client.execute();

    }
}