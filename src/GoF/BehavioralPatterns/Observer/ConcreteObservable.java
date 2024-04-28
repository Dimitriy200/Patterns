package GoF.BehavioralPatterns.Observer;

import java.util.LinkedList;
import java.util.List;

public class ConcreteObservable implements Observable{
    private List<Observer> observers;
    private int info;

    public ConcreteObservable(){
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(info);
        }
    }

    public void setInfo(int info){
        this.info = info;
    }
}