package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		// brand, pName, pCode, price, allInOne
		Desktop desktop = new Desktop("DIY", "내콤퓨타", "c-101", 1500000, false);

		// brand, pName, pCode, price, inch
		Tv tv = new Tv("LG", "나노셀TV", "n-tv", 8000000, 80);

		// brand, pName, pCode, price, mobileAgency
		SmartPhone smartPhone = new SmartPhone("LG", "vega", "베가", 80000, "LG");

		System.out.println(desktop.information());
		System.out.println(tv.information());
		System.out.println(smartPhone.information());
		
		/*
		 * 매 클래스마다 중복된 코드들을 하나하나 기술하게되면
		 * 코드의 수정과 같은 유지보수 시 전부 한땀한땀 찾아가면서 해야함 번거로움
		 * 
		 * 상속이라는 개념을 적용시켜서
		 * 매클래스마다 중복된 필드, 메소드들을
		 * 단하나의 클래스 로 만들어 놓고 정의를 해두고
		 * 해당 부모클래스의 속성 행위를 상속받아서 가져다쓰는형태로 진행
		 * 
		 * 
		 * 
		 */
	}

}
