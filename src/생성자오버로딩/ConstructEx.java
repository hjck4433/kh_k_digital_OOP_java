package 생성자오버로딩;

public class ConstructEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();

        Car santafe = new Car("싼타페");
        santafe.carInfo();

        Car avante = new Car("아반떼", "화이트");
        avante.carInfo();

        Car granduer = new Car("그랜져", "블랙", 220);
        granduer.carInfo();

        Car tucson = new Car("투싼", "레드", 110, 170);
        tucson.carInfo();
    }
}
