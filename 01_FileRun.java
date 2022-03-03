package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;



public class FileRun {

	public static void main(String[] args) {
		
		// 간단하게 파일 만드는 과정 및 메소드들 사용하는거 연습
		// java.io.File 클래스를 가지고 작업
 	    
		
		try {
			//1. 별도의 경로 지정없이 파일명만 제시해서 생성해보기 
			// => 현재 작업하고 있는 이 프로젝트 폴더 내에 파일이 생성 (상대경로) 
		    File file1  = new File("test.txt");
		    file1.createNewFile();
		    
		    //2. 경로 지정을 한 파일명을 제시해서 생성해보기
		    //=> 존재하는 경로로 지정해야 함 (시작점이 정해져있기 때문에 절대경로)
		    File file2 = new File("C:\\aaa\\test.txt"); 
		    file2.createNewFile();
		    
		    //3. 폴더도 만들고 거기에 파일을 만드는 연습
		    File bbbFolder= new File("C:\\bbb");
	        bbbFolder.mkdir();	//폴더를 만들어주는 메소드(mkdir :make directory 약자)
	        File file3 = new File("C:\\bbb\\test.txt");
	        file3.createNewFile();
		    
	        //4. 별도의 경로 지정 없이 폴더를 생성 후 거기에 파일 생성하기
	        File folder = new File("test");  //상대경로
	        folder.mkdir();
	        File file = new File("test\\person.txt");  //상대경로 
	        file.createNewFile();	     
	        
	        // File 클래스에서 제공하는 메소드들
	        System.out.println("파일이 맞습니까? : "+ folder.isFile() ); //폴더이므로 false
	        System.out.println("파일이 맞습니까? : "+ file.isFile());  //파일이므로 true
 	        
	        System.out.println("파일명: "+file.getName());
	        System.out.println("상위폴더: "+ file.getParent());
	        System.out.println("파일용량: "+ file.length());
	        System.out.println("절대경로: "+file.getAbsolutePath());
    
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료.");
		
	}

}
/*
 * *프로그램 상의 데이터를 외부매체(모니터, 스피커, "파일" 등)로 출력하거나 
 *  입력장치로 (키보드, 마우스,"파일" 등) 로 입력받은 과정을 진행하고자 한다면
 *  반드시 프로그램과 외부매체 사이의 "통로"를 만들어야 한다.  => "스트림"
 * 
 * *스트림의 특징
 * 1.단방향  : 입력이면 입력, 출력이면 출력
 *           입력, 출력용 스트림이 각각 따로 존재(일방통행)
 *           즉, 동시에 입출력을 하고자 한다면 하나의 스트림으로는 안됨
 * 2.선입선출: 먼저 전달한 값이 먼저 도달하게 됨 (First In First Out : FIFO)
 * 3.Delay : 시간 지연 문제가 발생 가능함
 * 
 * *스트림 (클래스로 제공함) 구분
 * - 통로의 사이즈
 * > 바이트 스트림 : 1byte짜리가 이동할 수 있을 정도의 사이즈(좁은 통로)
 *   (입력 : XXXInputStream / 출력: XXXOutputStream ) 
 *   
 * > 문자 스트림 : 2byte 짜리가 이동할 수 있을 정도의 사이즈 (넓은 통로)
 *   (입력 : XXXReader / 출력 : XXXWriter )
 *   
 * - 외부매체와 직접적인 연결 여부
 * > 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로 
 * 
 * > 보조 스트림 : 기반 스트림 만으로 부족한 성능을 향상시켜주는 용도의 스트림 =>단독으로 사용 불가, 기반스트림이 필수 (외부매체와 직접 연결되는 개념이 아님! )
 *   (속도 향상, 자료형에 맞춰서 변환시켜준다거나, ... )
 *
 */

















