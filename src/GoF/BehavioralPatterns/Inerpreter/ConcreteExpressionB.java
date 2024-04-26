package GoF.BehavioralPatterns.Inerpreter;

public class ConcreteExpressionB implements Expression{
    private Expression expr1 = null;
    private Expression expr2 = null;

    public ConcreteExpressionB(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean inerpret(String context){
        return this.expr1.inerpret(context) || this.expr2.inerpret(context);
    }
}