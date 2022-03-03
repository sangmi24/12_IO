package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	
	// ���α׷� -->�ܺθ�ü(����)
	// ���   ,���� ��� ��Ʈ��
	public void fileSave() {
		
		//FileWriter: ���Ϸ� �����͸� 2byte������ ������ִ� ��Ʈ�� 
		
		//0. ���߿� �ڿ� �ݳ��Ұſ� ����ؼ� �̸� ���� �� null�� �ʱ�ȭ
		FileWriter fw = null;
		
				
		try {
			//1. FileWriter ��Ʈ�� ��ü ���� (��� ����ڴ�. )
			// ��½�Ʈ���� ���� ������ ��� ���� ���� (�˾Ƽ� ����� �ְ��� ��ΰ� �����)
			// 1)io ����-try-catch ����
			fw = new FileWriter("b_char.txt");
			
			//2. 2byte ������ �����͸� ���Ϸ� ��½�Ű�� (�ѱ� ������) : write() �޼ҵ� ���
			fw.write('A');
			fw.write('��');
			fw.write('\n');
			fw.write("��...IO��մ�..����"); //���� �ϳ��� �ɰ��� �̵� //�����ε�
			//close�Ƚ�Ű�� ��� �ȵ�
			
			//�����ε��� �ٸ� ����
			//char[] �迭�� �ѱ��
			char[] cArr = {'k','i','w','i'};
			fw.write(cArr);
			
		} catch (IOException e) {			
			e.printStackTrace();
			
		} finally {
			//3. �� �� ��Ʈ�� �ڿ� �ݳ� : close()�޼ҵ� ���
			//2)io���� -try-catch ����
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// ���α׷� <-- �ܺθ�ü (����)
	// �Է�
	public void fileRead() {
		
		//FileReader : ���Ϸκ��� �����͸� 2byte ������ �Է¹޴� ��Ʈ��
		
		// 0. ���߿� �ڿ��ݳ��Ұſ� ����ؼ� �̸� ���� �� null�� �ʱ�ȭ
		FileReader fr = null;
		
		try {
			// 1. fileReader ��ü ���� (��� ����ڴ�.)
			//=> �Է��� ���� �׻� �����ϴ� ���ϸ��� �ۼ��ؾ� ��
			//1) ����: FileNotFoundException���� try-catch�� ������� ��
			fr = new FileReader("b_char.txt");
			
			//2. ���Ϸκ��� �о���̱� : read() �޼ҵ� ���
			//2) ����:  IOException ���� (try-)catch ���
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read()); //���๮�ڴ� �ƽ�Ű�ڵ��  10 (LF :Line Feed)
			*/
			// read() �޼ҵ�� �� �̻� �ҷ��� ���� ���� ��� -1�� ��ȯ
			//�ݺ��� Ȱ��
			// �ذ��� 1. �ϴ� ��� ������ �𸣴ϱ� �������� �������� -1  ������ �׶� ���ΰڴ�.
			/*
		   int value = 0;
		   while(true) {	   
			   value = fr.read();
			   
			   if(value == -1) {
				   break;
			   }
			   System.out.println(value);
		   }
		   */
		// �ذ��� 2. �Ź��� ��� (���ǽ� �ȿ� ���Ա����� ���� ���� ���)
			int value = 0;
			while((value = fr.read()) != -1 ) {
				
				System.out.println(value);
			}
			
			
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. ��Ʈ�� �ڿ� �ݳ� : close() �޼ҵ� ���
			//3) ����:IOException ���� try-catch ��� 
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}




