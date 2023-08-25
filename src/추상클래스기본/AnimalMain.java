package 추상클래스기본;

public class AnimalMain {
    public static void main(String[] args) {
//        AnimalClass animalClass = new AnimalClass(); => 추상화가 걸려있어서 객체 생성 불가
//        AnimalClass animalClass = new AnimalClass() { 익명의 클래스 / 한번만 사용하는 클래스
//            @Override
//            void cry() {
//
//            }
//        }
        Cat cat = new Cat();
        cat.cry();
        cat.sleep();

        Dog dog = new Dog();
        dog.cry();
        dog.sleep(); // 오버라이딩 하지 않아서 cat과 다름

        // 추상클래스의 참조 변수로 상속 객체를 접근, 자주 쓰이는 방법
        AnimalClass animal = new Cat();
        animal.cry();
        animal.sleep(); // 상속 받아서 오버라이딩 된 결과 출력
    }
}
