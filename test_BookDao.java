package com.kh.test.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.test.model.vo.Book;

public class BookDao {
	Book[] books = new Book[8]; // 이부분 고침 : 왜지?? 출력 부분에서 books를 찾을수 없기 때문에 필드부분에 
	                           //            객체를 생성해줘야 한다. 
	
	public BookDao() {
		
		books[0] = new Book("달러구트 꿈 백화점", "이미예", "팩토리나인", "소설", 12420);
		books[1] = new Book("미드나잇 라이브러리", "매트 헤이그", "인플루엔셜", "소설", 	14220);
		books[2] = new Book("2022 시나공 정보처리기사 필기", "김정준", "길벗", "수험서", 29700);
		books[3] = new Book("Java의 정석", "남궁성", "도우출판", "IT", 27000);
		books[4] = new Book("프렌즈 싱가포르", "박진주", "중앙북스", "해외여행", 14400);
		books[5] = new Book("해커스 토익 기출 보카", "데이비드 조", "해커스어학연구소", "어학", 11610);
		books[6] = new Book("윤동주 전 시집", "윤동주", "스타북스", "시", 10800);
		books[7] = new Book("당신은 개를 키우면 안 된다", "강형욱", "혜다", "반려동물", 13320);
	}
	//출력
	public void fileSave(String fileName) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			for(int i = 0; i < books.length; i++) {
				oos.writeObject(books[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bookList.txt"))) {
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}catch ( EOFException e){  //이부분 생성 : 종료한다는 메소드 호출 
			System.out.println("파일을 다 읽었습니다. ");
		 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
