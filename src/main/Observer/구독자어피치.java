package main.Observer;

public class 구독자어피치 implements Observer {
	//구독자
	@Override
	public void 업데이트() {
		System.out.println("어피치 : 구독함!");
	}
}
