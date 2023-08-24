package fourjavaexcetion;

public class ExceptionOneExam01 {
	public static void main(String[] args) {
		System.out.println( aa(0) );
	}
	private static int aa( int b ) /*throws ArithmeticException //java.lang.RuntimeException unchecked 예외,컴파일 과정에서는 발생하지 않음 */{//나를 호출한 곳으로 떠넘기겠다.
		int a =20;
		int result = 0;
		try {//발생할것 같은 연산
		//result = a/b;
			return a/b;
		}catch (ArithmeticException e) {
			System.err.println("나누는 숫자 잘못됨");//System.err 운영체게 파이프라인을 통해 로그파일로 저장가능
		}finally {//반드시 수행하는 구문, return문 보다 먼저 수행됨, Exception 발생 여부와 상관없이 수행됨
			System.out.println("뿅");
		}
		return result;
	}
}
