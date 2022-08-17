package main.Strategy;

public class ContextUser1 extends Context {

    /**
     * 상위에 정의된 전략을 상속받아서 구현
     */
    public ContextUser1() {
        userStrategy1 = new UserStrategy1Impl();
        userStrategy2 = new UserStrategyImpl2();
    }

    @Override
    public void display() {
        System.out.println("contextUser1");
    }
}
