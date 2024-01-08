package com.kh.chap02_beforeVSAfter.after.model.vo;

/*
 * ���
 * 
 * ������ Ŭ������ �̿��ؼ� ���ο� Ŭ������ ����� == ���
 * 
 * �� Ŭ�������� , �ߺ��� �ʵ�, �޼ҵ���� �� �ѹ� �ϳ��� Ŭ����(�θ�Ŭ����)��
 * �����ص� �� �ش� Ŭ������ ����� ������ ���°���
 * 
 */
public class Product {
//����Ǵ� �ʵ�

	// �ʵ�� : brand, productName, productCode, price

	protected String brand;
	private String productName;
	private String productCode;
	private int price;

	// �����ں�

	public Product() {
System.out.println("�ȳ� ���� �θ�Ŭ������");
	}

	public Product(String brand, String productName, String productCode, int price) {
		this.brand = brand;
		this.productName = productName;
		this.productCode = productCode;
		this.price = price;
	}

	// �޼ҵ��

	public String getBrand() {
		return brand;

	}

	public String getProductName() {
		return productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		String inform = "�귣�� : " + brand + "��ǰ��  : " + productName + "��ǰ�ڵ� : " + productCode + "��ǰ����  : " + price ;
		return inform;
	}
}
