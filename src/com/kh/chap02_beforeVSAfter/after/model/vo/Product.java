package com.kh.chap02_beforeVSAfter.after.model.vo;

/*
 * 상속
 * 
 * 기존의 클래스를 이용해서 새로운 클래스를 만든다 == 상속
 * 
 * 매 클래스마다 , 중복된 필드, 메소드들을 단 한번 하나의 클래스(부모클래스)로
 * 정의해둔 후 해당 클래스의 멤버를 가져다 쓰는개념
 * 
 */
public class Product {
//공통되는 필드

	// 필드부 : brand, productName, productCode, price

	protected String brand;
	private String productName;
	private String productCode;
	private int price;

	// 생성자부

	public Product() {
System.out.println("안녕 나는 부모클래스야");
	}

	public Product(String brand, String productName, String productCode, int price) {
		this.brand = brand;
		this.productName = productName;
		this.productCode = productCode;
		this.price = price;
	}

	// 메소드부

	public String getBrand() {
		return brand;

	}

	public String getProductName() {
		return productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		String inform = "브랜드 : " + brand + "상품명  : " + productName + "상품코드 : " + productCode + "상품가격  : " + price ;
		return inform;
	}
}
