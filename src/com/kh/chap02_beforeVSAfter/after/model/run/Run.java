package com.kh.chap02_beforeVSAfter.after.model.run;

import com.kh.chap02_beforeVSAfter.after.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartPhone = new SmartPhone("LG", "vega", "����", 80000, "LG");
		System.out.println(smartPhone.information());
		
		//ȣ���� �ϴ� �޼ҵ尡 �ش� Ŭ������ ��������������
		//�ڵ����� �ش� Ŭ������ �θ�Ŭ������ �ִ� �޼ҵ�� ȣ���
	}

	//�ڽ�Ŭ������ �������̵�(�θ�Ŭ������ �޼ҵ带 ������)�������
	//�ڽ�Ŭ������ �������̵� �� �޼ҵ尡 �켱���� ������ ȣ���� ��!
	
	
	/*
	 * ����� ����
	 * 
	 * -�ߺ��� �ڵ带 �������� ����
	 * >���� ���� ���� �ڵ�� ���ο� Ŭ�󽺸� ����� �ִ�!!
	 * 
	 * -���α׷��� ���꼺�� �������� ���������� ũ�� �⿩!
	 * 
	 * ����� Ư¡
	 * -Ŭ�������� ���߻���� �Ұ����ϴ� !! ���� ��Ӹ� ����
	 * 
	 * 
	 */
}
