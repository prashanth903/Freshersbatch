package com.app.aop;

public class Shape {
private Triangle triangle;
private Circle circle;

public Triangle getTriangle() {
	return triangle;
}
public void setTriangle(Triangle triangle) {
	this.triangle = triangle;
}
public Circle getCircle() {
	System.out.println("circle getter called");
	return circle;
}
public void setCircle(Circle circle) {
	this.circle = circle;
}

}
