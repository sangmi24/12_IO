package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	// BufferedReader 입력 / BufferedWriter 출력
	
	// 프로그램 --> 외부매체 (파일)
	// 출력 BufferedWriter
	public void fileSave() {
		
		//0. 객체 선언 및 null 로 초기화
		BufferedWriter bw = null;
		FileWriter fw=null;
		
		//1)io오류 ->try-catch
		try { // 1,2번이 통로 만든거 
			//1.기반스트림 객체 생성 (보조스트림 객체를 만들기 위한 준비물)
			 fw= new FileWriter("c_buffer.txt");
			 
			//2. 보조스트림 객체 생성(단독으로 존재 불가)  // 이줄 추가 함
			 bw = new BufferedWriter( fw );
			 
			// 3. 파일로 데이터 내보내기 : BufferedWriter 클래스에 있는  write() 메소드 사용
			 bw.write("안녕하세요.");
			 //bw.write("\n");
			 bw.newLine(); //자동으로 개행을 넣어주는 메소드 
			 bw.write("반갑습니다.\n");
			 bw.write("저리가세요.");
			 
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//3.다 쓴 스트림 자원 반납 : 자원 반납의 순서는 객체 생성의 역순
			//2) 오류 -> try/catch
		}
		
		
	}
	// 프로그램 <-- 외부매체 (파일)
	// 입력 (BufferedReader)
	public void fileRead() {
		/*
		//0. 자원반납을 위한 선언 및 초기화
		BufferedReader br=null;
		
		
		try {
			//1.보조스트림객체를 생성(매개변수로 기반도 생성해서 한큐에 넣어보자)
			br= new BufferedReader(new FileReader("c_buffer.txt"));
			
			//2. 데이터를 파일로부터 읽어들여오기 : readLine() 메소드  (한줄 단위로 깔끔히 작성됨)
			 System.out.println(br.readLine());
			 System.out.println(br.readLine());
			 System.out.println(br.readLine());
			 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. 자원 반납
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		//try~ with ~ resource 구문(jdk7버전 부터 사용 가능)
		/*
		 * [ 표현법 ]
		 * try(스트림객체생성구문; 객체생성구문) {
		 *     //예외가 발생할법한 구문
		 * } catch (예외선언 구문){
		 *    // 예외 발생시 실행할 구문
		 * }
		 * => 가장 큰 장점은 알아서 자원 반납이 된다. (finally 안씀)
		 */
		
		try(BufferedReader br=new BufferedReader(new FileReader("c_buffer.txt"))){
		    
			//입력받는 구문만 잘 작성하면 됨
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
