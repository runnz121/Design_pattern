package main;

import main.Observer.Observer;
import main.Observer.구독자라이언;
import main.Observer.구독자어피치;
import main.Observer.새로운컨텐츠;
import main.Strategy.Context;
import main.Strategy.ContextUser1;
import main.Strategy.UserStrategy1Impl2;

public class sample {


    public static void main(String[] args) {
        /**
         * observer pattern
         */
        새로운컨텐츠 새로운 = new 새로운컨텐츠(); // observable : 관찰되어지는 객체

        Observer 구독자1 = new 구독자라이언(); // observer : 상태 정보를 필요로 하는 구독자
        Observer 구독자2 = new 구독자어피치(); // 구독자를 생성

        //--------------------------------------------//

        새로운.구독하기(구독자1); // 구독서비스에 구독자를 등록함
        새로운.구독하기(구독자2);

        새로운.신규컨텐츠나옴(); // Observer : 상태정보를 필요로하는 구독자를 호출함

        새로운.구독해지(구독자2);

        새로운.신규컨텐츠나옴();


    }
}
