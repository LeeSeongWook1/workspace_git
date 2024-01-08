package com.kh.chap02_beforeVSAfter.after.model.run;

import com.kh.chap02_beforeVSAfter.after.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartPhone = new SmartPhone("LG", "vega", "베가", 80000, "LG");
		System.out.println(smartPhone.information());
		
		//호출을 하는 메소드가 해당 클래스에 존재하지않으면
		//자동으로 해당 클래스의 부모클래스에 있는 메소드로 호출됨
	}

	//자식클래스에 오버라이딩(부모클래스의 메소드를 재정의)했을경우
	//자식클래스에 오버라이딩 된 메소드가 우선권을 가져서 호출이 됨!
	
	
	/*
	 * 상속의 장점
	 * 
	 * -중복된 코드를 공통으로 관리
	 * >보다 적은 양의 코드로 새로운 클라스를 만들수 있다!!
	 * 
	 * -프로그램의 생산성과 가독성과 유지보수에 크게 기여!
	 * 
	 * 상속의 특징
	 * -클래스간의 다중상속이 불가능하다 !! 단일 상속만 가능
	 * 
	 * 
	 */
}
