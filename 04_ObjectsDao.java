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
		
		//�⺻������ ���� : ��ü �������ְ� ��
		//=> ��ü ������ �� �ѹ� �����ϰ� ���� ������ �������� ���� 
		arr[0] = new Phone("������",1000000);
		arr[1] = new Phone("������",1300000);
		arr[2] = new Phone("�ø���",1500000);
		
	}

	//���
	public void fileSave(String fileName) {
		
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone("������",1000000);
		arr[1] = new Phone("������",1300000);
		arr[2] = new Phone("�ø���",1500000);
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
			
			//�������� : writeObject(��ü��)
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
	//�Է�
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))) {
			
			//�ݺ��� �̿��ؼ� �� �̾ƿ��⸸ �ϸ� ��
			while(true) {
				System.out.println(ois.readObject()/*.toString()*/);
				// readObject() �޼ҵ��  Object�������� ��ȯ����
				// PhoneŬ�������� toString() �޼ҵ带 �̹� �������̵� �߱� ������ �������ε��� ���ؼ�
				// ����ȯ�� ���� ���ص� �ڽĸ޼ҵ尡 ȣ��ɰ���! (������)
			}
			//EOFException :End Of File�� ����, IOException �� �ڽ�
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("������ �� �о����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
	}
}