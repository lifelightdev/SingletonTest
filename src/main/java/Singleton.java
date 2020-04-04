public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton(){
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getSomething() {
        return "something";
    }
}
