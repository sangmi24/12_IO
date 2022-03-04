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
	Book[] books = new Book[8]; // �̺κ� ��ħ : ����?? ��� �κп��� books�� ã���� ���� ������ �ʵ�κп� 
	                           //            ��ü�� ��������� �Ѵ�. 
	
	public BookDao() {
		
		books[0] = new Book("�޷���Ʈ �� ��ȭ��", "�̹̿�", "���丮����", "�Ҽ�", 12420);
		books[1] = new Book("�̵峪�� ���̺귯��", "��Ʈ ���̱�", "���÷翣��", "�Ҽ�", 	14220);
		books[2] = new Book("2022 �ó��� ����ó����� �ʱ�", "������", "���", "���輭", 29700);
		books[3] = new Book("Java�� ����", "���ü�", "��������", "IT", 27000);
		books[4] = new Book("������ �̰�����", "������", "�߾ӺϽ�", "�ؿܿ���", 14400);
		books[5] = new Book("��Ŀ�� ���� ���� ��ī", "���̺�� ��", "��Ŀ�����п�����", "����", 11610);
		books[6] = new Book("������ �� ����", "������", "��Ÿ�Ͻ�", "��", 10800);
		books[7] = new Book("����� ���� Ű��� �� �ȴ�", "������", "����", "�ݷ�����", 13320);
	}
	//���
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
		}catch ( EOFException e){  //�̺κ� ���� : �����Ѵٴ� �޼ҵ� ȣ�� 
			System.out.println("������ �� �о����ϴ�. ");
		 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
