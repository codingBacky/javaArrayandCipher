package twojavautil;

import java.util.Calendar;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getYear() + 1900 + "년");
		System.out.println(now.getMonth() + 1 + "월");
		System.out.println(now.getDate() + "일");
		System.out.println(now.getDay() + "주중에서 -일째 되는날");
		System.out.println("1970년 1월 1일 00시를 기준으로 " + now.getTime()/1000 + "초 지났습니다.");//1970년 기준으로
		Date dayInfo = new Date(now.getTime() + (1000*60*60*24*365L));//365일 이후는 언제일까 1000=>1초
		System.out.println(dayInfo);
		System.out.println("------------------------------");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
	}
}
