package onejavalang;

public class StringNStringBuffer {
	public static void main(String[] args) {
		String stringData = "a";
		for( char i = 'b'; i < 'z'; i++) {
			stringData += i; 
			//String 타입의 변수에 저장된 문자열이 변경이 빈번하게 된다면 string타입을 권장하지 않음
		}
		System.out.println(stringData);
		//stringData.reverse();
		String reverseStringData = new StringBuffer(stringData).reverse().toString();//.toString() 이나 +""하면 문자열로 바꾸기
		System.out.println(reverseStringData + "뒤집어짐");
		
		StringBuffer sbu = new StringBuffer(25);
		//StringBuffer(int capacity)사이즈 지정해줌, 자리를 만듦, 기본적으로 14의 자리가 있어 그 이상으로 쓸때만, 
		//지정한 사이즈보다 실제 글자 크기는 더 많이 들어간다. 그래도 capa를 여유있게 주는게 좋다. 
		//안써줘도 알아서 늘려주지만 이렇게 쓰는게 성능향상에 좋다.
		sbu.append("abcdefghijklmn");
		for( char i = 'b'; i < 'z'; i++) {
			sbu.append(i);
			//String 타입의 변수에 저장된 문자열이 변경이 빈번하게 된다면 string타입을 권장하지 않음
		}
		System.out.println(sbu);
		System.out.println(sbu.length());
		sbu.reverse();
		System.out.println(sbu);
		
		//char[] sbuArray = (sbu+"").toCharArray();
		//char[] sbuArray = new String(sbu).toCharArray();
		
//		String numStr = String.valueOf(123);
//		String numStr = 123+"";
		}
}
