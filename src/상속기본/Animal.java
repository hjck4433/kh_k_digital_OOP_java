package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
// 또 다른 클래스를 만들 수 있으나 public은 하나만 가능/ default는 같은 패키지 내에서만 접근 가능
// Animal을 상속 받아 Dog 클래스를 만듬
//class 앞에 default 가 생략 되어 있음
class Dog extends Animal {
    void sleep() { // 상속 후 기능 추가 => 오버라이딩
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    void sleep() { // 상속 후 기능 재정의 => 오버라이딩
        System.out.println(this.name + " zzz in house"); // 막으면 Dog.sleep()의 결과가 나옴
    }
    void sleep(int hour) { // 오버로딩
        System.out.println(this.name + " zzz in house for " + hour + "hours");
    }
}