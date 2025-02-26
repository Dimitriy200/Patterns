package GoF.GenerativePatterns.Singleton;

public class LazyInitializationSingleton {
  private static LazyInitializationSingleton INSTANCE;

  private LazyInitializationSingleton() {}

  public static LazyInitializationSingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new LazyInitializationSingleton();
    }
    return INSTANCE;
  }
}