package GoF.GenerativePatterns.Singleton;

public class SimpleSingleton {
    
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }
}