

public class Client {
    
    public static void main(String args[]){

        Director director = new Director();
        AbstactBuilder builder1 = new ConcreateBuilder1();

        director.setProductBuilder(builder1);
        director.contructProduct();
    }
}
