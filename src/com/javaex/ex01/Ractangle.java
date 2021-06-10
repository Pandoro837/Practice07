package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
//	메소드 겟터셋터			- ShapeApp에서 가로길이를 호출하기 위해 생성
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

//	추상 클래스를 상속하고 있으면서 추상 메소드와 같은(오버라이딩 할)메소드를 갖지 않았기 때문에
//	오류가 발생했다. showInfo의 메소드명을 draw로 바꿔서 해결
	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}

}


