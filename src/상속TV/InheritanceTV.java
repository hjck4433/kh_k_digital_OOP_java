package 상속TV;
// 이전에 만들었던 TV에서 상속 관계를 적용하고 오버라이딩 이점을 확인
public class InheritanceTV {
    public static void main(String[] args) {
        PrototypeTV prototypeTV = new PrototypeTV(); // 상속을 주는 클래스가 인스턴스화 된다는 의미는 추상화가 아니라는 의미
        ProductTV smartTV = new ProductTV("우리집 TV");
        smartTV.setPower(true);
        smartTV.setVolume(120);
        smartTV.setChannel(1500, true);
        smartTV.viewTV();
    }
}
