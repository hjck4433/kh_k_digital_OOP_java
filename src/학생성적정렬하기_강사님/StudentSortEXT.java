package 학생성적정렬하기_강사님;

import java.util.TreeSet;

public class StudentSortEXT {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("안유진", 95));
        info.add(new StudentInfo("장원영", 77));
        info.add(new StudentInfo("이서", 88));
        info.add(new StudentInfo("레이", 77));
        info.add(new StudentInfo("가을", 77));
        for(StudentInfo e : info) {
            System.out.print(e.name + " ");
        }

    }
}
class StudentInfo implements Comparable<StudentInfo> {
    String name;
    int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.score < o.score) return 1; //내림차순 정렬
        else {
            return this.name.compareTo(o.name); // 사전순 정렬
        }
    }
}
