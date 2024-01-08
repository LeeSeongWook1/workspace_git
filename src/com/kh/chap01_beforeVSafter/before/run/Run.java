package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		// brand, pName, pCode, price, allInOne
		Desktop desktop = new Desktop("DIY", "����ǻŸ", "c-101", 1500000, false);

		// brand, pName, pCode, price, inch
		Tv tv = new Tv("LG", "���뼿TV", "n-tv", 8000000, 80);

		// brand, pName, pCode, price, mobileAgency
		SmartPhone smartPhone = new SmartPhone("LG", "vega", "����", 80000, "LG");

		System.out.println(desktop.information());
		System.out.println(tv.information());
		System.out.println(smartPhone.information());
		
		/*
		 * �� Ŭ�������� �ߺ��� �ڵ���� �ϳ��ϳ� ����ϰԵǸ�
		 * �ڵ��� ������ ���� �������� �� ���� �Ѷ��Ѷ� ã�ư��鼭 �ؾ��� ���ŷο�
		 * 
		 * ����̶�� ������ ������Ѽ�
		 * ��Ŭ�������� �ߺ��� �ʵ�, �޼ҵ����
		 * ���ϳ��� Ŭ���� �� ����� ���� ���Ǹ� �صΰ�
		 * �ش� �θ�Ŭ������ �Ӽ� ������ ��ӹ޾Ƽ� �����پ������·� ����
		 * 
		 * 
		 * 
		 */
	}

}
