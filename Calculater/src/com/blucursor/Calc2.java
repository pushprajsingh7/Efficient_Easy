package com.blucursor;

/**
 * program to delimit the given string in individual numbers by operation sign
 * 
 * @author ss
 *
 */
class Calculater2 extends Calculater1 {
	static int num1;
	static int num2;

	public void calculate(String str) {
		String[] splt = str.split("[+-/*]");
		String a = splt[0];
		String b = splt[1];
		num1 = Integer.parseInt(a);
		num2 = Integer.parseInt(b);
	}
}
