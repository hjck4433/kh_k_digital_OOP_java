package Object클래스;
// toString() : 해당 인스턴스에 대한 정보를 문자열로 반환
// 클래스이름@해쉬코드 (객체의 메모리 주소를 이용해 해쉬코드 생성)
// toString() 메소드는 오버라이딩해서 사용 가능하며 String, Integer의 경우에는 오버라이딩 되어 있음
public class ObjectClass {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();
        System.out.println(car01.toString());
        System.out.println(car02.toString());
        // 객체 주소 => Hash function => hashcode (고유값) 역추적이 불가능함 ex)RSA 암호화 기법
        // 같은 객체인지 비교하는데 사용

        // 예외적으로 오버라이딩 해서 실제 값을 반환해줌
        String test = "곰돌이사육사";
        Integer test2 = 2300;
        int test3 = 4500;
        System.out.println(test);
        System.out.println(test2);

        // equals() 메소드 : 인스턴스를 매개변수로 전달받는 참조변수와 비교하여 그 겨로가를 반환
        System.out.println(car01.equals(car02)); // false
        Car car03 = car01; // 얕은 복사
        System.out.println(car01.equals(car01)); // true

    }
}

class Car {

}