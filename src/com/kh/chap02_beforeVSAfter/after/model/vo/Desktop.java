package com.kh.chap02_beforeVSAfter.after.model.vo;
//자식클래스 식별자 extends 부모클래스식별자

public class Desktop extends Product {
//[필드부]
	//부모로부터 상속받은 부분을 기술하지 않는다 !!! > 필드
	
	private boolean allInOne;
	
	
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	public Desktop() {
		super();
	}
		
	
	public Desktop(String brand, String productName, String productCode, int price, boolean allInOne) {
		super(brand,productName,productCode,price);
		this.allInOne = allInOne;
	}
	
	public String information() {
		return super.information()+"올인원 여부 : "+allInOne; 
	}

	
}