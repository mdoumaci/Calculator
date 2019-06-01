package ma.ac.insea.calculator.implementations;

import ma.ac.insea.calculator.interfaces.ICalculator;

public class CalculatorImpl implements ICalculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		if(b>0){
			while(b-- >0){
				a++;
				
			}
			return a;
		}
		else
			if(a > 0){
				while(a-- > 0){
					b++;
					
				}
				return b;
			}
			else
				while(b++ < 0){
						a--;
					}
		return a;
	}

	@Override
	public int substact(int a, int b) {
		// TODO Auto-generated method stub
		return  add(a,b);
	}

	@Override
	public float divide(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
