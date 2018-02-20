package Decorator;

import java.util.ArrayList;

interface IObserver {
    void update();
}

class Observer implements IObserver {
    @Override
    public void update() {
        System.out.println("observer got notified by Observable");
    }
}

class Observable {
    private ArrayList<IObserver> observers = new ArrayList<>();

    public void register(IObserver observer) {
        observers.add(observer);
    }

    public void unRegister(IObserver observer) {
        observers.remove(observer);
    }

    public void onEvent() {
        notifyAllObservers();
        System.out.println("doing event");
    }

    private void notifyAllObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
