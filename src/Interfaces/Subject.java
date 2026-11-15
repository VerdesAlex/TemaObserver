package Interfaces;


import Interfaces.*;
import java.util.*;

public interface Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o);
    public void addObservers(List<Observer> os);
    public void removeObserver(Observer o);
    public void notifyObservers(Object arg);
}
