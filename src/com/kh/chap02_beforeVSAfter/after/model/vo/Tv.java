package com.kh.chap02_beforeVSAfter.after.model.vo;

public class Tv extends Product{
	//필드부
	private int inch;
	
	//생성자부
	public Tv() {}
	
	//모든 필드에 대한 매개변수 생성자
	public Tv(String brand, String productName, String productCode, int price , int inch) {
		//부모가 가지고있는 필드나 메소드에 접근하려고 할때는 ?? super
		//super.brand = brand; 접근제한자를 private => 접근 불가
		//해결방법 1. 부모의 private >protected 로 바꿔준다
		// 해결방법 2. 부모의 stter 메소드를 호출해서 초기화한다ㅣ super.set필드이릅(인자값)
		//해결방법3. 부모의 모든 매개변수가 있는 생성자를 super 키워드를 이요해서 호출 > 초기화를 진행 super(인자값)
		super(brand,productName,productCode,price);
		this.inch = inch;
		
	}

}
