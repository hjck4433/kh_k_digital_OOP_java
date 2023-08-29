package 디포트메소드중복;

public interface Buy {
    void buy(); // public abstract 가 자동으로 추가 됨
    default void order() { // 예외적으로 구현부를 가짐
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell(); 
    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy, Sell {


    @Override
    public void buy() {

    }

    @Override
    public void order() { // 어느 인터페이스의 order()를 상속 받을지 명시 // 사용하려면 오버라이딩 해줘야 함
        Sell.super.order();
        Buy.super.order();
    }

    @Override
    public void sell() {

    }
}