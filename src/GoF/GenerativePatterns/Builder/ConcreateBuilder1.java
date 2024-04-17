

public class ConcreateBuilder1 extends AbstactBuilder {


    @Override
    public void buildDough() {
        product.setDough("Dough 1");
    }

    @Override
    public void buildSauce() {
        product.setSauce("Sauce 1");
    }

    @Override
    public void buildTopping() {
        product.setTopping("Topping 1");
    }   
}