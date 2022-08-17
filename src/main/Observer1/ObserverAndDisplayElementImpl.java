package main.Observer1;

public class ObserverAndDisplayElementImpl implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private SubjectImpl subjectImpl;

    public ObserverAndDisplayElementImpl(SubjectImpl subjectImpl) {
        this.subjectImpl = subjectImpl;
        subjectImpl.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display(); // update가 호출되면 display를 호출
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + " 습도 : " + humidity);
    }
}
