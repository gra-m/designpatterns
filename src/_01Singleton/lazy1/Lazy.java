package _01Singleton.lazy1;

final class Lazy {
    private static Lazy lazy;

    private Lazy() {
        System.out.println("Creating a lazy");
    }

    public static synchronized Lazy getLazy() {
        if (lazy == null)
            return lazy = new Lazy();
        else
            return lazy;
    }
}
