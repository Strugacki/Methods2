package mhallman.methods.secant;

public class Secant {

	private double ps;//starting point
	private double pk;//ending point
	private Function function;
	
	public Secant(){
		Function function = new Function();
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
		double value = (x1 - (this.function.value(x1)*(x1-x0))/(this.function.value(x1)-this.function.value(x0)));
		return value;
	}
	
	
}
