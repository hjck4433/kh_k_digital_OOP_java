package 다운캐스팅;
import java.util.ArrayList;
import java.util.List;
// 상위 클래스형으로 변환 되었던 하위클래스를 다시 원래 자료형으로 변환 하는 것을 다운캐스팅이라고 함.
public class DownCasting {
    List<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();
    }
    public void addAnimal() {
        aniList.add(new Animal()); // 객체가 인스턴스화 됨 // 리스트에 객체의 주소를 집어 넣음
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        for(Animal ani : aniList) {
            ani.move();
        }
    }
    public void testCasting() {
        for(int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i); //업캐스팅 => 부모가 알고 있는 메소드만 접근 가능
            if(ani instanceof Human) { // Human형으로 다운캐스팅 가능 한지 확인 // ani의 원래 형이 Human 인지 확인
                Human h = (Human) ani; // ani => human 형으로 형 변환
                h.readBook(); // 원래 자신의 클래스에 대한 참조 변수 이기 때문에 접근 가능
            }else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            }else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형 입니다.");
            }
        }

    }
}
