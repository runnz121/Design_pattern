package main.Observer;

import java.util.ArrayList;
import java.util.List;

public class 새로운컨텐츠 implements Observable {
	/**
	 * 새로운 컨텐츠가 등록이되면
	 * 구독자에게 알림을 보냄
	 * 이 부분은 관찰 되어지는 객체임
	 */

	//구독자들이 등록되는 곳
	List<Observer> observableList = new ArrayList<>();

	private boolean 신규컨텐츠등록;

	private boolean is신규컨텐츠등록() {
		return 신규컨텐츠등록;
	}

	public void 신규컨텐츠나옴() {
		System.out.println("신규컨텐츠가 등록됨!");
		신규컨텐츠등록 = true;
		구독자에게알리기();
	}

	@Override
	public void 구독하기(Observer o) {
		observableList.add(o);
	}

	@Override
	public void 구독해지(Observer o) {
		observableList.remove(o);
	}

	//구독되어있는 구독자에게 모든 알람을 전송함(리스트로 저장되어있음으로 foreach로 전달)
	@Override
	public void 구독자에게알리기() {
		//observableList.forEach(Observer::업데이트);
		observableList.forEach(observer -> observer.업데이트());
	}
}
