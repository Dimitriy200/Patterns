package GoF.GenerativePatterns.Builder;


public class Product{

    protected String dough = "";
    protected String sauce = "";
    protected String topping = "";


    public void setDough(String dough){
        this.dough = dough;
    }
    
    public void setSauce(String sauce){
        this.sauce = sauce;
    }

    public void setTopping(String topping){
        this.topping = topping;
    }
}