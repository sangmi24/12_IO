package com.kh.chap04_assist.part02_Object.run;

import java.util.Scanner;

import com.kh.chap04_assist.part02_Object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_Object.model.dao.ObjectsDao;

public class ObjectRun {

	public static void main(String[] args) {
		
		ObjectDao od = new ObjectDao();
		/*
		//����ڰ� ���ϴ� ���ϸ����� ���� �Է¹ް�  �Ѱ��ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���ϸ��� �Է��ϼ���: ");
		String fileName = sc.nextLine();
		
		od.fileSave(fileName);
		//��ü ������ ��ϵǾ� �־ ���� �������� �� ����Ȱ�!
		*/
		
		//od.fileRead(); 
		
		ObjectsDao ods = new ObjectsDao();
		//ods.fileSave("phones.txt"); //fileName=>���� �̸� ������phone.text��
		ods.fileRead();
	}

}
