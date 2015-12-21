package mhallman.methods.secant;

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
		if(zeroValue>=x0 && zeroValue<=x1){
			mainZeroValue = zeroValue;
		}
		else if(zeroValue1>=x0 && zeroValue1<=x1 && mainZeroValue!=0){
			System.out.println("B³¹d");
			System.exit(0);
		}else if(zeroValue1>=x0 && zeroValue1<=x1){
			mainZeroValue = zeroValue1;
		}
		System.out.println("Wybrane miejsce zerowe: "+mainZeroValue);
		//while(mainZeroValue-wysranyWynikZFora>0.1)
		nextValues = new double[100];
		//for(int i=0;i<this.getIterations();i++){
		do{
			x2=this.nextValue(x0,x1);
			x0=x1;
			x1=x2;
			nextValues[i]=x2;
			i++;
			System.out.println("Kolejny wynik: "+x2);
		}while(mainZeroValue-x2>0.1);
		System.out.println("Potrzeba by³o tyle: "+i+" obrotów");
	}
	
	
}
