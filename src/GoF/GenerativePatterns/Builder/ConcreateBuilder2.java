package Builder;


public class ConcreateBuilder2 extends AbstactBuilder {
    
    @Override
    public void buildDough() {
        product.setDough("Dough 2");
    }

    @Override
    public void buildSauce() {
        product.setSauce("Sauce 2");
    }

    @Override
    public void buildTopping() {
        product.setTopping("Topping 2");
    }
}