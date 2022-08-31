package main.Decorator;

public abstract class CondimentDecorator extends Beverage {

    /**
     * 데코레이터가 감쌀 음료를 나타내는 beverage 객체
     */
    Beverage beverage;

    // 이 메소드를 새로 구현하도록 만듬
    public abstract String getDescription();
}
