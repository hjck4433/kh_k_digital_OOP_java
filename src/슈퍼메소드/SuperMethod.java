package 슈퍼메소드;
// super : 부모의 필드나 메소드를 접근할 때 사용
// super() : 부모의 생성자를 호출
public class SuperMethod {
    public static void main(String[] args) {
         Child child = new Child(); // Child가 만들어지려면 Parent가 먼저 생성되어야 함 / 매개변수가 있는 생성자만 있는 경우 자식에서 부모 생성자를 호출해야 함
//        child.childMethod();
        child.display();


    }
}

class Parent {
    //int x = 10;
    int a;
    Parent() { a = 10; } // 자식에서 따로 호출하지 않았을 때 자동 호출
    Parent(int n) { a = n; }
}
class Child extends Parent {
    //int x = 20; // 필드에 대한 오버라이딩
    int b;
    Child() {
        super(100);
        b = 20;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
//    void childMethod() {
//        System.out.println("x : " + x); // 자식 필드 접근
//        System.out.println("x : " + this.x); // 원래 this 숨어 있었음
//        System.out.print("x : " + super.x); // 부모 필드 접근
//    }
}
