package com.kh.chap03_inherit.model.vo;

public class Hobby extends Object {

	// ��� Ŭ������ �ֻ��� �θ�Ŭ������ Object => ��������
	private String name;

	public Hobby() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * �������̵� (overriding) ��ӹް��ִ� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� ���ۼ��ϴ°� �θ�Ŭ������ �����ϰ��ִ� �޼ҵ带 �ڽ����Ϻ�
	 * ���ļ� ����ϰڴٴ� �ǹ� �ڽ�Ŭ������ �������̵� �� �޼ҵ尡 �켱���� ������ ȣ���� ��
	 * 
	 * �������̵��� ��������! 1. �θ�޼ҵ��� �޼ҵ��� ���� 2. �Ű������� �ڷ����� ���� ������ ����(�Ű���������� ����) 3. ��ȯ����
	 * ����
	 * 
	 * 
	 * 
	 * >>�Ծ��� ���� 1. �������̵��� �޼ҵ忡�� @Override �ֳ����̼��� �ٿ����� 2.
	 * 
	 * 
	 * @Override �ֳ����̼�(annotation) ������ �ּ� -�������� >���� �����ʴ��� �θ�޼ҵ�� ���°� ���ٸ� �������̵��Ѱ�����
	 * �Ǵ�
	 * 
	 * �ֺ��̳�? >�Ǽ��� ���� �� �ִ�.
	 * 
	 * 2. �θ�޼ҵ��� ���������ں��� ���������� ���ų� �о����
	 * 
	 * 
	 * 
	 */

	@Override
	public String toString() {
		return "Hobby[name = " + name + "]";
	}
}
