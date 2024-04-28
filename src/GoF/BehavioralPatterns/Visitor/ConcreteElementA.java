package GoF.BehavioralPatterns.Visitor;

public class ConcreteElementA extends Element{
    int infoA;

    public ConcreteElementA(int infoA){
        this.infoA = infoA;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.vizitA(this);
    }
    
    public int getInfoA(){
        return this.infoA;
    }
}