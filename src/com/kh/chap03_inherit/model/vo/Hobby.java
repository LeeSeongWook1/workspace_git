package com.kh.chap03_inherit.model.vo;

public class Hobby extends Object {

	// 모든 클래스의 최상위 부모클래스는 Object => 생략가능
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
	 * 오버라이딩 (overriding) 상속받고있는 부모클래스의 메소드를 자식클래스에서 재작성하는것 부모클래스가 제공하고있는 메소드를 자식이일부
	 * 고쳐서 사용하겠다느 의미 자식클래스의 오버라이딩 된 메소드가 우선권을 가져서 호출이 됨
	 * 
	 * 오버라이딩의 성립조건! 1. 부모메소드의 메소드명과 동일 2. 매개변수의 자료형과 개수 순서가 동일(매개변수명과는 무관) 3. 반환형이
	 * 동일
	 * 
	 * 
	 * 
	 * >>규약의 개념 1. 오버라이딩한 메소드에는 @Override 애노테이션을 붙여주자 2.
	 * 
	 * 
	 * @Override 애노테이션(annotation) 일종의 주석 -생략가능 >굳이 적지않더라도 부모메소드와 형태가 같다면 오버라이딩한것으로
	 * 판단
	 * 
	 * 왜붙이나? >실수를 줄일 수 있다.
	 * 
	 * 2. 부모메소드의 접근제한자보다 공유범위가 같거나 넓어야함
	 * 
	 * 
	 * 
	 */

	@Override
	public String toString() {
		return "Hobby[name = " + name + "]";
	}
}
