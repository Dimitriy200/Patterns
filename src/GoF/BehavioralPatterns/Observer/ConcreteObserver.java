package GoF.BehavioralPatterns.Observer;

public class ConcreteObserver implements Observer{
    private int info;

    public ConcreteObserver(Observable observable){
        observable.registerObserver(this);
    }

    @Override
    public void update(int info) {
    }
    public void somMethod(){
        System.out.println("Concrete Observer somMethod " + this.info);
    }
}