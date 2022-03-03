package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	// BufferedReader �Է� / BufferedWriter ���
	
	// ���α׷� --> �ܺθ�ü (����)
	// ��� BufferedWriter
	public void fileSave() {
		
		//0. ��ü ���� �� null �� �ʱ�ȭ
		BufferedWriter bw = null;
		FileWriter fw=null;
		
		//1)io���� ->try-catch
		try { // 1,2���� ��� ����� 
			//1.��ݽ�Ʈ�� ��ü ���� (������Ʈ�� ��ü�� ����� ���� �غ�)
			 fw= new FileWriter("c_buffer.txt");
			 
			//2. ������Ʈ�� ��ü ����(�ܵ����� ���� �Ұ�)  // ���� �߰� ��
			 bw = new BufferedWriter( fw );
			 
			// 3. ���Ϸ� ������ �������� : BufferedWriter Ŭ������ �ִ�  write() �޼ҵ� ���
			 bw.write("�ȳ��ϼ���.");
			 //bw.write("\n");
			 bw.newLine(); //�ڵ����� ������ �־��ִ� �޼ҵ� 
			 bw.write("�ݰ����ϴ�.\n");
			 bw.write("����������.");
			 
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//3.�� �� ��Ʈ�� �ڿ� �ݳ� : �ڿ� �ݳ��� ������ ��ü ������ ����
			//2) ���� -> try/catch
		}
		
		
	}
	// ���α׷� <-- �ܺθ�ü (����)
	// �Է� (BufferedReader)
	public void fileRead() {
		/*
		//0. �ڿ��ݳ��� ���� ���� �� �ʱ�ȭ
		BufferedReader br=null;
		
		
		try {
			//1.������Ʈ����ü�� ����(�Ű������� ��ݵ� �����ؼ� ��ť�� �־��)
			br= new BufferedReader(new FileReader("c_buffer.txt"));
			
			//2. �����͸� ���Ϸκ��� �о�鿩���� : readLine() �޼ҵ�  (���� ������ ����� �ۼ���)
			 System.out.println(br.readLine());
			 System.out.println(br.readLine());
			 System.out.println(br.readLine());
			 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. �ڿ� �ݳ�
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		//try~ with ~ resource ����(jdk7���� ���� ��� ����)
		/*
		 * [ ǥ���� ]
		 * try(��Ʈ����ü��������; ��ü��������) {
		 *     //���ܰ� �߻��ҹ��� ����
		 * } catch (���ܼ��� ����){
		 *    // ���� �߻��� ������ ����
		 * }
		 * => ���� ū ������ �˾Ƽ� �ڿ� �ݳ��� �ȴ�. (finally �Ⱦ�)
		 */
		
		try(BufferedReader br=new BufferedReader(new FileReader("c_buffer.txt"))){
		    
			//�Է¹޴� ������ �� �ۼ��ϸ� ��
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
