package com.kh.chap02_beforeVSAfter.after.model.vo;
//�ڽ�Ŭ���� �ĺ��� extends �θ�Ŭ�����ĺ���

public class Desktop extends Product {
//[�ʵ��]
	//�θ�κ��� ��ӹ��� �κ��� ������� �ʴ´� !!! > �ʵ�
	
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
		return super.information()+"���ο� ���� : "+allInOne; 
	}

	
}