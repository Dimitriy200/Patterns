package GoF.StructuralPatterns.Bridge;

public class RefinedAbstraction extends Abstraction{

    protected RefinedAbstraction(Implementer implementer) {
        super(implementer);
    }

    @Override
    public void someFunv(){
        System.err.println("Some Function");
    }
}