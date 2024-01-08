package com.kh.chap02_beforeVSAfter.after.model.vo;

public class Tv extends Product{
	//�ʵ��
	private int inch;
	
	//�����ں�
	public Tv() {}
	
	//��� �ʵ忡 ���� �Ű����� ������
	public Tv(String brand, String productName, String productCode, int price , int inch) {
		//�θ� �������ִ� �ʵ峪 �޼ҵ忡 �����Ϸ��� �Ҷ��� ?? super
		//super.brand = brand; ���������ڸ� private => ���� �Ұ�
		//�ذ��� 1. �θ��� private >protected �� �ٲ��ش�
		// �ذ��� 2. �θ��� stter �޼ҵ带 ȣ���ؼ� �ʱ�ȭ�Ѵ٤� super.set�ʵ��̸�(���ڰ�)
		//�ذ���3. �θ��� ��� �Ű������� �ִ� �����ڸ� super Ű���带 �̿��ؼ� ȣ�� > �ʱ�ȭ�� ���� super(���ڰ�)
		super(brand,productName,productCode,price);
		this.inch = inch;
		
	}

}
