package GoF.BehavioralPatterns.Visitor;

public class ConcreteVisitorA implements Visitor{
    
    @Override
    public void vizitA(ConcreteElementA element){
        System.out.println("Concrete Visitor A" + element.getInfoA());
    }

    @Override
    public void vizitB(ConcreteElementB element) {
        System.out.println("Concrete Visitor A" + element.getInfoB());
    };
}