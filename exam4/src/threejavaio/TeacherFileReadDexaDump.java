package threejavaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TeacherFileReadDexaDump {
	  	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      System.out.println("덤프할 파일명을 입력하세요");
	      String dumpfileName = scan.next();
	      System.out.println("1 line에 덤프할 byte의 개수를 입력하세요");
	      int dumpCount = scan.nextInt();
	      
	      FileInputStream fis =null;
	      byte[] readData = new byte[dumpCount];
	      
	      
	      try {
	         fis = new FileInputStream(dumpfileName);
	         int readCount ;
	         while( (readCount = fis.read(readData) ) != -1) {
	            for(byte aaa : readData) {
	               System.out.printf("%02X " , aaa);
	            }
	            System.out.println();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      }finally {
	         if( fis != null) {try { fis.close();} catch (IOException e) {} }
	         
	      }
	   }


}
