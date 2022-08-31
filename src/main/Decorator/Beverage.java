package main.Decorator;

// 콘크리트 클래스
public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
