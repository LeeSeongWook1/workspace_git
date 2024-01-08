package com.kh.chap03_inherit.model.run;

import com.kh.chap03_inherit.model.vo.Motorcycle;
import com.kh.chap03_inherit.model.vo.Snowboard;
import com.kh.chap03_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		Motorcycle motorcycle = new Motorcycle("할리데이비슨", "할리", 20, true, true);
		Snowboard snowboard = new Snowboard("보드1", "눈에서 타는거", 0, true, 100);
		Vehicle v = new Vehicle("탈것", "뭐야이게", 0, false);

		motorcycle.howToMove();
		snowboard.howToMove();
		v.howToMove();

		System.out.println(v);
		System.out.println(v.toString());
		System.out.println(motorcycle);
		System.out.println(snowboard);
	}
}
