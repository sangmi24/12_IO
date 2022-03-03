package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO (Data Access Object)
//�����Ͱ� �����Ǿ��ִ� ������ ���� �����ؼ� �����͸� ��������ִ� �뵵�� Ŭ����
public class FileByteDao {

	//���α׷� --> �ܺθ�ü (����)
	//���: ���α׷� ���� �����͸� ���Ϸ� �������� (��, ���Ͽ� ����ϰڴ�.) ����Ʈ ��� ��Ʈ��
	public void fileSave() { 
		
		// FileOutputStream : "����"�� �����͸� 1byte ������ ������ִ� ��Ʈ��
		
		// ���� ��θ� ����ڴ� == ��Ʈ�� ��ü�� �����ϰڴ�.
		FileOutputStream fout = null;
		try {
			//1. FileOutputStream ��ü ����
			//=> �ش� ���ϰ� ���� ����Ǵ� 1byte ¥�� ��� ��Ʈ���� ����ڴ�.
			//=> ��ü ������ ��� ���ϰ� �����Ұ��� ���ϸ��� �����ϵ�, ���࿡ ���� �������� �ʴ� ���ϸ��� �����ϸ�
			//   �˾Ƽ� ������ �����ǰ� ��ΰ� ����������
			//=> �����ϴ� �����̶�� �׳� �ٷ� ��ΰ� ����������
			// new FileOutputStream�κп� ���� �߸� -throws => try-catch�� �������ش�
		    //FileOutputStream fout = new FileOutputStream("a_byte.txt" ); //()�ȿ� �Ű������� ���ϸ� ����� 
			fout = new FileOutputStream("a_byte.txt" , true );
			//�ɼ�: �̾�� �ɼ� (true:�̾�� / false:�����, �⺻��)
			
		    //2. ���� ��η� �����͵� ���: write() �޼ҵ� ���
		    // 1byte ����: -128~ 127
		    // (��, ���Ͽ� ��ϵ� ������ �ش� ������ ������ ���ڰ� ��ϵ�)
		    //=> �ƽ�Ű�ڵ�ǥ: 0 ~ 127 (������ �Ұ���)
		    fout.write(97);  //'a'�� ���
		    fout.write('b'); //'b'�� ��� / int�� char �� ����ȯ�� �Ǽ� ������
		    fout.write('��');  // �ѱ��� 2byte�̱� ������ ������ ���� (����Ʈ ��Ʈ�����δ� �ѱ��� �������µ� �������� ����)
            
		    //�����ε��� ���·� byte �迭�� �Ű������� ���޵� ����
		    byte[] bArr = {99,100,101};
		    fout.write(bArr); //'c','d','e' ���
		    
		    //bArr �迭�� 1�� �ε����κ��� 2���� ���� ��½�Ű�ڴ�. (�����ε�)
		    fout.write(bArr, 1, 2); // d','e' ���
		    
		    //3. ��Ʈ���� �� �̿������� �ڿ��� �ݳ��ϱ� (== ������θ� ���ڴ�) : �ݵ�� 
		    // => close() �޼ҵ� ȣ��
		    // 1) fout.close(); ��� �ݵ�� ���°Ŷ� finally�� ���� �� 
		    
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally { //� ���ܰ� �߻��ϴ� ����, ���ܰ� �߻����� �ʴ� ���� �ݵ�� �����ϴ� ��
			
			//3. ��Ʈ���� �� �̿������� �ڿ��� �ݳ��ϱ� (== ������θ� ���ڴ�) : �ݵ�� 
	          // => close() �޼ҵ� ȣ��
			  // 2)�� ���� => fout�� �� ã�� try���� fout������ ������ ����=> 3)�� ���� => try-catch��  
		         try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	   // ���α׷� <-- �ܺθ�ü (����)
	   // �Է� : ���Ϸκ��� �����͸� �������ڴ�. 
	public void fileRead() {
		
		//FileInputStream : ���Ϸκ��� �����͸�  1byte������ �Է¹޴� ��Ʈ��
		
		//0. ���߿� �ڿ��ݳ��Ұſ� ����ؼ� �̸� ���� �� �ʱ�ȭ�� �صа�
		FileInputStream fin=null;
		
		
		
		try {
			//1. FileInputStream ��ü ����(���� ��θ� ���ڴ�. �����Ű�ڴ�.)
			// FileOutputStream ������ ���� ������ �����ص� �� ��
			// FileInputStream ������ ���� ������ �����ϸ� �ٷ� ������ ��! (�ִ� ���Ϸθ� �ۼ�)
			fin = new FileInputStream("a_byte.txt");
			
			//2. ��η� �����͸� �о����  : read() �޼ҵ� ���
			// ��, 1byte ������ �ϳ��� �о��
			// => �ƽ�Ű�ڵ�ǥ ����
			/*
			System.out.println(fin.read());//io���ܿ����� ���� -> catch ���� 
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read()); //���Ϸκ���  ��� ���ڵ��� �о�� ����
			
			System.out.println(fin.read()); // �� �о���̴� ���� -1�� ����
			*/
			
			//�������� ���
			/*
			while(fin.read() != -1  ) {
				System.out.println(fin.read());
			}
			*/			
			//�ذ���1. ����� Ȱ���Ѱ�
			/*
			int value = 0;
			while(true) {
			
				value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);	
			}
			*/
			//�ذ���2. �Ź��� ���
			int value = 0;
			while( (value = fin.read() ) != -1 ) {
				System.out.println(value);
			}
			
			
		 } catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			//3. �� �� ��Ʈ�� �ڿ� �ݳ��ϱ� (���� �����ֱ�)
			//close() �޼ҵ� ���
			try {
				fin.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
			
		}
		  
		
	}
	
}
          







