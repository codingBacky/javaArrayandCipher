package threejavaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileSimpleCopy {
	public static void main(String[] args) {
		if( args.length != 2 ) {
			System.out.println("원본과 복사할 파일명 2개가 필요합니다.");
			System.exit(1);//비정상적 종료
		}
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte[] realReadData = new byte[1024*4];//4KB단위로 복사하겠다.
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			int readSize;
			while( (readSize = fis.read(realReadData)) != -1 ) {//읽을 자료가 없을때까지 없으면 -1임, byte int타입으로 반환
//				readData = readData - 1;//한번에 읽으면 안됨, -1 원본을 복원해서 보여줌
				fos.write(realReadData, 0, readSize);//읽는 속도를 빠르게 하겠다면 이렇게
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			fis.close();여기에다 해주고 try catch 해주는게 정석
//			fos.close();
		}
		
		
		
	}
}
