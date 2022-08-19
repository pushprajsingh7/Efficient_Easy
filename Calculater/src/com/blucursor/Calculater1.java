package com.blucursor;

/**
 * implentaion of calculater interface with method body
 * 
 * @author ss
 *
 */
public class Calculater1 implements Calculater {
	public void add(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(res);
	}

	public void substract(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(res);
	}

	public void multiply(int num1, int num2) {
		int res = num1 * num2;
		System.out.println(res);
	}

	public void divide(int num1, int num2) {
		int res = num1 / num2;
		System.out.println(res);
	}
}