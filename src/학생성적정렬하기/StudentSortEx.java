package 학생성적정렬하기;

import java.util.TreeSet;

// 미리 입력 받아 놓고 시작
// 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬하고 성적이 같으면 이름 순으로 정렬
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> list = new TreeSet<>();
        list.add(new Student("김사자", 90));
        list.add(new Student("설햄찌", 75));
        list.add(new Student("이토끼", 80));
        list.add(new Student("김거북", 75));
        list.add(new Student("최멍뭉", 65));


        for(Student e : list) System.out.println("이름 : " + e.name + ", 성적 : " + e.score);

    }
}
