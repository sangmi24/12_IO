package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class ByteRun {

	public static void main(String[] args) {
		
		FileByteDao fb =new FileByteDao();
		
		//fb.fileSave();
		  fb.fileRead();
		
		
		
	}
}

     /*
      * "바이트 기반 스트림"
      * 
      * * 바이트 스트림 : 1byte 단위로만 입출력 할 수 있는 좁은 통로
      *  (XXXOutputStream/ XXXInputStream )
      * * 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
      *    (단독 사용 가능)
      *    
      * => "바이트 기반 스트림" : 외부매체를 지정하고 그 외부매체와 직접적으로 연결되는 1byte짜리 통로
      * 
      */
