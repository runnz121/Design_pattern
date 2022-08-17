package main.Strategy;

public class StrategyPlay {


    public static void main(String[] args) {
        /**
         * strategy pattern
         */

        // 전략 사용자 (Duck을 상속 받은 DuckExtends
        Context test1 = new ContextUser1();
        test1.performStrategy1();

        // 다양한 fly 전략중 FlyImpl2를 선택함
        test1.setStrategy1(new UserStrategy1Impl2());
        test1.performStrategy1();

        test1.swim();

    }

}
