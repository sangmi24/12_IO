package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		
		/*
		 * * 보조 스트림
		 * 기반 스트림 (외부매체와 직접 연결되어있는 통로) 의 부족한 기능들을 
		 * 확장시킬 수 있는 스트림 
		 * 보조 스트림은 단독으로 사용이 불가 (단독으로 객체 생성이 불가)
		 * 
		 * [ 표현법 ]
		 * 보조스트림클래스명 객체명  = new 보조스트림클래스명(기반스트림객체);
		 * 
		 * 1. BufferedXXX : 속도 성능 향상 목적으로 쓰임
		 * => 버퍼 공간을 제공해서 한번에 모아뒀다가 한꺼번에 입출력을 진행
		 * 2. ObjectXXX : 객체 단위로 입출력할 수 있는 기능을 제공
		 * 
		 * * 보조스트림과 기반스트림의 결합 기준 (뒷단어 기준으로 )
		 * - 보조스트림 XXXReader  /XXXWriter 계열이면 기반스트림도 XXXReader/XXXWriter 계열
		 * - 보조스트림 XXXInput / XXXOutput 계열이면 기반스트림도  XXXInput / XXXOutput 계열
		 */
		
		BufferedDao bd= new BufferedDao();
		//bd.fileSave();
		bd.fileRead();
		
		

	}

}
