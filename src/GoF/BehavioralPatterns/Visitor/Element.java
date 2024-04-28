package GoF.BehavioralPatterns.Visitor;

public abstract class Element {
    int info;

    public abstract void accept (Visitor visitor);

    public void setInfo(int info){
        this.info = info;
    }
    
    public int getInfo(){
        return this.info;
    }
}