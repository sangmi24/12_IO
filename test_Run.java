package com.kh.test.run;

import java.util.Scanner;

import com.kh.test.model.dao.BookDao;

public class Run {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	BookDao bookDao = new BookDao();
	bookDao.fileSave("bookList.txt");
	System.out.println("*** ���� ��ȸ ���α׷� ***");
	while(true) {
		System.out.print("���� ����� Ȯ���Ͻðڽ��ϱ�?(y/n) :");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.println("���� ����� Ȯ�����Դϴ�.");
			System.out.println("-------------------");
			bookDao.fileRead();
			System.out.println("-------------------");
			break;			
		} else if(answer == 'n' || answer =='N') {
			System.out.println("����");
			break;
		}else {
			System.out.println("�ùٸ��� ����");
		}	
		
	}  System.out.println("���α׷��� �����մϴ�.");
	
		

	}

	}


