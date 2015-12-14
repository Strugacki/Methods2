package mhallman.methods.secant;


import java.lang.Math;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;

public class Function {
	
	private static double E = java.lang.Math.E;
	private double x;
	private DerivativeStructure f;
	private DerivativeStructure fun;
	private DerivativeStructure free;
	private DerivativeStructure ex;
	double minusX;
	
	
	public Function(){
		f = new DerivativeStructure(1,0, 0, E);
		ex = f.pow(java.lang.Math.round(x));
		free = f.pow(0);
		minusX = -1 * x;	
		//function e^x - 2 - x
		fun = new DerivativeStructure(1,ex,-2,free,minusX,free);
	}
	
	
	double value(double x){
		this.x=x;
		return this.fun.getValue();
	}
	
}
