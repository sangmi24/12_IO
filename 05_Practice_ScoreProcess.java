package com.hw2.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScoreProcess { 
		
	//�л����� ����,����,���� ������ �Է��ϸ� ���հ� �����
	//���Ͽ� �����ϴ� �޼ҵ�
	Scanner sc = new Scanner(System.in);
	
	public void scoreSave() {
		
	  int num = 0;  //�л��� ������ ����
	  //try with resource�������� "score.dat"���Ͽ� ����ǰ�
	  //DateOutputStream ��   FileOutputStream�� ����
	  //output�� ��� 	
	  // ���� ��ݽ�Ʈ���� �����Ѵ�.
	  FileOutputStream fos= null;
	  //������Ʈ���� �����Ѵ�.
	  DataOutputStream dos = null;
	  
	  try{
		dos=new DataOutputStream(new FileOutputStream("score.dat"));
		  		  
		while(true) {			
			System.out.println("===== ������ �������� �Է��Ͻÿ�. =====");
			System.out.print("����: ");  //int kor
			int kor=sc.nextInt();
			sc.nextLine();
			System.out.print("����: ");  //int eng
			int eng=sc.nextInt();
			sc.nextLine();
			System.out.print("����: ");  //int math
			int math=sc.nextInt();
			sc.nextLine();
			//sum(int)�� avg(double)�� ���� �� �� 
			int sum= kor+eng+math;
			double avg = sum/3 ;
		  
			double avgS = 0.0;
			
			//���� �����͵� ������� ���Ͽ� ���
			dos.writeInt(kor); //write Int�� ������ �ʾҴ�.  
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			//dos.writeDouble(avgS);
			//avgS += avg;
			
			num++;
			
			//n��° �л� ���� ��� ���
			System.out.println(num+"��° �л� ���� ���");
			
			//Scanner sc = new Scanner(System.in);
			System.out.print("��� �����Ͻðڽ��ϱ�?(y/n) :");
			
			char answer =sc.nextLine().toUpperCase().charAt(0); 
			if(answer =='Y') {
				continue;
			}
		    else if(answer =='N')
			System.out.println("score.dat ���Ͽ� ���� �Ϸ�");
			break;
		}		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			dos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}		
	}
	
	//����� ������ ���� �о�ͼ� �� �л��� 
	//���� ������ ���� ����� �����
	public void scoreRead() {
	  
		int kor=0, eng=0, mat=0, sum=0;
		double avg=0.0, avgS=0.0;
		
		//avgS -> ��� �л����� ���� ����� ���ϴ� ����
		
		int count=0 ; //�� ���� �л�����, or �ݺ����� ����� Ƚ��(�� �� ���� ����)
		
		
		//try with resource ������ �̿��Ͽ� (DataInputStream, FileInputStream)
		//"score.dat" ���ϰ� ������� ����� �ְ�
		DataInputStream dis = null;
		FileInputStream fis = null;
		
		// dos=new DataOutputStream(new FileOutputStream("score.dat"));
		try {
		 //1.������Ʈ����ü ����	
		 dis=new DataInputStream(new FileInputStream("score.dat"));
				 
		while(true) {
			//2.�����Ϳ� �Էµ� ������� readxxx() �޼ҵ带 ���� �о�� ����
			//���� (kor, eng, mat, sum, avg)�� ��� ���
			//�׸��� avgS�� �ش� �л��� avg�� �߰�
		   
			
			kor=dis.readInt();
			eng=dis.readInt();
			mat=dis.readInt();
			sum=dis.readInt();
			avg=dis.readDouble();
			//avgS=dis.readDouble();
			avgS += avg;
			
			count++;
			
			
			//"count��° �л�" ���
			System.out.println(count +"��° �л�");
			//"��   ��   ��    ����   ��� " ���
			System.out.println("��   ��   ��   ����   ���");
			System.out.println(kor+ " "+eng+ " "+mat+ " "+sum+ " "+avg);
			
		
		}
		//EOFException�� �߻��ϸ�,
		//"���� Ƚ�� ��ü ���" ���
		//�����͸� ���� Ƚ��(count), ��ü ���(avgS)��
		//���� ������ ���� ���� �Ʒ��� ��µǰ� ��
		//"score.dat ���� �б� �Ϸ�!" ���� ���				 
		}
		catch (Exception e) {
			
			System.out.println("���� Ƚ�� , ��ü ��� ");
			System.out.println(" "+count +"    "+ (avgS/count) );
			System.out.println("score.dat ���� �б� �Ϸ�!");
		 }
		}
	}
	
	

