package GoF.BehavioralPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteObservable concreteObservable = new ConcreteObservable();
        Observer observer = new ConcreteObserver(concreteObservable);

        concreteObservable.setInfo(1);
        concreteObservable.setInfo(2);
        concreteObservable.setInfo(3);

        observer.notify();
    }
}