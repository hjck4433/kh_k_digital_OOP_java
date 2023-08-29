package 추상클래스두번째_익명객체;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 14");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        // 익명객체
        Phone phone = new Phone("목업") { // 일회용으로 객체를 만들고 끝냄 // 따로 클래스를 생성하지 않았음
            // 부모가 알고 있는 것만 불러 옴
            @Override
            void call() {
                System.out.println("목업폰이라 통화가 안되요ㅠㅠ");
            }
        };
        phone.call();
    }
}
