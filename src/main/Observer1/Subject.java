package main.Observer1;

public interface Subject {

    /**
     * Observer를 인자로 받음
     * @param o
     */
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(); // 주제 상태 변경시 모든 옵저버에게 변경 내역을 알림

}

