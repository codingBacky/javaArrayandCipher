package fourjavaexcetion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam02 {
	public static void main(String[] args) /*throws ArithmeticException*/{//JVM -> OS
		ExceptionExam02 obj = new ExceptionExam02();
		obj.Aclassaaa();
		/*
			try {
				FileInputStream fis = new FileInputStream("aa.txt");
			} catch (FileNotFoundException e) {
				//checked exception은 unchecked exception으로 변경ㅇ해서 보고하는 방식, 기본 패턴 룰
				throw new ArithmeticException();
			}
		*/
	}
	public void Aclassaaa() {//메모리상에 만들어져야 static 에서 호출 가능하다.
		Bclassbbb();
	}
	public void Bclassbbb() {
		Cclassccc();
	}
	public void Cclassccc() throws ProjectDefineException {//다른클래스에서 exception을 던지면 찾기 어려움, 
		
		try {
			FileInputStream fis = new FileInputStream("aa.txt");
		} catch (FileNotFoundException e) {
			//exception 처리 후
			System.exit(1);//exception처리를 잘못(보고, 잡아서처리)하면 이렇게 종료하는 것 보다 더 나쁜 프로그램이 될 수 있다.
			throw new ProjectDefineException("C 클래스의 ccc메서드 처리도중 파일이 발견되지 않아 발생한 오류");//unchecked runtime exception 으로 변경 한 후에 던진다.(보고)
			//프로젝트에서 정해준 exception으로 처리해야한다.
		}
			
	}
}
