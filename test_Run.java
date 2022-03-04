package com.kh.test.run;

import java.util.Scanner;

import com.kh.test.model.dao.BookDao;

public class Run {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	BookDao bookDao = new BookDao();
	bookDao.fileSave("bookList.txt");
	System.out.println("*** 도서 조회 프로그램 ***");
	while(true) {
		System.out.print("도서 목록을 확인하시겠습니까?(y/n) :");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.println("도서 목록을 확인중입니다.");
			System.out.println("-------------------");
			bookDao.fileRead();
			System.out.println("-------------------");
			break;			
		} else if(answer == 'n' || answer =='N') {
			System.out.println("도서");
			break;
		}else {
			System.out.println("올바르지 않음");
		}	
		
	}  System.out.println("프로그램을 종료합니다.");
	
		

	}

	}


