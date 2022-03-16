package com.hw2.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScoreProcess { 
		
	//학생별로 국어,영어,수학 성적을 입력하면 총합과 평균을
	//파일에 저장하는 메소드
	Scanner sc = new Scanner(System.in);
	
	public void scoreSave() {
		
	  int num = 0;  //학생을 구분할 변수
	  //try with resource구문으로 "score.dat"파일에 저장되게
	  //DateOutputStream 과   FileOutputStream을 생성
	  //output이 출력 	
	  // 먼저 기반스트림을 생성한다.
	  FileOutputStream fos= null;
	  //보조스트림을 생성한다.
	  DataOutputStream dos = null;
	  
	  try{
		dos=new DataOutputStream(new FileOutputStream("score.dat"));
		  		  
		while(true) {			
			System.out.println("===== 다음의 성적들을 입력하시오. =====");
			System.out.print("국어: ");  //int kor
			int kor=sc.nextInt();
			sc.nextLine();
			System.out.print("영어: ");  //int eng
			int eng=sc.nextInt();
			sc.nextLine();
			System.out.print("수학: ");  //int math
			int math=sc.nextInt();
			sc.nextLine();
			//sum(int)과 avg(double)를 도출 한 후 
			int sum= kor+eng+math;
			double avg = sum/3 ;
		  
			double avgS = 0.0;
			
			//위에 데이터들 순서대로 파일에 출력
			dos.writeInt(kor); //write Int를 붙이지 않았다.  
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			//dos.writeDouble(avgS);
			//avgS += avg;
			
			num++;
			
			//n번째 학생 정보 기록 출력
			System.out.println(num+"번째 학생 정보 기록");
			
			//Scanner sc = new Scanner(System.in);
			System.out.print("계속 저장하시겠습니까?(y/n) :");
			
			char answer =sc.nextLine().toUpperCase().charAt(0); 
			if(answer =='Y') {
				continue;
			}
		    else if(answer =='N')
			System.out.println("score.dat 파일에 저장 완료");
			break;
		}		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			dos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}		
	}
	
	//저장된 성적을 토대로 읽어와서 각 학생별 
	//과목별 점수와 총점 평균을 출력함
	public void scoreRead() {
	  
		int kor=0, eng=0, mat=0, sum=0;
		double avg=0.0, avgS=0.0;
		
		//avgS -> 모든 학생들의 점수 평균을 뜻하는 변수
		
		int count=0 ; //몇 명의 학생인지, or 반복문이 실행된 횟수(둘 다 같은 개념)
		
		
		//try with resource 구문을 이용하여 (DataInputStream, FileInputStream)
		//"score.dat" 파일과 연결통로 만들어 주고
		DataInputStream dis = null;
		FileInputStream fis = null;
		
		// dos=new DataOutputStream(new FileOutputStream("score.dat"));
		try {
		 //1.보조스트림객체 생성	
		 dis=new DataInputStream(new FileInputStream("score.dat"));
				 
		while(true) {
			//2.데이터에 입력된 순서대로 readxxx() 메소드를 통해 읽어온 값을
			//위의 (kor, eng, mat, sum, avg)에 담고 출력
			//그리고 avgS에 해당 학생의 avg값 추가
		   
			
			kor=dis.readInt();
			eng=dis.readInt();
			mat=dis.readInt();
			sum=dis.readInt();
			avg=dis.readDouble();
			//avgS=dis.readDouble();
			avgS += avg;
			
			count++;
			
			
			//"count번째 학생" 출력
			System.out.println(count +"번째 학생");
			//"국   영   수    총점   평균 " 출력
			System.out.println("국   영   수   총점   평균");
			System.out.println(kor+ " "+eng+ " "+mat+ " "+sum+ " "+avg);
			
		
		}
		//EOFException이 발생하면,
		//"읽은 횟수 전체 평균" 출력
		//데이터를 읽은 횟수(count), 전체 평균(avgS)에
		//대한 정보가 위의 구문 아래에 출력되게 함
		//"score.dat 파일 읽기 완료!" 문구 출력				 
		}
		catch (Exception e) {
			
			System.out.println("읽은 횟수 , 전체 평균 ");
			System.out.println(" "+count +"    "+ (avgS/count) );
			System.out.println("score.dat 파일 읽기 완료!");
		 }
		}
	}
	
	

