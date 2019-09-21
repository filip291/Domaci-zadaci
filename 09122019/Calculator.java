package kalkulator;

public class Calculator {
	private double value;

	public Calculator add(double x) {
		value += x;
		return this;
	}

	public Calculator sub(double x) {
		value -= x;
		return this;
	}

	public Calculator mul(double x) {
		value *= x;
		return this;
	}

	public Calculator div(double x) {
		if (x != 0) {
			value /= x;
		}
		return this;
	}

	public double value() {
		return value;
	}
}
