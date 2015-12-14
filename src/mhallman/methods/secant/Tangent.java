package mhallman.methods.secant;

public class Tangent {
	
	private double startingPoint;
	private int stepNumber;
	private double functionResult;
	private double result;
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
	
	public void solveTangent(double startingPoint, int stepNumber) {
		for(int i=0; i<stepNumber; i++) {
			functionResult = startingPoint - Math.pow(function.getFun1(),-1) * function.value(startingPoint);
			startingPoint = functionResult;
			System.out.println(functionResult);
		}
	}
}
