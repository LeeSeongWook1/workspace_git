package com.kh.chap03_inherit.model.vo;

public class Motorcycle extends Vehicle {

	private boolean license;

	public Motorcycle() {
	}

	public Motorcycle(String name, String kind, int tire, boolean auto, boolean license) {
		super(name, kind, tire, auto);
		this.license = license;
	}
	public boolean isLicense() {
		return license;
	}
	public void setLicense(boolean license) {
		this.license=license;
	}
	
	public void howToMove() {
		System.out.println("¹ÙÄûµÎ°³·Î ±¼·¯°¨");
	}
}

