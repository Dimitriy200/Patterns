package GoF.GenerativePatterns.FactoryMethod;


public abstract class Creator {
    
    public Product create(){
        Product product = createProduct();
        product.build();

        return product;
    }

    protected abstract Product createProduct();
}