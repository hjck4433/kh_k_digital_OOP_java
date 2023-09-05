package 파이널실습1_텍스파일읽기;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReadTxtFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("d:/tmp/score.txt");
        }catch (IOException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
        Scanner sc = new Scanner(fis);
        List<StudentScore> studentList = new ArrayList<>();
        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] stArr = line.split(" ");
            Integer score = Integer.valueOf(stArr[1]) + Integer.valueOf(stArr[2]) + Integer.valueOf(stArr[3]);
            studentList.add(new StudentScore(stArr[0],score));
        }
        studentList.sort(new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore o1, StudentScore o2) {
                if(o1.getScore() < o2.getScore()) return 1;
                else if(o1.getScore() == o2.getScore()) {
                    return o1.getName().compareTo(o2.getName());
                }else return -1;
            }
        });

        for(StudentScore e : studentList) System.out.println(e.getName() + " " + e.getScore());


    }
}
class StudentScore {
    private String name;
    private int score;

    public StudentScore(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

}