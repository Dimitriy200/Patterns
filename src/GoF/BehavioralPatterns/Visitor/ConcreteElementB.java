package GoF.BehavioralPatterns.Visitor;

public class ConcreteElementB extends Element{
    int infoB;

    public ConcreteElementB(int infoB){
        this.infoB = infoB;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.vizitB(this);
    }

    public int getInfoB(){
        return this.infoB;
    }
}