package Builder;


public class Director {
    
    private AbstactBuilder abstractBuil;


    public void setProductBuilder(AbstactBuilder ab1){
        abstractBuil = ab1;
    }

    public Product getProduct(){
        return abstractBuil.getProduct1();
    }

    public void contructProduct(){
        abstractBuil.createNewProduct1();
        abstractBuil.buildDough();
        abstractBuil.buildSauce();
        abstractBuil.buildTopping();
    }
}