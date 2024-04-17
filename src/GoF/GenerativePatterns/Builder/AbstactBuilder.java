package Builder;


public abstract class AbstactBuilder {

    protected Product product;


    public Product getProduct1(){
        return product;
    }

    public void createNewProduct1(){
        product = new Product();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}