package GoF.GenerativePatterns.Singleton;

public class SynchronizedAccessorSingleton {
    private static SynchronizedAccessorSingleton INSTANCE;

    private SynchronizedAccessorSingleton() {
    }
  
    public static synchronized SynchronizedAccessorSingleton getInstance() {
      if (INSTANCE == null) {
        INSTANCE = new SynchronizedAccessorSingleton();
      }
      return INSTANCE;
    }
}