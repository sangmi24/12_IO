package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		
		/*
		 * * ���� ��Ʈ��
		 * ��� ��Ʈ�� (�ܺθ�ü�� ���� ����Ǿ��ִ� ���) �� ������ ��ɵ��� 
		 * Ȯ���ų �� �ִ� ��Ʈ�� 
		 * ���� ��Ʈ���� �ܵ����� ����� �Ұ� (�ܵ����� ��ü ������ �Ұ�)
		 * 
		 * [ ǥ���� ]
		 * ������Ʈ��Ŭ������ ��ü��  = new ������Ʈ��Ŭ������(��ݽ�Ʈ����ü);
		 * 
		 * 1. BufferedXXX : �ӵ� ���� ��� �������� ����
		 * => ���� ������ �����ؼ� �ѹ��� ��Ƶ״ٰ� �Ѳ����� ������� ����
		 * 2. ObjectXXX : ��ü ������ ������� �� �ִ� ����� ����
		 * 
		 * * ������Ʈ���� ��ݽ�Ʈ���� ���� ���� (�޴ܾ� �������� )
		 * - ������Ʈ�� XXXReader  /XXXWriter �迭�̸� ��ݽ�Ʈ���� XXXReader/XXXWriter �迭
		 * - ������Ʈ�� XXXInput / XXXOutput �迭�̸� ��ݽ�Ʈ����  XXXInput / XXXOutput �迭
		 */
		
		BufferedDao bd= new BufferedDao();
		//bd.fileSave();
		bd.fileRead();
		
		

	}

}
