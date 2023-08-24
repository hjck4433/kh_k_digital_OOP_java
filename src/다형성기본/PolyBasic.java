package 다형성기본;

public class PolyBasic {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        Parent p = new Child(); // 부모 클래스의 참조 변수로 자식 객체를 접근 함
        // p.out() 사용 불가 => 부모가 가지고 있지 않기 때문에 접근 불가
        p.display(); // Child의 display가 불려짐 * 오버라이딩이 일어난 메소드만 호출 가능

    }
}
