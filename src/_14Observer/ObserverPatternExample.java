package _14Observer;

public class ObserverPatternExample {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer obType1_01 = new ObserverType1("obType1_01");
        Observer obType1_02 = new ObserverType1("obType1_02");


        Observer obType2_01 = new ObserverType2("obType2_01");
        Observer obType2_02 = new ObserverType2("obType2_02");

        subject.register(obType1_01);
        subject.register(obType1_02);
        subject.register(obType2_01);
        subject.register(obType2_02);

        subject.setValueOfInterest(1000);

        System.out.println("Four registered: " + subject.getObservers());

        System.out.println("unregistering one:");


        subject.unregister(obType2_01);

        System.out.println("Three registered: " + subject.getObservers());

    }
}
