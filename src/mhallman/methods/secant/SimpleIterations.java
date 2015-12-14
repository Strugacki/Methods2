package mhallman.methods.secant;

public class SimpleIterations {
	private double startingPoint;
	private int stepNumber;
	private double functionResult;
	private double result;
	private Function function = new Function();

	public int getStepNumber() {
		return stepNumber;
	}

	public void setStepNumber(int stepNumber) {
		this.stepNumber = stepNumber;
	}

	public double getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(double startingPoint) {
		this.startingPoint = startingPoint;
	}	
	public void solveIteration(int stepNumber, double startingPoint) {
		for(int i=0; i<stepNumber; i++) {
						
			functionResult = function.value(startingPoint);
			startingPoint = functionResult;
			result = functionResult; 
			System.out.println(result);
		}
	}
}
