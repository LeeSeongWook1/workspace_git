package com.kh.chap03_inherit.model.vo;

public class Vehicle extends Object{
	
	private String name;
	private String kind;
	private int tire;
	private boolean auto;
	
	public Vehicle() {}
	public Vehicle(String name, String kind, int tire, boolean auto) {
		this.name = name;
		this.kind = kind;
		this.tire = tire;
		this.auto = auto;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public boolean isAuto() {
		return auto;
	}
	public void setAuto(boolean auto) {
		this.auto = auto;
	}

	public void howToMove() {
		System.out.println("±º∑Ø∞®");
	}
	
	public String toString() {
		return "≈ª∞Õ¡§∫∏ ";
	}
	
}
