package main.Decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        // 일반 음료 출력
        Beverage beverage = new Espresso();
        System.out.println("음료 설명 " + beverage.getDescription());
        System.out.println("음료 가격 " + beverage.cost());


        // 데코레이터 패턴 추가된 음료 출력
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println("음료 설명 " + beverage1.getDescription());
        System.out.println("음료 가격 " + beverage1.cost());
    }

}
