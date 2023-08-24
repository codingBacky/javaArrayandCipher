package onejavalang;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemExam {
	public static void main(String[] args) {
		/*
		System.out.println("-----------------------");
		System.exit(1);//jvm 자체가 끝나버린다. 비정상적인 종료일때 1, 정상적인 종료일때 0
		System.out.println("11111111111111111");
		*/
		/*
		Map<String, String> systemEnv = System.getenv();
		//System.getenv() -> OS와 관련된 정보
		Set<String> systemEnvironVarSet = systemEnv.keySet();//systemEnvironVar 환경변수
		Iterator<String> iter = systemEnvironVarSet.iterator();
		while( iter.hasNext()) {
			String mapKey = iter.next();
			System.out.println("환경변수 : " + mapKey + "---설정값" + systemEnv.get(mapKey));//key를 알면 값을 알수 있다.
		}
		*/
		System.out.println(System.getenv("Path"));
		System.out.println("------------------------------");
		Properties properti = System.getProperties();
		//System.getProperties() -> system에 어떤 속성값이 있는지, JVM에 설정된 속성 및 값을 얻고자 할 때
		Enumeration enumStr = properti.propertyNames();
		while( enumStr.hasMoreElements() ) {
			String pN = (String) enumStr.nextElement();//오브젝트 값으로 받기때문에 String으로 변경
			System.out.println( pN + " : " + properti.getProperty(pN) );//속성명 속성값
		}//속성값을 모르는 경우
		
		System.out.println("현재 동작하는 자바 버전 : " + System.getProperty("java.version"));//속성값을 알고 있을때
		}
}
