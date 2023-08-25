package 추상클래스기본;
// 추상클래스는 클래스 앞에 abstract 키워드를 붙여서 만듬
// 추상클래스는 객체화 안됨
// 내부에 0개 이상의 추상 메소드가 포함되어 있음
// 추상메소드는 반드시 상속 받는 클래스에서 오버라이딩 해줘야 함(해당 메소드의 기능을 구체화 시킴)
public abstract class AnimalClass {
    abstract void cry(); // 추상 메소드 : 상속 받은 클래스에서 구체화를 해줘야 함 (오버라이딩 필수) / (울어야 한다는 것만 있음 : 방법 X)
    void sleep() { // 일반 메소드 : 상속 및 오버라이드 선택사항
        System.out.println("zzz");
    }
}

class Cat extends AnimalClass {
    @Override
    void cry() {
        System.out.println("냐옹냐옹!!!");
    }
    @Override
    void sleep() {
        System.out.println("ZZZZZZZZZZZZZZZZ");
    }
}

class Dog extends AnimalClass {
    @Override
    void cry() {
        System.out.println("멍멍멍");
    }
}
