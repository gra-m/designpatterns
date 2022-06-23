package _01Singleton.eager_unwanted2;

public class Eager {
    // Thread safe because Eager has been made already but could be expensive, and created when otherMethodThatHasToBeHere
    // is invoked.
    private static final Eager EAGER = new Eager();

    private Eager() {
        System.out.println("Eager is going to be made whatever you do with this class");
    }


    public static Eager getEager() {
        return EAGER;
    }

    public static void otherMethodThatHasToBeHere() {
        System.out.println("That's right, that's expensive");
    }
}
