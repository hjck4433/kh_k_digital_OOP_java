package 컴페어러블;

public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    // 반환값이 1이면 정렬해야될 조건
    // 반환값이 -1이면 정렬조건이 아님
    // 반환값이 0이면 정렬조건은 아니지만 set을 사용하는 경우 중복 제거 조건이 됨 / 조건 추가
    public int compareTo(CarComp o) {
        if(this.modelYear > o.modelYear) return 1; // 연식별 오름차순 정렬
        else {
            if(this.modelYear == o.modelYear) {
                return this.color.compareTo(o.color); // 사전 순 정렬
                //return 0; 중복을 제거하는 Set 특징으로 하나만 남기고 삭제됨
            }
        }
        return -1;
    }
}
