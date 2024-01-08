package com.kh.chap01_beforeVSafter.before.model.vo;
//부모클래스 자식클래스
//조상클래스 후손클래스
//슈퍼클래스 서브클래스
//상위클래스 하위클래스
//확장클래스 파생클래스
public class SmartPhone {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	// 생성자
	public SmartPhone() {

	}

	public SmartPhone (String brand, String pCode, String pName, int price , String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}
	public String information() {
		String inform = "브랜드 : " + brand + "상품코드  : " + pCode + "상품명 : " + pName + "상품가격  : " + price + "통신사 : "
				+ mobileAgency;
		return inform;
	}
}
