package com.kh.chap04_assist.part02_Object.model.vo;

import java.io.Serializable;

// 객체 단위로 파일을 입출력 해보겠다라고 선언 : 직렬화 선언
public class Phone implements Serializable {

	//필드부
	private String name;
	private int price;
	
	//생성자부
	public Phone() {
		super();
	}
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	//메소드부
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
