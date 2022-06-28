package _01Singleton.double_lock4;

public class DoubleLock {
    private static DoubleLock doubleLock;

    private DoubleLock() {
        System.out.println("DoubleLock created. Expensive 'Synchronized' only,\npossibly, hit by multiple threads" +
                "early on");
    }

    public static DoubleLock getDoubleLock() {

        if (doubleLock == null) {
            {
                synchronized (DoubleLock.class) {
                    return doubleLock = new DoubleLock();
                }
            }
        } else
            return doubleLock;
    }

}
