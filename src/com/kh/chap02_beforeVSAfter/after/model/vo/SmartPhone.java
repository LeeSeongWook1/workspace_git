package com.kh.chap02_beforeVSAfter.after.model.vo;

public class SmartPhone extends Product{

	
	//필드부
	//brand,productName, productCode, price, mobileAgency
	//Product클래스로부터 상속받을것
	
	private String mobileAgency;
	
	//생성자부
	public SmartPhone() {
		super();
		System.out.println("안녕 나는 자식클래스 스마트폰이야");
	}
	public SmartPhone(String brand,String productCode, String productName, int price, String mobileAgency) {
//		this.brand=brand;
//		super
//		super.brand = brand;
		//접근제한자가 private 이기 떄문에 보이지 않음
		//해결방법 3가지
		//해결방법 1. 부모클래스의 접근제한자를 변경하는 방법 protected 로
		//
		//super.brand = brand;
		//캡슐화 원칙x => 적합한 방법은 x
		//해결방법 2. 부모클래스에 있는 public 접근제한자의 setter 메소드를 호출한다.
		
//		super.setBrand(brand);
//		super.setProductName(productName);
//		super.setProductCode(productCode);
//		super.setPrice(price);
		
		//해결방법 3. 부모클래스의 매개변수 생성자를 호출한다.
		super(brand, productName, productCode, price);
		this.mobileAgency=mobileAgency;
		//순서조심
		
	}
	
	
	
	//메소드부
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency=mobileAgency;
	}
}
