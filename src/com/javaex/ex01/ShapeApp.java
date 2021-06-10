package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강"); Shape 클래스는 추상 클래스로, 객체를 생성할 수 없는 클래스이다.
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
//		하향 형변화로 sr1의 getWidth를 불러와서 출력
		System.out.println("sr1의 가로는 " + ((Ractangle)sr1).getWidth() + "입니다.");
		
	}
}

	
	