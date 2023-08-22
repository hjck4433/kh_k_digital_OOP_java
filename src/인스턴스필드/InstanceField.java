package 인스턴스필드;

public class InstanceField {
    public static void main(String[] args) {
        int val = 30; // 지역 변수, 스택 영역, 블록에서 벗어 날 때 소멸
        FieldTest fieldTest1 = new FieldTest(); //fieldTest1 -> 지역 변수 / stack 영역
        fieldTest1.instanceVal = 200; // 각각의 객체마다 값을 다르게 설정 할 수 있음
        FieldTest.classVal = 1000; // 클래스에서 바로 접근

        FieldTest fieldTest2 = new FieldTest();
        fieldTest2.instanceVal = 300; 


    }
}
