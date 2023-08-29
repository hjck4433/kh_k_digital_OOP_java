package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

// Date() : 운영체제로 부터 날짜와 시간 정보를 가져와 원하는 포맷 형태로 출력, 객체를 생성해야 함
// 자바의 java.util 패키지에 포함 되어 있어 import를 해야 함
public class DateAndCal {
    public static void main(String[] args) {
        Date now = new Date();
//        System.out.println(now);
//        // 원하는 포맷으로 변경 하기
//        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//        System.out.println(sdf.format(now));
        // yyyy : 년도를 4자리로 표시
        // yy : 년도를 2자리로 표시
        // MM : 월을 표시 (대문자임에 유의, 월이 2자리로 표시됨) MM : 09 M : 9
        // HH : 24시간제
        // hh : 12시간제
        // mm : 분을 출력

        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

        // 정적 필드값을 가져옴
        Calendar cal = Calendar.getInstance(); // 운영체제로 부터 시간을 가져 옴
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // 인덱스임을 유의 해야 함 //0부터 시작
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 주에서 몇번 째 날인지 확인
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 월에서 몇번 째 날인지 확인
        System.out.println(cal.get(Calendar.AM_PM)); // 0: AM  1: PM
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        // Calendar 클래스로 yyyy년MM월dd HH시mm분ss초 포맷과 동일하게 출력 하기

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) +1;
        int day = cal.get(Calendar.DAY_OF_MONTH); // DATE 같음
        int hour = cal.get(Calendar.HOUR_OF_DAY); // HOUR로 하는 경우 PM값을 확인해서 + 12 해주기
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);

        System.out.printf("%d년%d월%d일 %02d시%02d분%02d초\n",year,month,day,hour,min,sec); //%02d = 1자리만 들어오면 앞에 0을 붙임

    }
}
