package mhallman.methods.secant;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Secant {

	private double ps;//starting point
	private double pk;//ending point
	double fx1;
	double fx0;
	double x2;
	int i=0;
	double zeroValue= -1.8414;
	double zeroValue1= 1.1462;
	double mainZeroValue=0;
	private Function function;
	private int iterations;
	private double nextValues[];
	


	public Secant(){
		function = new Function();
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public int getIterations() {
		return iterations;
	}


	public void setIterations(int iterations) {
		this.iterations = iterations;
	}
	
	/**
	 * @return the ps
	 */
	public double getPs() {
		return ps;
	}
	/**
	 * @param ps the ps to set
	 */
	public void setPs(double ps) {
		this.ps = ps;
	}
	/**
	 * @return the pk
	 */
	public double getPk() {
		return pk;
	}
	/**
	 * @param pk the pk to set
	 */
	public void setPk(double pk) {
		this.pk = pk;
	}
	
	
	
	public double nextValue(double x0, double x1){
		fx1=this.function.value(x1);
		fx0=this.function.value(x0);
		double value = (x1 - (fx1*(x1-x0))/(fx1-fx0));
		return round(value,3);
	}
	
	public void solveSecant(){
		double x0=this.getPs();
		double x1=this.getPk();
		nextValues = new double[100];
		do{
			x2=this.nextValue(x0,x1);
			x0=x1;
			x1=x2;
			nextValues[i]=x2;
			i++;
			System.out.println("Kolejny wynik: "+x2);
		}while(mainZeroValue-x2>0.001);
		System.out.println("Potrzeba by³o tyle: "+i+" obrotów");
	}


	public double getMainZeroValue() {
		return mainZeroValue;
	}


	public void setMainZeroValue(double mainZeroValue) {
		this.mainZeroValue = mainZeroValue;
	}
	
	
}
