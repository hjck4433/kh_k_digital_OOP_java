package 클래스기본;

public class Student { //학생에 대한 설계도
    // private
    // - 외부에서 해당 필드에 대한 접근 막음 / 같은 클래스 내에 있는 경우에만 접근 가능
    // - main에서 보이지 않게 해줌 / (캡슐화) / showInfo/ set변수 를 통해서만 접근 가능 / 외부에서 함부로 수정 불가
    // - Setter 메소드를 통해 조건에 맞게 입력

    private int id;       // 학번, 인스턴스 필드 (클래스 내부 선언 변수) // 객체를 만들 때 같이 생성됨
    private String name;  // 이름
    private int grade;    // 학년
    private String addr;  // 주소

    //메소드
    public void showInfo() {
        System.out.println(name + ", " + addr);
    }

    //Setter 메소드 // 인스턴스 메소드
    public boolean setName(String name) {
        this.name = name;
        return true; //void 상태에서는 error / void => boolean 변경하면 가능
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
