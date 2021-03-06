package mathematics;

import exceptions.MathsExceptions;
import interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int soustraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		int resultat = 0; 
		if(b > 0) {
			for (int i = 0; i < b; i++) {
				resultat = addition(resultat, a);
			}
		} else {
			for (int i = 0; i < -b; i++) {
				resultat = addition(resultat, -a);
			}
		}
		return resultat;
	}

	@Override
	public double division(int a, int b) throws MathsExceptions{
		if(b == 0) {
			throw new MathsExceptions("Division par zéro impossible");
		}
		try {
			return a/b;
		}catch (Exception e){
			throw new MathsExceptions(e.getMessage());
		}

	}
}
