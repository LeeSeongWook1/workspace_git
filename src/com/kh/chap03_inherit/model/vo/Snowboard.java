package com.kh.chap03_inherit.model.vo;

public class Snowboard extends Vehicle{
	private int height;
	
	
	public Snowboard() {}
	public Snowboard(String name, String kind, int tire, boolean auto, int height) {
		super(name,kind,tire,auto);
		this.height=height;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}

	public void howToMove() {
		System.out.println("´« À§¿¡¼­ ¹Ì²ô·¯Áü~~");
	}
}
