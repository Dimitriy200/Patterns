package GoF.BehavioralPatterns.Visitor;

public class ConcreteVisitorB implements Visitor{
    @Override
    public void vizitA(ConcreteElementA element){
        System.out.println("Concrete Visitor B" + element.getInfoA());
    }

    @Override
    public void vizitB(ConcreteElementB element) {
        System.out.println("Concrete Visitor B" + element.getInfoB());
    };
}