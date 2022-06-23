package _14Observer;

public class ObserverType1 implements Observer{
    private String name;
    private int lastValue;

    public ObserverType1(String name) {
       this.name = name;
    }

    @Override
    public void update(int updatedValueOfInterest) {
        System.out.println("Observer of: " + this.getClass() + " named: " + this.name + " has been informed that there" +
                "has been a change\nto the value that is of interest to it\nPrevious value: " +
        lastValue + "\nNewValue: " + updatedValueOfInterest + "\n");

        lastValue = updatedValueOfInterest;
    }
}
