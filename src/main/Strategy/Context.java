package main.Strategy;

/**
 * 전략을 사용하는 사용자 (Context ->
 */
public abstract class Context {

    /**
     * 전략을 사용하는 사용자가 사용할 전략을 정의
     */
    UserStrategy1 userStrategy1;
    UserStrategy2 userStrategy2;

    public Context() {}

    public abstract void display();

    public void performStrategy1() {
        userStrategy1.userStrategy1();
    };

    public void performStrategy2() {
        userStrategy2.userStrategy2();
    };


    /**
     * 전략 상태 변경을 위한 set 지정
     * @param fb
     */
    public void setStrategy1(UserStrategy1 fb) {
        this.userStrategy1 = fb;
    }

    public void setStrategy2(UserStrategy2 qb) {
        this.userStrategy2 = qb;
    }


    public void swim() {
        System.out.println("수영하기");
    }

}
