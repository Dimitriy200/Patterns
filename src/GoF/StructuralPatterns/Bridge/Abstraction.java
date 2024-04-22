package GoF.StructuralPatterns.Bridge;

public abstract class Abstraction {
    
    protected Implementer implementer;

    protected Abstraction(Implementer implementer){
        this.implementer = implementer;
    }

    public void someFunv(){}
}