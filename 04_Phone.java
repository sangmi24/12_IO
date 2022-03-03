package com.kh.chap04_assist.part02_Object.model.vo;

import java.io.Serializable;

// ��ü ������ ������ ����� �غ��ڴٶ�� ���� : ����ȭ ����
public class Phone implements Serializable {

	//�ʵ��
	private String name;
	private int price;
	
	//�����ں�
	public Phone() {
		super();
	}
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	//�޼ҵ��
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
}
