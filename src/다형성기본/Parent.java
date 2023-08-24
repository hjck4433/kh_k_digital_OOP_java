package 다형성기본;

public class Parent { // extends Object 가 숨겨져 있음
    protected int money; // 상속 관계가 있거나 같은 패키지 내에서 접근 가능 // default 상태에서는 같은 패키지여야 접근 가능
    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}
