package com.kh.chap02_beforeVSAfter.after.model.vo;

public class SmartPhone extends Product{

	
	//�ʵ��
	//brand,productName, productCode, price, mobileAgency
	//ProductŬ�����κ��� ��ӹ�����
	
	private String mobileAgency;
	
	//�����ں�
	public SmartPhone() {
		super();
		System.out.println("�ȳ� ���� �ڽ�Ŭ���� ����Ʈ���̾�");
	}
	public SmartPhone(String brand,String productCode, String productName, int price, String mobileAgency) {
//		this.brand=brand;
//		super
//		super.brand = brand;
		//���������ڰ� private �̱� ������ ������ ����
		//�ذ��� 3����
		//�ذ��� 1. �θ�Ŭ������ ���������ڸ� �����ϴ� ��� protected ��
		//
		//super.brand = brand;
		//ĸ��ȭ ��Ģx => ������ ����� x
		//�ذ��� 2. �θ�Ŭ������ �ִ� public ������������ setter �޼ҵ带 ȣ���Ѵ�.
		
//		super.setBrand(brand);
//		super.setProductName(productName);
//		super.setProductCode(productCode);
//		super.setPrice(price);
		
		//�ذ��� 3. �θ�Ŭ������ �Ű����� �����ڸ� ȣ���Ѵ�.
		super(brand, productName, productCode, price);
		this.mobileAgency=mobileAgency;
		//��������
		
	}
	
	
	
	//�޼ҵ��
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency=mobileAgency;
	}
}
