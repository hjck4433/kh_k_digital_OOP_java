package 싱글톤;
// 객체가 한번만 생성 되는 것
public class SingletonMain {
    public static void main(String[] args) {
        //Singleton test = new Singleton(); // => 생성자 접근 불가로 객체 생성 불가
//        Singleton obj1 = Singleton.getSingleton();
//        Singleton obj2 = Singleton.getSingleton();
//
//        System.out.println(obj1.id);
//        System.out.println(obj1.name);
//        obj1.id = 1004;
//        obj1.name = "곰돌이사육사";
//        System.out.println(obj2.id); // 같은 주소를 가리키기 때문에 변경 된 값이 출력 됨
//        System.out.println(obj2.name);

        TestObject1 member1 = new TestObject1();
        TestObject2 member2 = new TestObject2();

        //member1.setInfo("동그라미", 27);
        //member2.viewInfo(); // 싱글톤으로 값을 공유하고 있어서 member1에서 설정한 값이 입력됨

        for(int i = 0; i < 1000; i++) {
            member1.setInfo("동그라미", 27);
            member2.setInfo("우영우", 27);
        }
        member1.viewInfo();


    }
}
