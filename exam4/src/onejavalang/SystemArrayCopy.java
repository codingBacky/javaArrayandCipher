package onejavalang;

import java.util.Arrays;

public class SystemArrayCopy {
	public static void main(String[] args) {
		String[] source = "aa bb cc dd".split(" ");
		String[] copyArray = source;//공유함, 복사는 아님
		for( String str : source ) {
			System.out.printf("%s " , str);
		}
		System.out.println();
		for( String str : copyArray ) {
			System.out.printf("%s " , str);
		}
		source[0] = "backy";
		System.out.println();
		for( String str : source ) {
			System.out.printf("%s ", str);
		}
		System.out.println();
		for( String str : copyArray ) {
			System.out.printf("%s ", str);
		}
		//위의 내용은 복사가 아닌 공유 = 같은 배열을 공유하고 있다.
		//하나의 참조변수를 이용해서 값을 수정하면 
		//두개의 서로다른 참조 변수의 값으로 접근해도 값이 수정되는 것 처럼 보인다
		System.out.println();
		String[] ori = {"aa","bb","cc","dd","ee"};
		String[] cpa = new String[6];
		System.arraycopy(ori, 0, cpa, 1, ori.length);//index 1부터 입력
		ori[0] = "backy";
		System.out.println(Arrays.toString(ori));//for문 없이 Array안에 모든 값을 꺼내오기
		System.out.println(Arrays.toString(cpa));
		//주의사항
		//이 copy는 1차원 배열일 경우에는 간단하게 복사할 수 있다.
		//다차원 배열의 경우에는 복사가 보장되지 않는다.
		
		
	}

}
