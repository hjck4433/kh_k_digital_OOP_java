package 객체타입확인;
// instanceof : 상속관계가 성립하는지 확인하는 용도
// 왼쪽 피연산자가 오른쪽 피연산자의 인스턴스인지를 검사하며,
// 결과는 불리언 값(true / false)로 반환됩니다.

public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");

        System.out.println(parent instanceof Parent); // parent가 Parent의 객체인가?
        System.out.println(child instanceof Parent);  // true
        System.out.println(parent instanceof Child);  // false Child -> Parent 불가
        System.out.println((child instanceof Child)); // true

    }
}
class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {

    Child(String name) { // 부모 생성자에 매개변수가 존재 하기 때문에 초기화를 해줘야 함 / 기본생성자만 있는경우에는 필요 없음
        super("부모"); // super => 부모를 의미
        this.name = name;
    }
}
