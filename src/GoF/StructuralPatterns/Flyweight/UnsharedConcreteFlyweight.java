package GoF.StructuralPatterns.Flyweight;

public class UnsharedConcreteFlyweight extends Flyweight{
    public UnsharedConcreteFlyweight(){
        symbol = 'B';
    }
    @Override
    public void printCharacter(){
        System.out.println(symbol);
    }
}