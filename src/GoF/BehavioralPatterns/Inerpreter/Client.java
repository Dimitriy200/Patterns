package GoF.BehavioralPatterns.Inerpreter;

public class Client {
    public static void main(String[] args) {
        String string = "context";
        Context context = new Context(string);
        Expression expressionA = context.getExceptionA();
        Expression expressionB = context.getExceptionA();

        System.err.println(expressionA.inerpret(string));
        System.err.println(expressionB.inerpret(string));
    }
}