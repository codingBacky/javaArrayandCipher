package threejavaio;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDir {
	public static void main(String[] args) {
		String fileName = "c:/backhyeon";
		File file = new File(fileName);//폴더를 지정함
		if( file.isFile() ) {System.out.println("지정한 파일 정보 디렉터리가 아닙니다"); System.exit(1);};
		//System.exit(1)조기종료, 조기리턴(메서드, 함수에서 성능관련 중요함)
		File[] fileList = file.listFiles();//string 타입 or File타입 선택해서 지정해줌
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd aa hh:mm");
		int fileCount = 0;
		int dirCount = 0;
		long totalFileSize = 0;
		for( int i = 0; i < fileList.length; i += 1 ) {
			Date fileLastModifiedDate = new Date(fileList[i].lastModified());
			String strNowDate = simpleDateFormat.format(fileLastModifiedDate);
			String dirFileName = fileList[i].getName();
			if( fileList[i].isDirectory()) {//지금 읽은 이 객체가 Directory(폴더)인지
				dirCount++;
				System.out.printf("%s    %-15s %s%n", strNowDate, "<DIR>", dirFileName);
				
			}else { //File인지
				fileCount += 1;
				long fileSize = fileList[i].length();//파일 사이즈
				totalFileSize = totalFileSize + fileSize;
				System.out.printf("%s    %,20d %s\n", strNowDate, fileSize, dirFileName);
			}
			//System.out.println(">>>" + fileList[i].toString() );
//			
//			String fullName = fileList[i].toString();
//			int position = fullName.lastIndexOf(File.separator) + 1;
//			System.out.println( "실제 파일 목록 : " + fileList[i].toString().substring(position)/*.substring(fileName.length()) */);
//			//.toString() substring을 쓸수 없어서 추가해줌 (필터링)
//			//length를 쓰는 것보다 위에 써준게 더 좋은 방법
//			
			
		}
		System.out.printf("\t\t %d 개 파일  %,19d 바이트\n", fileCount, totalFileSize);
		System.out.printf("\t\t %d 개 디렉터리 %,16d 바이트 남음\n", dirCount, file.getFreeSpace());
		
		
//		System.out.println("포맷 지정 후 : " + strNowDate);
		
		/*String[] fileList = file.list();
		for( String file2 : fileList ) {
			System.out.println( file2 );
		}
		System.out.println("count : " + fileList.length);//숨겨진 것도 볼수 있음
		*/
	}

}
