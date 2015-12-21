package mhallman.methods.secant;


import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;

public class Function {
	
	private static double E = java.lang.Math.E;
	private double x;
	private DerivativeStructure f;
	private DerivativeStructure fun;
	private DerivativeStructure fun1;
	private DerivativeStructure fun2;
	private DerivativeStructure free;
	private DerivativeStructure ex;
	double minusX;
	
	
	public Function(){
	}
	
	 public static double round(double value, int places) {
		    if (places < 0) throw new IllegalArgumentException();

		    BigDecimal bd = new BigDecimal(value);
		    bd = bd.setScale(places, RoundingMode.HALF_UP);
		    return bd.doubleValue();
		}
	
	public double getDerivativeValue(double x){
		f = new DerivativeStructure(1,0, 0, E);
		this.x=x;
		this.ex = this.f.pow(round(x,3));
		this.free = this.f.pow(0);
		//function e^x - 2 - x
		this.fun1 = new DerivativeStructure(1,ex,-1,free);
		return round(fun1.getValue(),4);
	}
	
	
	double value(double x){
		f = new DerivativeStructure(1,0, 0, E);
		this.x=x;
		this.ex = this.f.pow(round(x,3));
		this.free = this.f.pow(0);
		this.minusX = -1 * x;	
		//function e^x - 2 - x
		this.fun = new DerivativeStructure(1,ex,-2,free,minusX,free);
		return round(this.fun.getValue(),4);
	}
	
	double getTangentValue(double x){
		f = new DerivativeStructure(1,0, 0, E);
		this.x=x;
		this.ex = this.f.pow(round(x,3));
		this.free = this.f.pow(0);
		this.minusX = -1 * x;	
		//function e^x - 2 - x
		this.fun2 = new DerivativeStructure(2,free,-1,ex);
		return round(this.fun2.getValue(),4);
	}

	
}
