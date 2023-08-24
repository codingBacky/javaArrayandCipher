package fourjavaexcetion;

public class ProjectDefineException extends RuntimeException {
	//개발자 정의 exception 타입 선택 RuntimeException(unchecked)/Exception(checked)
	public ProjectDefineException() {
		super();
		System.err.println("이 프로젝트에서 무엇인가 문제가 발생했습니다.");
	}
	public ProjectDefineException(String message) {
		System.err.println(message);
		System.err.println("이 프로젝트에서 무엇인가 문제가 발생했습니다.");
	}
}
