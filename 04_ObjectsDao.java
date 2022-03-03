package com.kh.chap04_assist.part02_Object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_Object.model.vo.Phone;

public class ObjectsDao {
	Phone[] arr = new Phone[3];
	
	public ObjectsDao() {
		
		//기본생성자 역할 : 객체 생성해주고 끝
		//=> 객체 생성시 단 한번 실행하고 싶은 내용을 적을수는 있음 
		arr[0] = new Phone("아이폰",1000000);
		arr[1] = new Phone("갤럭시",1300000);
		arr[2] = new Phone("플립폰",1500000);
		
	}

	//출력
	public void fileSave(String fileName) {
		
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone("아이폰",1000000);
		arr[1] = new Phone("갤럭시",1300000);
		arr[2] = new Phone("플립폰",1500000);
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
			
			//내보내기 : writeObject(객체명)
			/*
            oos.writeObject(arr[0]);			
            oos.writeObject(arr[1]);			
            oos.writeObject(arr[2]);			
			*/
			for(int i=0; i< arr.length ; i++) {
				oos.writeObject(arr[i]);
			}
	
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	//입력
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))) {
			
			//반복문 이용해서 잘 뽑아오기만 하면 됨
			while(true) {
				System.out.println(ois.readObject()/*.toString()*/);
				// readObject() 메소드는  Object형식으로 반환해줌
				// Phone클래스에서 toString() 메소드를 이미 오버라이딩 했기 때문에 동적바인딩에 의해서
				// 형변환을 굳이 안해도 자식메소드가 호출될것임! (다형성)
			}
			//EOFException :End Of File의 약자, IOException 의 자식
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일을 다 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}