package _01Singleton.lazy1;

public class LazyMain {
    public static void main(String[] args) {
        Lazy lazy1 = Lazy.getLazy();
        Lazy lazy2 = Lazy.getLazy();

        System.out.println(lazy1.equals(lazy2));
    }
}
