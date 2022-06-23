package _01Singleton.eager_whenwanted3;

public class PughsEagerIsh{

    private PughsEagerIsh() {
        System.out.println("Private nested class means PughsEagerish is not created " +
                "\nwhen we invoke iHaveToBeHereButYouCanCallMeFOC");
    }

    private static class helpEagerish {
       private static final PughsEagerIsh pughsEagerIsh = new PughsEagerIsh();
    }

    public static PughsEagerIsh getPughsEagerish() {
        return helpEagerish.pughsEagerIsh;
    }

    public static void iHaveToBeHereButYouCanCallMeFOC(){
        System.out.println("PughsEagerish was not created when you called me.");
    }
}
