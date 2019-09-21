package kalkulator;

public class GlavniProgram {

	public static void main(String[] args) {
		Calculator calc= new Calculator();
		
		double result= calc.add(5).div(2).mul(20.5).add(-5).value();
		
		System.out.println(result);
	}

}
