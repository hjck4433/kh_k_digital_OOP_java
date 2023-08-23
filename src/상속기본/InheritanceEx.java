package 상속기본;
// 상속 : 자식 클래스가 부모 클래스의 기능을 물려 받는 것(필드와 메소드)
// 키워드 : extends
public class InheritanceEx {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("puppy"); // Animal로 부터 상속받아 setName 사용 가능
//        //System.out.println(dog.name);
//        dog.sleep();
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(2);
    }
}
