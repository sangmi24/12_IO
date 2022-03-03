package com.kh.chap04_assist.part02_Object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_Object.model.vo.Phone;

public class ObjectDao {

	// ���α׷� --> �ܺθ�ü (����)
	//���
	public void fileSave(String fileName) {
		
		// ���Ϸ� ������ �׽�Ʈ Phone ��ü ����
		Phone ph= new Phone("������",1000000);
		
		// ������Ʈ�� ��ü�� try ~ with~resource �����ȿ��� ��ť�� ����
		// ObjectOutputStream :  ��ü ������ ���Ϸ� ��½� �������ִ� ��Ʈ�� (������Ʈ��)
		// FileOutputStream : ���Ͽ� �����͸� ������ִ� ��Ʈ��( ��ݽ�Ʈ��)
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			//��ü ������ ���Ͽ� ������ִ� �޼ҵ� : ObjectOutputStream Ŭ�������� �����ϴ� writeObject(��ü��);
			oos.writeObject(ph);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
	// ���α׷� <-- �ܺθ�ü (����)
	// �Է�
	public void fileRead() {
		// ObjectInputStream : ��Ʈ�����κ��� ��ü ������ �Է¹ޱ����� ���Ǵ� ������Ʈ��
		// FileInputStream : ���Ϸκ��� �����͸� �о���̱� ���ؼ� ���Ǵ� ��ݽ�Ʈ��
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_Object.txt "))){
			
			//��ü ������ �Է¹޴� �޼ҵ�: ObjectInputStream Ŭ�������� �����ϴ� readObject() �޼ҵ� ���
			Phone ph =(Phone)ois.readObject(); //�������� ���� �θ��� Object�� �ڽ����� ����ȯ(����)
			System.out.println(ph);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
}
