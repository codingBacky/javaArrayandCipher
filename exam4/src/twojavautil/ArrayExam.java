package twojavautil;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class ArrayExam {
	public static void main(String[] args) {
		String[] sourceArr = "aa bb cc dd".split(" ");
		System.out.println(Arrays.toString(sourceArr));//간편하게 배열의 내용을 볼수 있다.
		System.out.println(sourceArr.toString());
		String[] copyArr = Arrays.copyOf(sourceArr, 3/*sourceArr.length*/);
		sourceArr[0] = "qq";
		System.out.println(Arrays.toString(sourceArr));
		System.out.println(Arrays.toString(copyArr));
		String[] cpyArrRange = (Arrays.copyOfRange(sourceArr, 1,4));
		System.out.println(Arrays.toString(sourceArr));
		System.out.println(Arrays.toString(cpyArrRange));
		sourceArr = "qq ss ee ff gg".split(" ");
		System.out.println(Arrays.toString(sourceArr));
		Arrays.sort(sourceArr);//정렬, quick sort 알고리즘을 사용한다.
		System.out.println(Arrays.toString(sourceArr));
		sourceArr = "qq ss ee ff gg".split(" ");
		System.out.println(Arrays.toString(sourceArr));
		System.out.println(Arrays.binarySearch(sourceArr, "ff"));//문자열의 위치를 반환
		Arrays.sort(sourceArr);
		System.out.println(Arrays.binarySearch(sourceArr, "ff"));
		//원본을 유지하고 싶은 상태에서 binarySearch 검색을 하고 싶으면 
		//우선 복사본을 만들어 정렬을 하고 그 복사본에서 이진검색을 하는 것이 좋다. 
		
		int[] inArr = new int[30];
		Arrays.fill(inArr, 0);//초기값이 이미 0이라 의미 없다.
		Arrays.fill(inArr, 50);
		System.out.println(Arrays.toString(inArr));
		Arrays.fill(inArr, 1, 10, 30);//1부터 9까지 30으로 채우기
		System.out.println(Arrays.toString(inArr));
		
		System.out.println("-------------------------------");
		int[][] aa = {{1,2,3},{4,5},{6}};
		int[][] bb = {{1,2,3},{4,5},{6}};
		int[] cc = {1,2,3};
		int[] dd = {1,2,3};
		System.out.println(Objects.deepEquals(aa, bb) + "   <= 다차원배열 ObjectClass 깊은equals");
		System.out.println(Objects.deepEquals(cc, dd) + "   <= 1차원배열 ObjectClass 깊은equals");
		System.out.println(Arrays.deepEquals(aa, bb) + "   <= 다차원배열 ArraysClass 깊은equals");
		System.out.println(Arrays.equals(aa, bb) + "   <= 다차원배열 ArraysClass 얉은equals");
		System.out.println(Arrays.equals(cc, dd) + "   <= 1차원배열 ArraysClass 얉은equals");
//		System.out.println(Arrays.deepEquals(cc, dd));//다차원에서만 가능해서 오류가 생김
		System.out.println("내가 만든 equals 결과 : " + myEquals(cc,dd));
		
		String uniqueId = UUID.randomUUID().toString();
		System.out.println("중복되지 않는 숫자 생성 : " + System.nanoTime());
		System.out.println("전세계적으로 중복되지 않는 문자열 생성 : " + uniqueId);
		System.out.println("전세계적으로 중복되지 않는 문자열 생성 : " + UUID.randomUUID());
		//이 안에 들어가면 toString 안써도됨 println이 문자로 출력함
	}
	
	public static boolean myEquals(int[] arr1, int arr2[]) {
		for( int i = 0; i < arr1.length; i++) {
			if( arr1[i] != arr2[i] ) return false;// return false 호출했던 곳으로 되돌아감
		}
		return true;
	}
	
}
