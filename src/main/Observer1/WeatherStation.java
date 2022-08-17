package main.Observer1;

public class WeatherStation {

    public static void main(String[] args) {

        SubjectImpl subjectImpl = new SubjectImpl();

        ObserverAndDisplayElementImpl observerAndDisplayElementImpl =
            new ObserverAndDisplayElementImpl(subjectImpl);

        // Subject 구현부의 메소드를 호출함으로서 -> 주제를 구독하고있는 모든 옵저버가 업데이트됨
        subjectImpl.setMeasurements(80, 20, 30.4f);
        subjectImpl.setMeasurements(70, 30, 31.4f);

    }
}
