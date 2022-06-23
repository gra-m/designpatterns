package _01Singleton.eager_unwanted2;

public class EagerMain {
    public static void main(String[] args) {

        Eager.otherMethodThatHasToBeHere();

        Eager eager1 = Eager.getEager();
        Eager eager2 = Eager.getEager();

        System.out.println(eager1.equals(eager2));


    }
}
