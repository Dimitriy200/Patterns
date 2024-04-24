package GoF.StructuralPatterns.Proxy;

public class Proxy implements Subject{
    Subject subject;

    public void laxyInitSubject(){
        this.subject = new ConcreteSubject();
    }

    @Override
    public void doit(){
        laxyInitSubject();
        this.subject.doit();
    }
}