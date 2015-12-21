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
	public void solveIteration() {
		for(int i=0; i<stepNumber; i++) {		
			functionResult = function.getTangentValue(startingPoint);
			startingPoint = functionResult;
			System.out.println("Kolejny wynik: "+startingPoint);
		}
	}
}
