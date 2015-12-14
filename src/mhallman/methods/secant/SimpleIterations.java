package mhallman.methods.secant;

public class SimpleIterations {
	private double startingPoint;
	private int stepNumber;

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
	public double solveIteration(int stepNumber, double startingPoint) {
		for(int i=0; i<stepNumber; i++) {
			
			/*TO-DO solving function with attached library
			
			functionResult = solvingOurFunction(startingPoint);
			startingPoint = functionResult;
			tableWithResults[i] = functionResult; 
			
			*/
		}
		//return tableWithResults[];
	}
}
