package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	
	// 프로그램 -->외부매체(파일)
	// 출력   ,문자 기반 스트림
	public void fileSave() {
		
		//FileWriter: 파일로 데이터를 2byte단위로 출력해주는 스트림 
		
		//0. 나중에 자원 반납할거에 대비해서 미리 선언 및 null로 초기화
		FileWriter fw = null;
		
				
		try {
			//1. FileWriter 스트림 객체 생성 (통로 만들겠다. )
			// 출력스트림의 경우는 파일이 없어도 제시 가능 (알아서 만들어 주고나서 통로가 연결됨)
			// 1)io 오류-try-catch 생성
			fw = new FileWriter("b_char.txt");
			
			//2. 2byte 단위로 데이터를 파일로 출력시키기 (한글 가능함) : write() 메소드 사용
			fw.write('A');
			fw.write('김');
			fw.write('\n');
			fw.write("와...IO재밌다..ㅎㅎ"); //문자 하나씩 쪼개서 이동 //오버로딩
			//close안시키면 출력 안됨
			
			//오버로딩된 다른 형태
			//char[] 배열로 넘기기
			char[] cArr = {'k','i','w','i'};
			fw.write(cArr);
			
		} catch (IOException e) {			
			e.printStackTrace();
			
		} finally {
			//3. 다 쓴 스트림 자원 반납 : close()메소드 사용
			//2)io오류 -try-catch 생성
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// 프로그램 <-- 외부매체 (파일)
	// 입력
	public void fileRead() {
		
		//FileReader : 파일로부터 데이터를 2byte 단위로 입력받는 스트림
		
		// 0. 나중에 자원반납할거에 대비해서 미리 선언 및 null로 초기화
		FileReader fr = null;
		
		try {
			// 1. fileReader 객체 생성 (통로 만들겠다.)
			//=> 입력의 경우는 항상 존재하는 파일명을 작성해야 함
			//1) 오류: FileNotFoundException나서 try-catch로 묶어줘야 함
			fr = new FileReader("b_char.txt");
			
			//2. 파일로부터 읽어들이기 : read() 메소드 사용
			//2) 오류:  IOException 나서 (try-)catch 사용
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read()); //개행문자는 아스키코드로  10 (LF :Line Feed)
			*/
			// read() 메소드는 더 이상 불러올 값이 없을 경우 -1을 반환
			//반복문 활용
			// 해결방법 1. 일단 몇번 돌릴지 모르니까 무한으로 돌려놓고 -1  나오면 그때 관두겠다.
			/*
		   int value = 0;
		   while(true) {	   
			   value = fr.read();
			   
			   if(value == -1) {
				   break;
			   }
			   System.out.println(value);
		   }
		   */
		// 해결방법 2. 신박한 방법 (조건식 안에 대입구문도 같이 쓰는 방법)
			int value = 0;
			while((value = fr.read()) != -1 ) {
				
				System.out.println(value);
			}
			
			
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 스트림 자원 반납 : close() 메소드 사용
			//3) 오류:IOException 나서 try-catch 사용 
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}




