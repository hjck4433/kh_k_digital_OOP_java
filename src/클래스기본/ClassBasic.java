package 클래스기본;

public class ClassBasic {
    //public (접근제한자) 공용
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1 : Student에 대한 참조 변수 (값이 아닌 인스턴스화 된 Student class의 주소가 저장됨)
        // new Student(): Student Class를 힙 영역 Student Class 만큼의 메모리를 동적할당 (Runtime) =>인스턴스화 (객체가 만들어짐)
        System.out.println(s1.setName("곰돌이사육사"));
        s1.setName("곰돌이사육사");
        s1.setAddr("경기도 수원시");
        s1.showInfo();

        Student s2 = new Student();
        s2.setName("안유진");
        s2.setAddr("서울시 강남구");
        s2.showInfo();

        Student s3 = new Student();
        s3.setName("유나");
        s3.setAddr("수원시 팔달구");
        s3.showInfo();


    }
}
