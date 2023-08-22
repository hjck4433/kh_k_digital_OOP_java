package 메소드와필드;
// 메소드 : 클래스 내에서 동작에 대한 기능을 구현 하는 것(함수가 클래스 내부에 있으면 메소드라 함)
// 필드 : 클래스 내에 존재하고 값을 저장하는 변수를 의미(상태를 저장)
public class MethodAndField {
    public static void main(String[] args) {
//        MethodAndField methodAndField = new MethodAndField();
//        int result = methodAndField.sum(100,200);
//        int result = MethodAndField.sum(100,200, 300, 100); //MethodAndField 생략 가능
//        System.out.println(result);

        //재귀 호출
        int result = recFunc(10);
        //int result = whileSum(10);
        System.out.println(result);
    }
    // 메소드 앞에 static을 선언하는 경우 객체 소속이 아니고 클래스 소속 // 메소드 영억으로 들어감 // compile time
    // 수학관련은 static ex)Math // 객체를 만들지 않음 *같은 수학공식을 여러번 수행할 필요가 없음
    static int sum(int a, int b) {
        return a + b;
    }
    // sum 메소드의 매개변수 개수를 다르게 해서 만들었으므로 오버로딩 관계가 성립
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static int sum(int ... val) { // 전개연산자-> 매개변수의 개수를 알 수 없는 경우 사용
        int sum = 0;
        for(int e : val) sum += e; // 매개변수가 배열로 들어옴
        return sum;
    }
    // 재귀 호출 : 메소드 자신이 자신을 호출 하는 것
    // 사용하는 경우 : 미로찾기 / 트리구조 탐색 등 탐색 알고리즘 관련
    // 단점 : 메모리에 부담이 걸림
    static int recFunc (int n) {
        if(n == 1) return 1; 
        return n + recFunc(n - 1);
    }
    // 기존 함수
    static int whileSum (int n) {
        int sum = 0;
        while(n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

}
