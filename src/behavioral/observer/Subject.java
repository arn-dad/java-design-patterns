package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Observable | Subject
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver(int value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}
