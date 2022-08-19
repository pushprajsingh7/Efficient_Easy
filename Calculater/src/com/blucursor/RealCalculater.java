package com.blucursor;

public class RealCalculater extends Calculater2 {

	public static void main(String[] args) {
		Calculater2 calculater2object = new Calculater2();

		String equation = "7*7";

		calculater2object.calculate(equation);

		if (equation.contains("+")) {
			calculater2object.add(num1, num2);
		} else if (equation.contains("-")) {
			calculater2object.substract(num1, num2);
		} else if (equation.contains("*")) {
			calculater2object.multiply(num1, num2);
		} else if (equation.contains("/")) {
			calculater2object.divide(num1, num2);
		}

	}

}
