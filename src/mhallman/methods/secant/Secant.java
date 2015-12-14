package mhallman.methods.secant;

public class Secant {

	private double ps;//starting point
	private double pk;//ending point
	
	
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
	
	
	public double nextValue(double fx0,double fx1, double x0, double x1){
		return x1 - ( (fx1 * (x1-x0))/( (fx1 - fx0) ));
	}
	
	
	
}
