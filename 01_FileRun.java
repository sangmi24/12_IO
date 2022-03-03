package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;



public class FileRun {

	public static void main(String[] args) {
		
		// �����ϰ� ���� ����� ���� �� �޼ҵ�� ����ϴ°� ����
		// java.io.File Ŭ������ ������ �۾�
 	    
		
		try {
			//1. ������ ��� �������� ���ϸ� �����ؼ� �����غ��� 
			// => ���� �۾��ϰ� �ִ� �� ������Ʈ ���� ���� ������ ���� (�����) 
		    File file1  = new File("test.txt");
		    file1.createNewFile();
		    
		    //2. ��� ������ �� ���ϸ��� �����ؼ� �����غ���
		    //=> �����ϴ� ��η� �����ؾ� �� (�������� �������ֱ� ������ ������)
		    File file2 = new File("C:\\aaa\\test.txt"); 
		    file2.createNewFile();
		    
		    //3. ������ ����� �ű⿡ ������ ����� ����
		    File bbbFolder= new File("C:\\bbb");
	        bbbFolder.mkdir();	//������ ������ִ� �޼ҵ�(mkdir :make directory ����)
	        File file3 = new File("C:\\bbb\\test.txt");
	        file3.createNewFile();
		    
	        //4. ������ ��� ���� ���� ������ ���� �� �ű⿡ ���� �����ϱ�
	        File folder = new File("test");  //�����
	        folder.mkdir();
	        File file = new File("test\\person.txt");  //����� 
	        file.createNewFile();	     
	        
	        // File Ŭ�������� �����ϴ� �޼ҵ��
	        System.out.println("������ �½��ϱ�? : "+ folder.isFile() ); //�����̹Ƿ� false
	        System.out.println("������ �½��ϱ�? : "+ file.isFile());  //�����̹Ƿ� true
 	        
	        System.out.println("���ϸ�: "+file.getName());
	        System.out.println("��������: "+ file.getParent());
	        System.out.println("���Ͽ뷮: "+ file.length());
	        System.out.println("������: "+file.getAbsolutePath());
    
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����.");
		
	}

}
/*
 * *���α׷� ���� �����͸� �ܺθ�ü(�����, ����Ŀ, "����" ��)�� ����ϰų� 
 *  �Է���ġ�� (Ű����, ���콺,"����" ��) �� �Է¹��� ������ �����ϰ��� �Ѵٸ�
 *  �ݵ�� ���α׷��� �ܺθ�ü ������ "���"�� ������ �Ѵ�.  => "��Ʈ��"
 * 
 * *��Ʈ���� Ư¡
 * 1.�ܹ���  : �Է��̸� �Է�, ����̸� ���
 *           �Է�, ��¿� ��Ʈ���� ���� ���� ����(�Ϲ�����)
 *           ��, ���ÿ� ������� �ϰ��� �Ѵٸ� �ϳ��� ��Ʈ�����δ� �ȵ�
 * 2.���Լ���: ���� ������ ���� ���� �����ϰ� �� (First In First Out : FIFO)
 * 3.Delay : �ð� ���� ������ �߻� ������
 * 
 * *��Ʈ�� (Ŭ������ ������) ����
 * - ����� ������
 * > ����Ʈ ��Ʈ�� : 1byte¥���� �̵��� �� ���� ������ ������(���� ���)
 *   (�Է� : XXXInputStream / ���: XXXOutputStream ) 
 *   
 * > ���� ��Ʈ�� : 2byte ¥���� �̵��� �� ���� ������ ������ (���� ���)
 *   (�Է� : XXXReader / ��� : XXXWriter )
 *   
 * - �ܺθ�ü�� �������� ���� ����
 * > ��� ��Ʈ�� : �ܺ� ��ü�� ���������� ����Ǵ� ��� 
 * 
 * > ���� ��Ʈ�� : ��� ��Ʈ�� ������ ������ ������ �������ִ� �뵵�� ��Ʈ�� =>�ܵ����� ��� �Ұ�, ��ݽ�Ʈ���� �ʼ� (�ܺθ�ü�� ���� ����Ǵ� ������ �ƴ�! )
 *   (�ӵ� ���, �ڷ����� ���缭 ��ȯ�����شٰų�, ... )
 *
 */

















