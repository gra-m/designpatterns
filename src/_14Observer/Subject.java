package _14Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface{
    List<Observer> observers = new ArrayList<>(3);
    int valueOfInterest = 0;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public ArrayList getObservers() {
        return new ArrayList(observers);
    }

    int getValueOfInterest() {
        return valueOfInterest;
    }

    void setValueOfInterest(int newValue) {
        valueOfInterest = newValue;
        informSubscribers();
    }

    private void informSubscribers() {
        for (Observer observer: observers)
            observer.update(valueOfInterest);
    }

}
