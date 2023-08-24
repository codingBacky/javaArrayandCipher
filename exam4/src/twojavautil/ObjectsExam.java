package twojavautil;

import java.util.Objects;

public class ObjectsExam {
	public static void main(String[] args) {
		String sb1 = new String("backy");
		String sb2 = new String("backy");
		System.out.println(sb1.equals(sb2));
		System.out.println(Objects.equals(sb1, sb2));
		System.out.println(Objects.deepEquals(sb1, sb2));
		int[] aa = { 1, 2, 3};
		int[] bb = {1,2,3};
		System.out.println(aa.equals(bb));
		System.out.println(Objects.equals(aa, bb));
		System.out.println(Objects.deepEquals(aa, bb));//데이터가 같으면 같은걸로 취급할게 ^.^
		String data1 = "backy";
		String data2 = null;
		String data3 = "";
		System.out.println(Objects.toString(data2));
		System.out.println(Objects.toString(data2, "상자에 내용이 비었습니다."));
		System.out.println("-----------------------------------");
		System.out.println(Objects.toString(data3));
		System.out.println(Objects.toString(data3, "상자에 내용이 비었습니다."));//null일때만 대체해줄 수 있음
		System.out.println("-----------------------------------");
	}
}
