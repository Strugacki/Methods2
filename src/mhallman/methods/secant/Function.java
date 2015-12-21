package mhallman.methods.secant;


import java.lang.Math;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;

public class Function {
	
	private static double E = java.lang.Math.E;
	private double x;
	private DerivativeStructure f;
	private DerivativeStructure fun;
	private DerivativeStructure fun1;
	private DerivativeStructure free;
	private DerivativeStructure ex;
	double minusX;
	
	
	public Function(){
	}
	
	
	public double getDerivativeValue(double x){
		f = new DerivativeStructure(1,0, 0, E);
		this.x=x;
		this.ex = this.f.pow(java.lang.Math.round(x));
		this.free = this.f.pow(0);
		//function e^x - 2 - x
		this.fun1 = new DerivativeStructure(1,ex,-1,free);
		return fun1.getValue();
	}
	
	
	double value(double x){
		System.out.println("Wesz³o");
		f = new DerivativeStructure(1,0, 0, E);
		this.x=x;
		this.ex = this.f.pow(java.lang.Math.round(x));
		this.free = this.f.pow(0);
		this.minusX = -1 * x;	
		//function e^x - 2 - x
		this.fun = new DerivativeStructure(1,ex,-2,free,minusX,free);
		return this.fun.getValue();
	}

	
}
