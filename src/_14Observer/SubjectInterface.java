package _14Observer;


import java.util.ArrayList;

public interface SubjectInterface {

    ArrayList getObservers();
    void register(Observer observer);
    void unregister(Observer observer);
}
