package GoF.StructuralPatterns.Flyweight;

public class ConcreteFlyweight extends Flyweight{
    public ConcreteFlyweight(){
        symbol = 'A';
    }
    @Override
    public void printCharacter(){
        System.out.println(symbol);
    }
}