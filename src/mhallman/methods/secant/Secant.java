package mhallman.methods.secant;

public class Secant {

	private double ps;//starting point
	private double pk;//ending point
	double fx1;
	double fx0;
	double zeroValue=-1.8414;
	double zeroValue1=1.1462;
	private Function function;
	private int iterations;
	private double nextValues[];
	


	public Secant(){
		function = new Function();
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
		return value;
	}
	
	public void solveSecant(){
		double x0=this.getPs();
		double x1=this.getPk();
		nextValues = new double[this.getIterations()];
		for(int i=0;i<this.getIterations();i++){
			double x2=this.nextValue(x0,x1);
			x0=x1;
			x1=x2;
			nextValues[i]=x2;
			System.out.println("Kolejny wynik: "+x2);
		}
	}
	
	
}
