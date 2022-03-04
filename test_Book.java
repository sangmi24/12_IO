package com.kh.test.model.vo;

import java.io.Serializable;  //이부분도 생성 
 
public class Book implements Serializable{ // 이부분 고침 : 파일로 내보내져야 하니까 직렬화 선언을 함 

	private String title;

	private String author;

	private String publisher;

	private String category;

	private int price;

	public Book() {

		super();

	}

	public Book(String title, String author, String publisher, String category, int price) {

		super();

		this.title = title;

		this.author = author;

		this.publisher = publisher;

		this.category = category;

		this.price = price;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public String getAuthor() {

		return author;

	}

	public void setAuthor(String author) {

		this.author = author;

	}

	public String getPublisher() {

		return publisher;

	}

	public void setPublisher(String publisher) {

		this.publisher = publisher;

	}

	public String getCategory() {

		return category;

	}

	public void setCategory(String category) {

		this.category = category;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {

		this.price = price;

	}

	@Override

	public String toString() {

		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", category=" + category + ", price=" + price + "]";

	}
}
