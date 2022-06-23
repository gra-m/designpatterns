package _14Observer;

public class ObserverType2 implements Observer{
    private String name;

    ObserverType2(String name) {
        this.name = name;
    }

    @Override
    public void update(int updatedValueOfInterest) {
        System.out.println(this.getClass() + " | " + this.name + "\n" +
                "The service we subscribe to says new value is: " + updatedValueOfInterest
        + "\n");
    }
}
