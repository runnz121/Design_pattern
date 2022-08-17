package main.Observer1;

public interface Observer { // 모든 Observer 클래스는 update를 구현해야 함

    // 정보가 변경되었을 때 안의 인자값이 옵저버에게 전달됨
    public void update(float temp, float humidity, float pressure);

}
