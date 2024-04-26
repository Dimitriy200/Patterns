package GoF.BehavioralPatterns.Inerpreter;

public class ConcreteExpressionA implements Expression{
    private String data;

    public ConcreteExpressionA(String data){
        this.data = data;
    }

    @Override
    public boolean inerpret(String context){
        if(context.contains(this.data)){
            return true;
         }
         return false;
    }
}