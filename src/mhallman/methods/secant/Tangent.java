package mhallman.methods.secant;

public class Tangent {
	
	private double startingPoint;
	private int stepNumber;
	private double functionResult;
	private Function function = new Function();
	public double getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(double startingPoint) {
		this.startingPoint = startingPoint;
	}
	public int getStepNumber() {
		return stepNumber;
	}
	public void setStepNumber(int stepNumber) {
		this.stepNumber = stepNumber;
	}
	
	public void solveTangent() {
		for(int i=0; i<stepNumber; i++) {
			functionResult = startingPoint - (function.value(startingPoint) / function.getDerivativeValue(startingPoint));
			startingPoint = functionResult;
			System.out.println("Kolejny wynik: "+functionResult);
		}
	}
}
