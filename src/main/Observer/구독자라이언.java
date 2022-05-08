package main.Observer;

public class 구독자라이언 implements Observer {
	// 구독자
	@Override
	public void 업데이트() {
		System.out.println("라이언이: 구독함!");
	}
}
