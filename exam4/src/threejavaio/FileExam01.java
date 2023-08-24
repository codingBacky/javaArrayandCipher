package threejavaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExam01 {
	public static void main(String[] args)  {
		//외부 자원을 이용할 경우 반드시 exception처리를 해줘야함
		//exception 떠넘기거나(호출한 곳으로 exception 처리를 넘기겠다)throws jvm
		//잡아서 해결하는 방법이 있다.
		FileReader fis;
		FileWriter fw;
		char[] readDataArr = new char[10000];//buffer을 사용하는 것보다 자리를 넉넉히 주면 ,, 하지만 파일 
		int readCount = -9999;//-1제외한 모든숫자 가능
		try {
			fis = new FileReader(args[0]);
			fw = new FileWriter(args[1]);
			
			StringBuilder aaa = new StringBuilder(40);
			while( (readCount = fis.read(readDataArr)) != -1) {//readDataArr을 읽어들여서 != 1 일때 까지 반복
				for( int i = 0; i < readCount; i++ ) {//readDataArr.length 쓰레기가 남음
					fw.write(readDataArr, 0, readCount);
					//System.out.print(readDataArr[i]);
					//aaa.append(readDataArr[i]);
					//fw.write(readDataArr[i]);//파일을 만들어서 저장
					//aaa.append(readDataArr[i]);//출력
				}
				//fw.write(aaa.toString());
				//System.out.println(aaa);
				fis.close();//자원 반납
				fw.close();//자원 반납
				
			/*
			int readCount = fis.read(readDataArr);//실제 읽어들인 자료는readDataArr에 저장 readCount에 개수 저장
			for( char aaa : readDataArr ) {
			System.out.print(aaa);
			}
			*/
			}
		} catch (FileNotFoundException e) {//하위 exception에서 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			//상위 exception으로 잡아줘야 한다. 반대로 하면 이미 예외를 다 잡았기 때문에 아래는 의미가 없다.
			e.printStackTrace();
		}
		
	}
}
	