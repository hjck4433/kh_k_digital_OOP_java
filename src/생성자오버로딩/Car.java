package 생성자오버로딩;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsePower;
    
    // Car() {} : default 생성자가 숨어있음

    Car() {}
    Car(String model) {
        this.model = model; // this가 빠지면 model는 둘다 지역변수로 인식 / this를 사용해서 구분
    }
//    Car(String modelName) {
//        model = modelName; // 서로 이름이 달라서 구분이 가능
//    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    Car(String model, String color, int speed, int horsePower) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    public void carInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }
}
