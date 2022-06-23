package _01Singleton.double_lock4;

public class DoubleLockMain {
    public static void main(String[] args) {
        DoubleLock doubleLock1 = DoubleLock.getDoubleLock();
        DoubleLock doubleLock2 = DoubleLock.getDoubleLock();

        System.out.println(doubleLock1.equals(doubleLock2));
    }
}
