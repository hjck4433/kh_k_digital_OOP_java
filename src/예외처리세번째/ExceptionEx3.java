package 예외처리세번째;
// NullPointerException (NPE) : Java에서 발생하는 대표적인 런타임 에러 입니다. 참조 하려는 객체가 없는 경우에 발생 합니다.
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        // 잘못된 처리 방식
//        try {
//            String testStr = test.name;
//            System.out.println(testStr);
//        } catch (NullPointerException e) {
//            //System.out.println("NPE가 발생 했습니다.");
//        }
        if(test != null) {
            String testStr = test.name;
            System.out.println(testStr);
        }else {
            System.out.print("testStr null 입니다.");
        }

    }
}

class Test {
    /*static*/ String name = "곰돌이사육사"; // static 붙으면 값 반환
}