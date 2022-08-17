package main.Observer1;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    // 등록된 옵저버
    public List<Observer> observers;
    public float temperature;
    public float humidity;
    public float pressure;

    public SubjectImpl() {
        observers = new ArrayList<Observer>();
    }

    // 옵저버의 등록
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 옵저버의 탈퇴
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // 이 메서드 호출 시 옵저버 업데이트
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // 알람을 보내는 메서드를 호출
    public void measurementChanged() {
        notifyObservers();
    }

    // 새로운 값이 할당되면
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
