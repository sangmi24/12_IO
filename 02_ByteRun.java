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
      * "����Ʈ ��� ��Ʈ��"
      * 
      * * ����Ʈ ��Ʈ�� : 1byte �����θ� ����� �� �� �ִ� ���� ���
      *  (XXXOutputStream/ XXXInputStream )
      * * ��� ��Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ���
      *    (�ܵ� ��� ����)
      *    
      * => "����Ʈ ��� ��Ʈ��" : �ܺθ�ü�� �����ϰ� �� �ܺθ�ü�� ���������� ����Ǵ� 1byte¥�� ���
      * 
      */
