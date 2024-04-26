package GoF.BehavioralPatterns.Inerpreter;

public class Context {
    String string;

    public Context(String string){
        this.string = string;
    }

    public Expression getExceptionA(){
        Expression A1 = new ConcreteExpressionA(this.string + "A1");
        Expression A2 = new ConcreteExpressionA(this.string + "A2");

        return new ConcreteExpressionB(A1, A2);
    }

    public Expression getExceptionB(){
        Expression A1 = new ConcreteExpressionA(this.string + "B1");
        Expression A2 = new ConcreteExpressionA(this.string + "B2");

        return new ConcreteExpressionB(A1, A2);
    }
}