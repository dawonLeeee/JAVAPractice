package edu.kh.poly.ex2.model.vo;

public class LDWCalculator implements Calculator{

	@Override
	public double areaOfCircle(double r) {
		
		return 2 * PI * r;
	}
	
	@Override
	public double divide(int num1, int num2) {
		
		return num1 * 1.0 / num2;
	}
	
	@Override
	public int minus(int num1, int num2) {
		
		return num1 - num2;
	}
	
	@Override
	public int multiple(int num1, int num2) {
		
		return num1 * num2;
	}
	
	@Override
	public int plus(int num1, int num2) {
		
		return num1 + num2;
	}
	
	@Override
	public double pow(double a, int b) {
		return Math.pow(a, b);
		
	}
}
