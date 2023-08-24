package threejavaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TeacherBinaryFileMultiConversioniRecoveryCopy {
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      System.out.println("원본 파일명을 입력하세요");
	      String sourceFileName = scan.next();
	      System.out.println("복원 파일명을 입력하세요");
	      String recoverFileName = scan.next();
	      System.out.println("확장했던 size를 입력하세요[5-30]");
	      int extendSize = scan.nextInt();
	      
	      FileInputStream fis =null;
	      FileOutputStream fos = null;
	      byte[] readData = new byte[extendSize];
	      
	      
	      try {
	         fis = new FileInputStream(sourceFileName);
	         fos = new FileOutputStream(recoverFileName);
	         int readCount ;
	         while( (readCount = fis.read(readData) ) != -1) {
	            int recoverData = readData[readData[0]-80]-(readData[1]-80);
	            fos.write(recoverData);
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      }finally {
	         if( fis != null) {try { fis.close();} catch (IOException e) {} }
	         if( fos != null) {try { fos.close();} catch (IOException e) {} }
	         
	      }
	   }

}
