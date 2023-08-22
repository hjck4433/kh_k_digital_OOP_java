package 인스턴스필드;

public class FieldTest {
    static int classVal = 10; // 클래스 변수 선언, 정적변수, 메소드 영역에 저장, 단 한번만 생성, 프로그램 종료시 소멸
    int instanceVal = 20;     // 인스턴스 변수 선언, 동적변수, 힙 영역에 저장, 객체가 만들어 질 때 마다 생성, 인스턴스 소멸시 소멸
}
